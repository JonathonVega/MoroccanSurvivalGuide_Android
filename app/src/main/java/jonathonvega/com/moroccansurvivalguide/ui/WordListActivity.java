package jonathonvega.com.moroccansurvivalguide.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import jonathonvega.com.moroccansurvivalguide.adapters.WordsAdapter;
import jonathonvega.com.moroccansurvivalguide.model.MSG_Phrases;
import jonathonvega.com.moroccansurvivalguide.R;
import jonathonvega.com.moroccansurvivalguide.model.Section;


public class WordListActivity extends ListActivity {

    private MSG_Phrases mAllPhrases;
    private String[][] mCurrentPhrases;
    private String mCurrentSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        mAllPhrases = new MSG_Phrases();

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null) {
            String currentSection = (String) bd.get("curSection");
            mCurrentSection = currentSection;
        }

        setTitle(mCurrentSection);
        getActionBar().setDisplayShowHomeEnabled(false);

        // setupAdapter(mCurrentSection);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        WordsAdapter adapter = new WordsAdapter(this, mAllPhrases, mCurrentSection);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String wordClickedFromList = position + "";
        System.out.println(wordClickedFromList);

        Intent intent = new Intent(this, TranslationPagerActivity.class);
        intent.putExtra("currentSection", mCurrentSection);
        intent.putExtra("currentWord", position);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return false;
    }




    /*public void setupAdapter(String sectionName) {
        for(int i = 0; i < 11; i++) {
            Section[] phraseList = mAllPhrases.getPhraseList();
            if(mCurrentSection.equals(phraseList[i].getSection())){
                mCurrentPhrases = phraseList[i].getWords();
            }
        }

        String[] englishWords = createEnglishArray();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                englishWords);
        setListAdapter(adapter);
    }*/




    public String[] createEnglishArray() {
        String[] englishTranslations = new String[mCurrentPhrases.length];
        for(int i = 0; i < mCurrentPhrases.length; i ++) {
            englishTranslations[i] = mCurrentPhrases[i][0];
        }
        return englishTranslations;
    }



}
