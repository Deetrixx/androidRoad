package com.example.dennis.charged;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by dennis on 5/25/16.
 */
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        addButtonOnClickListener();
    }

    public void addButtonOnClickListener(){ //links to diamond page
        Button button;
        button = (Button)findViewById(R.id.textView8);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ListsActivity.class);
                startActivity(intent);
            }
        });
    }
}