package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<StudentItem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        initListView();
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, StudentInfo.class);
                intent.putExtra("imageId", list.get(position).getImageId());
                intent.putExtra("name", list.get(position).getName());
                startActivity(intent);
            }
        });
    }

    public void initListView() {
        final String name[] = new String[] {
                "20161707", "20161713", "20171591", "20171592", "20171616",
                "20171627", "20171641", "20171649", "20171650", "20171653",
                "20171654", "20171655", "20171656", "20171659", "20171664",
                "20171666", "20171667", "20171668", "20171669", "20171670",
                "20171679", "20171688", "20171697", "20171705", "20171707",
                "20171714", "20171717", "20171731", "20171742", "20175064",
                "20175980", "20175990"
        };
        list = new ArrayList<>();
        for(int i=0; i<name.length; i++) {
            String imageFileName = "emoji_kids_";
            if(i+2 < 10)
                imageFileName += "0" + (i+2);
            else
                imageFileName += (i+2);
            //Log.i("picture", imageFileName);
            //Log.i("picture", "" + getResources().getIdentifier(imageFileName, "drawable", getPackageName()));
            list.add(new StudentItem(name[i],
                    getResources().getIdentifier(imageFileName, "drawable", getPackageName())));
        }

        StudentAdapter adapter = new StudentAdapter(MainActivity.this, R.layout.list_item, list);
        listView.setAdapter(adapter);
    }
}
