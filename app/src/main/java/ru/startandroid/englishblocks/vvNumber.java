package com.example.vlad.englishblocks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class vvNumber extends Activity implements View.OnClickListener {
    Button btn[] = new Button[10];
    EditText edit;
    String word = "";
    int sq = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numberlayout);

        EditText editText = (EditText) (findViewById(R.id.editText));

        btn[0] = (Button)findViewById(R.id.button);
        btn[0].setOnClickListener(this);
        btn[1] = (Button)findViewById(R.id.button2);
        btn[1].setOnClickListener(this);
        btn[2] = (Button)findViewById(R.id.button3);
        btn[2].setOnClickListener(this);
        btn[3] = (Button)findViewById(R.id.button4);
        btn[3].setOnClickListener(this);
        btn[4] = (Button)findViewById(R.id.button5);
        btn[4].setOnClickListener(this);
        btn[5] = (Button)findViewById(R.id.button6);
        btn[5].setOnClickListener(this);
        btn[6] = (Button)findViewById(R.id.button7);
        btn[6].setOnClickListener(this);
        btn[7] = (Button)findViewById(R.id.button8);
        btn[7].setOnClickListener(this);
        btn[8] = (Button)findViewById(R.id.button9);
        btn[8].setOnClickListener(this);
        btn[9] = (Button)findViewById(R.id.back);
        btn[9].setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        edit = (EditText) (findViewById(R.id.editText));
        String nn = edit.getText().toString();
        nn.toLowerCase();

        switch (v.getId()){

            case R.id.back:
                Intent intent4 = new Intent(this, Bubbles.class);
                startActivity(intent4);break;

            case R.id.button:
                word = "one";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[0].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button2:
                word = "two";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[1].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button3:
                word = "three";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[2].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button4:
                word = "four";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[3].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button5:
                word = "five";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[4].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button6:
                word = "six";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[5].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button7:
                word = "seven";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[6].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button8:
                word = "eight";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[7].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button9:
                word = "nine";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[8].setClickable(false);
                    edit.setText("");
                }
                break;default:
                edit.requestFocus();
                break;
        }

        if(sq == 9){
            sq = 0;
            Intent intent = new Intent(this, Bubbles.class);
            startActivity(intent);
        }
    }
}
