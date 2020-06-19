package com.example.lolflashtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    boolean midCosmicChecked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox midCheckbox = (CheckBox) findViewById(R.id.MidCosmicCheckbox);
        Button startBtn = (Button) findViewById(R.id.startBtn);

        midCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    midCosmicChecked = true;
                }
                else {
                    midCosmicChecked = false;
                }
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTimers = new Intent(getApplicationContext(), Timers.class);
                goToTimers.putExtra("com.example.lolflashtimer.MID_COSMIC_CHECKED", midCosmicChecked);
                startActivity(goToTimers);
            }
        });
    }
}
