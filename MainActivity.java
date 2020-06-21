package com.example.lolflashtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    boolean topCosmicChecked;
    boolean jungleCosmicChecked;
    boolean midCosmicChecked;
    boolean supportCosmicChecked;
    boolean botCosmicChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox topCheckbox = (CheckBox) findViewById(R.id.TopCosmicCheckbox);
        CheckBox jungleCheckbox = (CheckBox) findViewById(R.id.JungleCosmicCheckbox);
        CheckBox midCheckbox = (CheckBox) findViewById(R.id.MidCosmicCheckbox);
        CheckBox supportCheckbox = (CheckBox) findViewById(R.id.SupportCosmicCheckbox);
        final CheckBox botCheckBox = (CheckBox) findViewById(R.id.BotCosmicCheckbox);

        Button startBtn = (Button) findViewById(R.id.startBtn);

        topCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    topCosmicChecked = true;
                }
                else {
                    topCosmicChecked = false;
                }
            }
        });

        jungleCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    jungleCosmicChecked = true;
                }
                else {
                    jungleCosmicChecked = false;
                }
            }
        });

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

        supportCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    supportCosmicChecked = true;
                }
                else {
                    supportCosmicChecked = false;
                }
            }
        });

        botCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    botCosmicChecked = true;
                }
                else {
                    botCosmicChecked = false;
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
