package com.goncharov.anton.gameilyin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Control control = new Control(this);
        setContentView(control);
    }


}
