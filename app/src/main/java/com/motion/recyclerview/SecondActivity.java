package com.motion.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.motion.recyclerview.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

  private ActivitySecondBinding activitySecondBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySecondBinding=ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(activitySecondBinding.getRoot());
        activitySecondBinding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("userName",activitySecondBinding.nameEt.getText().toString());
                intent.putExtra("userAge",activitySecondBinding.ageEt.getText().toString());
                startActivity(intent);
            }
        });
    }
}