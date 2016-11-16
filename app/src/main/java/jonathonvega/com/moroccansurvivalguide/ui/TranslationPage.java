package jonathonvega.com.moroccansurvivalguide.ui;

import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import jonathonvega.com.moroccansurvivalguide.R;

public class TranslationPage extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_phrase_details, container, false);
        TextView tv = (TextView)v.findViewById(R.id.detailsEnglishText);
        //tv.setText

        return v;
    }
}
