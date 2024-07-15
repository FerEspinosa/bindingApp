package com.curso.android.app.practica.databindingapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.curso.android.app.practica.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MyClickHandler myClickHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Person p1 = new Person ("Fernando", "fer@gmail.com");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPerson(p1);

        myClickHandler = new MyClickHandler(this);

        // Bind the ActivityMainBinding object to the layout variable "clickHandler"
        // using setClickHandler
        // The declared name of the variable in the layout file in data section,
        // will determine the name of the method.
        // In this case, variable name: "clickHandler" -> method name: "setClickHandler"
        binding.setClickHandler(myClickHandler);

    }
}