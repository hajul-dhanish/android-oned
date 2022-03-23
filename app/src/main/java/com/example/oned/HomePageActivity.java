package com.example.oned;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class HomePageActivity extends AppCompatActivity {

    LinearLayout chatEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_page);


        chatEnter = (LinearLayout) findViewById(R.id.chatEnterbuttonid);

        chatEnter.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, ChatActivity.class);

            startActivity(intent);
        });


    }
}