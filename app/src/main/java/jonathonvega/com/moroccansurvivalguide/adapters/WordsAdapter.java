package jonathonvega.com.moroccansurvivalguide.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import jonathonvega.com.moroccansurvivalguide.R;
import jonathonvega.com.moroccansurvivalguide.model.MSG_Phrases;
import jonathonvega.com.moroccansurvivalguide.model.Section;

/**
 * Created by jonathonfvega on 10/25/16.
 */
public class WordsAdapter extends BaseAdapter {

    private Context context;
    private MSG_Phrases allPhrases;
    private String currentSection;
    private String[][] currentWordList;

    public WordsAdapter(Context context, MSG_Phrases allPhrases, String currentSection) {
        this.context = context;
        this.allPhrases = allPhrases;
        this.currentSection = currentSection;
        getPhraseArray();
    }

    @Override
    public int getCount() {
        return currentWordList.length;
    }

    @Override
    public Object getItem(int position) {
        return currentWordList[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.phrase_item, null);
            holder = new ViewHolder();
            holder.englishTranslation = (TextView) convertView.findViewById(R.id.englishText_List);
            holder.arabicTranslation = (TextView) convertView.findViewById(R.id.arabicText_List);

            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        String englishWord = currentWordList[position][0];
        String arabicWord = currentWordList[position][1];

        holder.englishTranslation.setText(englishWord);
        holder.arabicTranslation.setText(arabicWord);

        return convertView;
    }

    private static class ViewHolder {
        TextView englishTranslation;
        TextView arabicTranslation;
    }



    private void getPhraseArray() {
        for(int i = 0; i < 17; i++) {
            Section[] phraseList = allPhrases.getPhraseList();
            if(currentSection.equals(phraseList[i].getSection())){
                currentWordList = phraseList[i].getWords();
            }
        }
    }
}
