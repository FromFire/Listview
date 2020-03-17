package com.example.listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListView();
    }

    public void initListView() {
        final String name[] = {
                "20161707", "20161713", "20171591", "20171592", "20171616",
                "20171627", "20171641", "20171649", "20171650", "20171653",
                "20171654", "20171655", "20171656", "20171659", "20171664",
                "20171666", "20171667", "20171668", "20171669", "20171670",
                "20171679", "20171688", "20171697", "20171705", "20171707",
                "20171714", "20171717", "20171731", "20171742", "20175064",
                "20175980", "20175990"
        };
        List<StudentItem> list = new ArrayList<StudentItem>();

        for(int i=0; i<name.length; i++) {
            String imageFileName = "emoji_kids-";
            if(i+2 < 10)
                imageFileName += "0" + (i+2);
            else
                imageFileName += (i+2);
            list.add(new StudentItem(name[i],
                    getResources().getIdentifier(imageFileName, "drawable", getPackageName())));
        }
    }
}
