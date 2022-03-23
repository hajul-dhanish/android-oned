package com.example.oned;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class ChatActivity extends AppCompatActivity {

    ImageButton sendMsg;
    EditText textMsg;
    TextView sendedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FIRST_APPLICATION_WINDOW);
        Objects.requireNonNull(getSupportActionBar()).hide();
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_chat);

        sendMsg =  findViewById(R.id.sendMsgid);
        textMsg =  (EditText) findViewById(R.id.textMsgid);
        sendedMsg = findViewById(R.id.changeTextid);


        sendMsg.setOnClickListener(v ->{
            String Message =  textMsg.getText().toString();

            if(!Message.isEmpty()){
                sendedMsg.setText(Message);

                textMsg.clearFocus();
                textMsg.clearComposingText();

            }


        });

    }
}