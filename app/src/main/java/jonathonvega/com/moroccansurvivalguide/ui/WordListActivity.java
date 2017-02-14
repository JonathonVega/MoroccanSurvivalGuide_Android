package jonathonvega.com.moroccansurvivalguide.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import jonathonvega.com.moroccansurvivalguide.adapters.WordsAdapter;
import jonathonvega.com.moroccansurvivalguide.model.MSG_Phrases;
import jonathonvega.com.moroccansurvivalguide.R;


public class WordListActivity extends ListActivity {

    private MSG_Phrases mAllPhrases;
    private String[][] mCurrentPhrases;
    private String currentSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        mAllPhrases = new MSG_Phrases();

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null) {
            String currentSection = (String) bd.get("curSection");
            this.currentSection = currentSection;
        }

        setTitle(currentSection);
        getActionBar().setDisplayShowHomeEnabled(false);

        // setupAdapter(currentSection);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        WordsAdapter adapter = new WordsAdapter(this, mAllPhrases, currentSection);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String wordClickedFromList = position + "";

        Intent intent = new Intent(this, TranslationPagerActivity.class);
        intent.putExtra("currentSection", currentSection);
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

    public String[] createEnglishArray() {
        String[] englishTranslations = new String[mCurrentPhrases.length];
        for(int i = 0; i < mCurrentPhrases.length; i ++) {
            englishTranslations[i] = mCurrentPhrases[i][0];
        }
        return englishTranslations;
    }



}
