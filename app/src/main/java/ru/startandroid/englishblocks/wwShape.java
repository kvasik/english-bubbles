package com.example.vlad.englishblocks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class wwShape extends Activity implements View.OnClickListener {
    Button btn[] = new Button[6];
    EditText edit;
    String word = "";
    int sq = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shapeslayout);

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
        btn[5] = (Button)findViewById(R.id.back);
        btn[5].setOnClickListener(this);
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
                word = "square";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[0].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button2:
                word = "circle";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[1].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button3:
                word = "polygon";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[2].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button4:
                word = "rhombus";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[3].setClickable(false);
                    edit.setText("");
                }
                break;

            case R.id.button5:
                word = "triangle";
                if (word.equals(nn)) {
                    sq++;
                    Toast.makeText(this,sq +" correct",Toast.LENGTH_SHORT).show();
                    btn[4].setClickable(false);
                    edit.setText("");
                }
                break;

            default:
                edit.requestFocus();
                break;
        }

        if(sq == 5){
            sq = 0;
            Intent intent = new Intent(this, Bubbles.class);
            startActivity(intent);
        }
    }
}
