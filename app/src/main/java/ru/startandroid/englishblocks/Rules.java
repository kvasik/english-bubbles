package com.example.vlad.englishblocks;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rules extends Activity implements View.OnClickListener {
    Button btn[] = new Button[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ruleslayout);

        btn[0] = (Button)(findViewById(R.id.back));
        btn[0].setOnClickListener(this);
        btn[1] = (Button)(findViewById(R.id.btn1));
        btn[1].setOnClickListener(this);
        btn[2] = (Button)(findViewById(R.id.btn2));
        btn[2].setOnClickListener(this);
        btn[3] = (Button)(findViewById(R.id.btn3));
        btn[3].setOnClickListener(this);
        btn[4] = (Button)(findViewById(R.id.btn4));
        btn[4].setOnClickListener(this);
        btn[5] = (Button)(findViewById(R.id.btn5));
        btn[5].setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.back:
                Intent intent4 = new Intent(this, Start.class);
                startActivity(intent4);
                break;
            case R.id.btn1:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1R-hIlE2QaGvgvH4e8_gfwAQccoS_B8PF0nffXhL_dtw/edit?usp=docslist_api"));
                startActivity(browserIntent);
                break;
            case R.id.btn2:
                Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1-6DzZaiturskEfJnpr9WTpp3GL6h72nGN6lKAKDD8iI/edit?usp=docslist_api"));
                startActivity(browserIntent2);
                break;
            case R.id.btn3:
                Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1ONLwU5FXi2fdkH3OUqI8CJyqD-HUVI3sIKBHyWTHfHA/edit?usp=docslist_api"));
                startActivity(browserIntent3);
                break;
            case R.id.btn4:
                Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1WV7ii6wyJKdR8f47JmktWRRIZybcGH1GmUQ1s3jefzo/edit?usp=docslist_api"));
                startActivity(browserIntent4);
                break;
            case R.id.btn5:
                Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1BmG1rULFmsgqZjNqo0Z2RNEPB5y57eqbfEhOA1SEMr8/edit?usp=docslist_api"));
                startActivity(browserIntent5);
                break;
        }
        }
}
