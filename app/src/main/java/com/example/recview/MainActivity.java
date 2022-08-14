package com.example.recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=(RecyclerView)findViewById(R.id.rclView);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String arr[]={"C", "C++", "JAVA", "PHP", "NET", "JQUERY", "JSCRIPT", "REACTJS", "PYTHON", "KOTLIN",};
        rcv.setAdapter(new myAdapter(arr));
    }
}