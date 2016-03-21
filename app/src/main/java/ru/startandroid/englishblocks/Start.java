package com.example.vlad.englishblocks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends Activity implements View.OnClickListener {
    Button btn[] = new Button[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startlayout);

        btn[0] = (Button)findViewById(R.id.start);
        btn[0].setOnClickListener(this);

        btn[1] = (Button)findViewById(R.id.rules);
        btn[1].setOnClickListener(this);

        btn[2] = (Button)findViewById(R.id.about);
        btn[2].setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.start:
                Intent intent = new Intent(this, Bubbles.class);
                startActivity(intent);break;

            case R.id.rules:
                Intent intent1 = new Intent(this, Rules.class);
                startActivity(intent1);break;

            case R.id.about:
                Intent intent2 = new Intent(this, About.class);
                startActivity(intent2);break;
        }
    }
}
