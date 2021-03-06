package com.kemendesa.multimedia_psisdi.myapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, DesaActivity.class);
             MainActivity.this.startActivity(intent);
             MainActivity.this.finish();
                     }
        });

        button2.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
              Intent intent2 = new Intent(MainActivity.this, PodesActivity.class);
              MainActivity.this.startActivity(intent2);
              MainActivity.this.finish();
          }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, TentangActivity.class);
                MainActivity.this.startActivity(intent3);
                MainActivity.this.finish();
            }
        });
   //button 2 & 3 fungsi
    }
}
