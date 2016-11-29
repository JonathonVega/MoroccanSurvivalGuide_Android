package jonathonvega.com.moroccansurvivalguide.ui;

import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import jonathonvega.com.moroccansurvivalguide.R;

public class TranslationPage extends Fragment {

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

        Log.d("kdklfj", mEnglishWord);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_phrase_details, container, false);
        TextView englishLabel = (TextView) v.findViewById(R.id.englishTranslation);
        TextView arabicLabel = (TextView) v.findViewById(R.id.arabicTranslation);

        englishLabel.setText(mEnglishWord);
        arabicLabel.setText(mArabicWord);

        return v;
    }
}
