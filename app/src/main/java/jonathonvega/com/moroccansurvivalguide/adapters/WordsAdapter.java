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

    private Context mContext;
    private MSG_Phrases mAllPhrases;
    private String mCurrentSection;
    private String[][] mCurrentWordList;

    public WordsAdapter(Context context, MSG_Phrases allPhrases, String currentSection) {
        mContext = context;
        mAllPhrases = allPhrases;
        mCurrentSection = currentSection;
        getPhraseArray();
    }

    @Override
    public int getCount() {
        return mCurrentWordList.length;
    }

    @Override
    public Object getItem(int position) {
        return mCurrentWordList[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            // brand new
            convertView = LayoutInflater.from(mContext).inflate(R.layout.phrase_item, null);
            holder = new ViewHolder();
            holder.englishTranslation = (TextView) convertView.findViewById(R.id.fdkajl);
            holder.arabicTranslation = (TextView) convertView.findViewById(R.id.arabicText);

            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        String englishWord = mCurrentWordList[position][0];
        String arabicWord = mCurrentWordList[position][1];

        holder.englishTranslation.setText(englishWord);
        holder.arabicTranslation.setText(arabicWord);

        return convertView;
    }

    private static class ViewHolder {
        TextView englishTranslation;
        TextView arabicTranslation;
    }



    private void getPhraseArray() {
        for(int i = 0; i < 11; i++) {
            Section[] phraseList = mAllPhrases.getPhraseList();
            if(mCurrentSection.equals(phraseList[i].getSection())){
                mCurrentWordList = phraseList[i].getWords();
            }
        }
    }
}
