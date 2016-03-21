package com.example.vlad.englishblocks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ssCar extends Activity implements View.OnClickListener {
    String word = "";
    EditText edit;
    short sq = 0;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ssfirstlayout);

        EditText editText = (EditText) (findViewById(R.id.editText));

        Button btn = (Button) (findViewById(R.id.back));
        btn.setOnClickListener(this);

        Button imageButton2 = (Button) (findViewById(R.id.imageButton5));
        imageButton2.setOnClickListener(this);

        ImageView img = (ImageView) (findViewById(R.id.lamp2));
        }

    @Override
    public void onClick(View v) {
        edit = (EditText) (findViewById(R.id.editText));

        String nn = edit.getText().toString();
        nn.toLowerCase();

        switch (v.getId()) {

            case R.id.back:
                Intent intent4 = new Intent(this, Bubbles.class);
                startActivity(intent4);break;


            case R.id.imageButton5:
                word = "car";
                if (word.equals(nn)) {
                    v.setVisibility(View.INVISIBLE);
                    imageView = (ImageView) (findViewById(R.id.lamp2));
                    imageView.setVisibility(View.VISIBLE);
                    edit.setText("");
                    sq++;
                }
                break;

            default:
                edit.requestFocus();
                break;
        }

        if(sq == 1){
            sq = 0;
            Intent intent = new Intent(this, ssCarSecond.class);
            startActivity(intent);
        }
    }
}