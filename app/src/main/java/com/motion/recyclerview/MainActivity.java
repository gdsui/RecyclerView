package com.motion.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.motion.recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<User> list;
    private UserAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        list=new ArrayList<>();
        if (list!=null){
            Intent intent=getIntent();
            String name =intent.getStringExtra("userName");
            String age=intent.getStringExtra("userAge");
            User user=new User(name,age);
            list.add(user);
        }
        adapter=new UserAdapter(list);
        binding.recyclerUser.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

}