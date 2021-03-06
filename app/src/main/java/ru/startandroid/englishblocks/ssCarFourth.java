package com.example.vlad.englishblocks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ssCarFourth extends Activity implements View.OnClickListener {
    String word = "";
    EditText edit;
    short sq = 0;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ssfourthlayout);

        EditText editText = (EditText) (findViewById(R.id.editText));

        Button imageButton1 = (Button) (findViewById(R.id.imageButton));
        imageButton1.setOnClickListener(this);
        Button imageButton2 = (Button) (findViewById(R.id.imageButton2));
        imageButton2.setOnClickListener(this);
        Button imageButton3 = (Button) (findViewById(R.id.imageButton3));
        imageButton3.setOnClickListener(this);
        Button btn = (Button) (findViewById(R.id.back));
        btn.setOnClickListener(this);

        ImageView img1 = (ImageView) (findViewById(R.id.lamp2));
        ImageView img2 = (ImageView) (findViewById(R.id.lamp3));
        ImageView img3 = (ImageView) (findViewById(R.id.lamp4));
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

            case R.id.imageButton:
                word = "tail-pipe";
                if (word.equals(nn)) {
                    v.setVisibility(View.INVISIBLE);
                    imageView = (ImageView) (findViewById(R.id.lamp2));
                    imageView.setVisibility(View.VISIBLE);
                    edit.setText("");
                    sq++;
                }
                break;

            case R.id.imageButton2:
                word = "headlight";
                if (word.equals(nn)) {
                    v.setVisibility(View.INVISIBLE);
                    imageView = (ImageView) (findViewById(R.id.lamp3));
                    imageView.setVisibility(View.VISIBLE);
                    edit.setText("");
                    sq++;
                }
                break;

            case R.id.imageButton3:
                word = "gas-tank";
                if (word.equals(nn)) {
                    v.setVisibility(View.INVISIBLE);
                    imageView = (ImageView) (findViewById(R.id.lamp4));
                    imageView.setVisibility(View.VISIBLE);
                    edit.setText("");
                    sq++;
                }
                break;

            default:
                edit.requestFocus();
                break;
        }

        if(sq == 3){
            sq = 0;
            Intent intent = new Intent(this, Bubbles.class);
            startActivity(intent);
        }
    }
}