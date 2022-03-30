package com.motion.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

  private EditText editName;
  private EditText editAge;
  private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editName=findViewById(R.id.nameEt);
        editAge=findViewById(R.id.ageEt);
        btnSave=findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("userName",editName.getText().toString());
                intent.putExtra("userAge",editAge.getText().toString());
                startActivity(intent);
            }
        });
    }
}