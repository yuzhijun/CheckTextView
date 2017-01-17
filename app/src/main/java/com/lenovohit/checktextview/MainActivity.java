package com.lenovohit.checktextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CheckTextView ctvHospital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctvHospital = (CheckTextView) findViewById(R.id.ctvHospital);

        ctvHospital.setChecked(true);
    }
}
