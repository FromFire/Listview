package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentInfo extends AppCompatActivity {

    TextView name;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        name = findViewById(R.id.name);
        image = findViewById(R.id.image);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        image.setImageResource( intent.getIntExtra("imageId", 0));
    }
}
