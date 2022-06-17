package com.raeb.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_mainActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_input);

        Button btninput = (Button) findViewById(R.id.btninput);
        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
