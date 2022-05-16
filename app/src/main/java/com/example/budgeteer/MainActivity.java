package com.example.budgeteer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.budgeteer.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Connecting the layout of the MainActivity
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);

        // Adding LoginActivity to be viewed when cd Android clicked on the button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        Button registerButton = findViewById(R.id.registerButton);

        // Adding RegisterActivity to be viewed when clicked on the button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

    }


}