package android.myproject.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    String items[]=new String[]{"Android" , "IPhone", "Windows","Bluckberry","Linux"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView Mylist=(ListView) findViewById(R.id.Mylist);
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        Mylist.setAdapter(adapter);
        Mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this,items[position], Toast.LENGTH_SHORT).show();
                openListActivity();

            }
        });
    }

    private void openListActivity() {
        Intent intent= new Intent(this,DescriptionActivity.class);
        startActivity(intent);

    }
}
