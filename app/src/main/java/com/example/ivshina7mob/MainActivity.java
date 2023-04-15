package com.example.ivshina7mob;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button searchButton;
    private TextView result;
    private LinearLayout log;
    private EditText first;
    private EditText third;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        searchButton = findViewById(R.id.button);
        result = findViewById(R.id.result);
        log = findViewById(R.id.lala);
        first = findViewById(R.id.first);


        View.OnClickListener onClickListener = view -> {
            result.setText("кнопка была нажата");
        };
        searchButton.setOnClickListener(onClickListener);

    }
}