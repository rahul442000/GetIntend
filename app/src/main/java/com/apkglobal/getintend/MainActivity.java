package com.apkglobal.getintend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1;
EditText e1;
String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.click);
        e1=findViewById(R.id.edit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("key",s1);//to take value in edit text to TEXTview in main2activity
                startActivity(i);
            }
        });
    }
}
