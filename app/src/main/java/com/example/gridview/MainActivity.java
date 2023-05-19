package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Android Development", R.drawable.logo));
        courseModelArrayList.add(new CourseModel("Internet of Things", R.drawable.logo));
        courseModelArrayList.add(new CourseModel("Cloud Computing", R.drawable.logo));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.logo));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.logo));
        courseModelArrayList.add(new CourseModel("Mobile Computing", R.drawable.logo));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}