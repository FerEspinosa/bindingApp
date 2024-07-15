package com.curso.android.app.practica.databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onButton1Clicked(View view) {
        // Handle the click event here
        Toast.makeText(context, "Hurray!", Toast.LENGTH_SHORT).show();
    }
}
