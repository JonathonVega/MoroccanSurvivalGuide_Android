package jonathonvega.com.moroccansurvivalguide.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import jonathonvega.com.moroccansurvivalguide.R;
import jonathonvega.com.moroccansurvivalguide.model.MSG_Phrases;
import jonathonvega.com.moroccansurvivalguide.model.Section;

/**
 * Created by jonathonfvega on 11/9/16.
 */

public class TranslationPagerActivity extends FragmentActivity {

    private String[][] mSectionWords;
    private String mSection;
    private int mCurrentWord;

    FragmentPagerAdapter adapterViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation_page);
        editNav();
        getIntents();
        ViewPager pager = (ViewPager) findViewById(R.id.Pager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapterViewPager);
        pager.setCurrentItem(mCurrentWord);
    }

    private void getIntents() {
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null) {
            String currentSection = (String) bd.get("currentSection");
            mSection = currentSection;
            System.out.println(mSection);
        }

        MSG_Phrases phrases = new MSG_Phrases();
        Section[] sections = phrases.getPhraseList();
        for(int i = 0; i <= 17; i++) {

            // Check what is coming out
            System.out.println(sections[i].getSection());

            if(sections[i].getSection().equals(mSection)) {
                mSectionWords = sections[i].getWords();
                break;
            }
        }

        int currentWord = bd.getInt("currentWord");
        mCurrentWord = currentWord;
        System.out.println(mCurrentWord);
    }

    private void editNav() {
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setDisplayShowHomeEnabled(false);
    }


    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return mSectionWords.length;
        }

        @Override
        public Fragment getItem(int pos) {
            if(pos < getCount()){
                return TranslationPage.newInstance(mSectionWords[pos][0], mSectionWords[pos][1]);
            } else {
                return null;
            }
        }

    }
}
