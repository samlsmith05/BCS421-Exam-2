package com.example.bcs421exam2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> info = new ArrayList<>();
    private RecyclerView recyclerView;
    private InfoAdapter mAdapter;
    private Button mAddButton;
    private EditText mMajorEditText;
    private EditText mFirstEditText;
    private EditText mLastEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstEditText = findViewById(R.id.editTextFirst);
        mLastEditText = findViewById(R.id.editTextLast);
        mMajorEditText = findViewById(R.id.editTextMajor);
        mAddButton = findViewById(R.id.buttonAddStudent);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewInfo);
        mAdapter = new InfoAdapter(info);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        info.add(new Student("Rose", "Diaz", "Computer Systems"));
        info.add(new Student("John", "Smith", "Biology"));

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = mFirstEditText.getText().toString();
                String last = mLastEditText.getText().toString();
                String major = mMajorEditText.getText().toString();

                info.add(new Student(first, last, major));

            }
        });

        mAdapter.notifyDataSetChanged();

    }
}
