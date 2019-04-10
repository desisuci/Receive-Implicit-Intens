package com.desisuci.receiveimplicitintens;

import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Uri uri = intent.getData();


        if (uri != null) {
            String uri_string = "URI: " + uri.toString();
            TextView textView = (TextView) findViewById(R.id.text_uri_message);
            textView.setText(uri_string);
        }

    }
}
