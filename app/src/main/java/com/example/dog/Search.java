package com.example.dog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final Names names = new Names();
        SearchView search = findViewById(R.id.search);
        final ListView list = findViewById(R.id.list);
        Button button_submit3=findViewById(R.id.button_submit3);
        ImageView imageview_dog3=findViewById(R.id.imageview_dog3);
        Button button_stop=findViewById(R.id.button_stop);


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(Search.this, android.R.layout.simple_list_item_1, names.nameArray);
        list.setAdapter(adapter);

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if(names.nameArray.equals(s)){
                    adapter.getFilter().filter(s);
                }else{
                    Toast.makeText(Search.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }


        });
    }
}
