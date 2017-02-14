package jonathonvega.com.moroccansurvivalguide.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import jonathonvega.com.moroccansurvivalguide.R;
import jonathonvega.com.moroccansurvivalguide.model.MSG_Phrases;


public class MainActivity extends ListActivity {
    MSG_Phrases dictionary = new MSG_Phrases();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setDisplayShowHomeEnabled(false);

        String[] dictionarySections = dictionary.getSectionNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                dictionarySections);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String sectionClickedFromList = l.getItemAtPosition(position).toString();

        Intent intent = new Intent(this, WordListActivity.class);
        intent.putExtra("curSection", sectionClickedFromList);
        startActivity(intent);
    }
}
