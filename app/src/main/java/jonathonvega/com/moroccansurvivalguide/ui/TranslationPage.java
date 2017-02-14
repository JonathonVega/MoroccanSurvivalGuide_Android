package jonathonvega.com.moroccansurvivalguide.ui;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import jonathonvega.com.moroccansurvivalguide.R;

public class TranslationPage extends Fragment {
    private MediaPlayer player;

    private String mEnglishWord;
    private String mArabicWord;

    public static TranslationPage newInstance(String englishWord, String arabicWord) {
        TranslationPage translationPage = new TranslationPage();
        Bundle args = new Bundle();
        args.putString("englishWord", englishWord);
        args.putString("arabicWord", arabicWord);
        translationPage.setArguments(args);
        return translationPage;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mEnglishWord = getArguments().getString("englishWord");
        mArabicWord = getArguments().getString("arabicWord");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_phrase_details, container, false);

        fillOutLabels(v);

        addSound(v);

        return v;
    }

    private void fillOutLabels(View v) {
        TextView englishLabel = (TextView) v.findViewById(R.id.englishTranslation);
        TextView arabicLabel = (TextView) v.findViewById(R.id.arabicTranslation);

        englishLabel.setText(mEnglishWord);
        arabicLabel.setText(mArabicWord);
    }

    private void addSound(View vw) {
        ImageButton soundButton = (ImageButton) vw.findViewById(R.id.soundButton);
        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = formatArabicString(mArabicWord);
                int soundId = getResources().getIdentifier(word, "raw", getActivity().getPackageName());

                stopPlaying();
                player = MediaPlayer.create(getActivity(), soundId);
                //player.start();
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        stopPlaying();
                    }
                });
                player.start();
            }
        });
    }

    // Helper Methods

    private void stopPlaying() {
        if (player != null) {
            player.release();
            player = null;
        }
    }

    private String formatArabicString(String word) {
        String formattedWord = word;
        formattedWord = formattedWord.toLowerCase();
        if(Character.isDigit(formattedWord.charAt(0))) {
            formattedWord = "s" + formattedWord;
        }
        formattedWord = formattedWord.replaceAll("\\s+", "_");
        formattedWord = formattedWord.replaceAll("/","_");
        formattedWord = formattedWord.replaceAll("'", "");
        formattedWord = formattedWord.replaceAll("[()]", "");
        formattedWord = formattedWord.replaceAll("\\.", "");
        formattedWord = formattedWord.replaceAll("\\?", "");

        return formattedWord;
    }
}