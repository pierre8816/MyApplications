package com.example.android.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonMoive = (Button) findViewById(R.id.buttonMoive);
        buttonMoive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Context context = getApplicationContext();
                CharSequence text = "启动应用：热门电影";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });



        final Button buttonShares = (Button) findViewById(R.id.buttonShares);
        buttonShares.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Context context = getApplicationContext();
                CharSequence text = "启动应用：股票雄鹰";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });


        final Button buttonReader = (Button) findViewById(R.id.buttonReader);
        buttonReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Context context = getApplicationContext();
                CharSequence text = "启动应用：XYZ阅读器";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });


        final Button buttonNews = (Button) findViewById(R.id.buttonNews);
        buttonNews.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Context context = getApplicationContext();
                CharSequence text = "启动应用：最新闻";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });


        final Button buttonFinalProject = (Button) findViewById(R.id.buttonFinalProject);
        buttonFinalProject.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Context context = getApplicationContext();
                CharSequence text = "启动应用：毕业设计";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });



    }
}
