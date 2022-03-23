package com.example.oned;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button skipValidatinoButton;
    Button createValidationButton;
    EditText nameFromValidation;
    EditText emailFromValidation;
    EditText passFromValidation;
    RadioButton maleGender;
    RadioButton femaleGender;
    RadioGroup radioGroup;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FIRST_APPLICATION_WINDOW);
        getSupportActionBar().hide();
//
        setContentView(R.layout.activity_main);

        skipValidatinoButton =  findViewById(R.id.skipToMainPageid);
        createValidationButton =  findViewById(R.id.createAccid);
        nameFromValidation = findViewById(R.id.mainUserName);
        emailFromValidation = findViewById(R.id.emailid);
        passFromValidation =  findViewById(R.id.passid);
        maleGender = findViewById(R.id.mid);
        femaleGender =  findViewById(R.id.fid);
        radioGroup = findViewById(R.id.radioGrp);

       createValidationButton.setOnClickListener(v -> {
           String fullName = nameFromValidation.getText().toString();
           String emailId = emailFromValidation.getText().toString();
           String passCode = passFromValidation.getText().toString();

           int radioCkAns = radioGroup.getCheckedRadioButtonId();
           RadioButton radioButton = findViewById(radioCkAns);

           if(fullName.isEmpty() | emailId.isEmpty() | passCode.isEmpty()){
               Toast.makeText(MainActivity.this,
                       "Please Fill The Form!",
                       Toast.LENGTH_SHORT).show();
           }
           else {
               Toast.makeText(MainActivity.this,
                       "Hello " + fullName+ ", " + "Will Update in Upcoming Version...",
                       Toast.LENGTH_SHORT).show();
           }
       });

        skipValidatinoButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,
                    HomePageActivity.class);

            startActivity(intent);
        });

    }
}