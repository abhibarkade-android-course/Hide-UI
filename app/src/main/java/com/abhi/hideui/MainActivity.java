package com.abhi.hideui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        TextView txt = findViewById(R.id.txt_name);

        ImageView icon = (ImageView) view;

        if (txt.getVisibility() == View.GONE) {
            txt.setVisibility(View.VISIBLE);
            icon.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_up));
        } else {
            txt.setVisibility(View.GONE);
            icon.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_down));
        }
    }

    public void showPhone(View view) {
        TextView txt = findViewById(R.id.txt_phone);

        ImageView icon = (ImageView) view;

        if (txt.getVisibility() == View.GONE) {
            txt.setVisibility(View.VISIBLE);
            icon.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_up));
        } else {
            txt.setVisibility(View.GONE);
            icon.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_down));
        }
    }
}