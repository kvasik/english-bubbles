package com.example.vlad.englishblocks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends Activity implements View.OnClickListener {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        btn = (Button)(findViewById(R.id.back));
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent4 = new Intent(this, Start.class);
        startActivity(intent4);
        }
}
