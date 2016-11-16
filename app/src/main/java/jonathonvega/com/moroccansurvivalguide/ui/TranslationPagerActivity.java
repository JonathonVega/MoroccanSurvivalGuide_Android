package jonathonvega.com.moroccansurvivalguide.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import jonathonvega.com.moroccansurvivalguide.model.MSG_Phrases;
import jonathonvega.com.moroccansurvivalguide.model.Section;

/**
 * Created by jonathonfvega on 11/9/16.
 */

public class TranslationPagerActivity extends FragmentActivity {

    private ViewPager mViewPager;
    private String[][] mSectionWords;
    private String mSection;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewPager = new ViewPager(this);
        setContentView(mViewPager);

        /*FragmentManager fm = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fm) {
            @Override
            public Fragment getItem(int position) {
                Crime crime = mCrimes.get(position);
                return CrimeFragment.newInstance(crime.getId());
            }*/

    }






    private void getIntents() {
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null) {
            String currentSection = (String) bd.get("currentSection");
            mSection = currentSection;
        }

        MSG_Phrases phrases = new MSG_Phrases();
        Section[] sections = phrases.getPhraseList();
        for(int i = 0; i < 11; i++) {
            if(sections[i].getSection().equals(mSection)) {
                mSectionWords = sections[i].getWords();
            }
        }
    }






}
