package com.jasbir.fourtabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Emergency extends Activity {

    Button qr;
    ImageView emg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency);
        qr = (Button) findViewById(R.id.scan_qr);

        emg = (ImageView) findViewById(R.id.imageView);
        qr.setText("Scan");
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(new Intent(Emergency.this, Scanner.class));
                startActivity(i);

            }
        });
//        emg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(new Intent(Emergency.this, MainActivity.class));
//                startActivity(i);
//
//            }
//        });

    }

    public void onClick(View v){
        Intent i = new Intent(new Intent(Emergency.this, MainActivity.class));
                startActivity(i);
    }
}
