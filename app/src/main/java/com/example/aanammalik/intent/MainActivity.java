package com.example.aanammalik.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // declaration
    private EditText editText;
    private String searchString;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // main method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);// find id

    }  // open search for google entring string
    public void openWebPage(View view){
        searchString = editText.getText().toString();

// using intent to show another screen
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com/search?q="+searchString));// set data
        startActivity(intent); // start activity
    }
}
