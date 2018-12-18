package com.testtravis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView labelTV;
    private Button clickButton;
    private EditText inputET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindingView();
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inputET.getText().toString().trim().isEmpty()) {
                    labelTV.setText(inputET.getText().toString());
                } else {
                    labelTV.setText("Input is empty");
                }
            }
        });
    }

    private void bindingView() {
        labelTV = findViewById(R.id.labelTV);
        clickButton = findViewById(R.id.clickButton);
        inputET = findViewById(R.id.inputET);
    }
}
