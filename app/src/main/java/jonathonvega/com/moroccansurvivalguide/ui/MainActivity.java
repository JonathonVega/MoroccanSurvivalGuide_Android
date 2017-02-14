package jonathonvega.com.moroccansurvivalguide.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import jonathonvega.com.moroccansurvivalguide.R;


public class MainActivity extends ListActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setDisplayShowHomeEnabled(false);

        String[] MSG_Sections = {
                "Greetings",
                "Family",
                "House",
                "Street",
                "Food",
                "Numbers",
                "Money",
                "Cities/Sites",
                "Shopping",
                "Useful Questions",
                "Useful Expressions",
                "Travel",
                "Medical",
                "Party/Festivities",
                "Weather",
                "Days of the Week",
                "Possessions"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                MSG_Sections);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String sectionClickedFromList = l.getItemAtPosition(position).toString();

        Log.d("WORKING",sectionClickedFromList);
        System.out.println(sectionClickedFromList);

        Intent intent = new Intent(this, WordListActivity.class);
        intent.putExtra("curSection", sectionClickedFromList);
        startActivity(intent);
    }
}
