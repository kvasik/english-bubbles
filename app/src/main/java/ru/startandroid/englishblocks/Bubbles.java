package com.example.vlad.englishblocks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bubbles extends Activity implements View.OnClickListener {
    Button btn[] = new Button[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bubbleslayout);

        btn[0] = (Button)findViewById(R.id.car);
        btn[0].setOnClickListener(this);

        btn[1] = (Button)findViewById(R.id.colors);
        btn[1].setOnClickListener(this);

        btn[2] = (Button)findViewById(R.id.numbers);
        btn[2].setOnClickListener(this);

        btn[3] = (Button)findViewById(R.id.shapes);
        btn[3].setOnClickListener(this);

        btn[4] = (Button)findViewById(R.id.back);
        btn[4].setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.car:
                Intent intent = new Intent(this, ssCar.class);
                startActivity(intent);break;

            case R.id.colors:
                Intent intent1 = new Intent(this, ccColor.class);
                startActivity(intent1);break;

            case R.id.numbers:
                Intent intent2 = new Intent(this, vvNumber.class);
                startActivity(intent2);break;

            case R.id.shapes:
                Intent intent3 = new Intent(this, wwShape.class);
                startActivity(intent3);break;

            case R.id.back:
                Intent intent4 = new Intent(this, Start.class);
                startActivity(intent4);break;
        }
        }
}
