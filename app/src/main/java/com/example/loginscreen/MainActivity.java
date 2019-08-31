package com.example.loginscreen;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView loginText, signUpText;
    private CardView loginPage, signUpPage;
    private Button loginButton, signUpButton;
    private ImageView loginImage, signUpImage;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializedFields();

        signUpText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loginText.setTextColor(Color.BLUE);
                loginButton.setVisibility(View.INVISIBLE);
                loginImage.setVisibility(View.INVISIBLE);
                loginPage.setVisibility(View.INVISIBLE);

                signUpText.setTextColor(Color.WHITE);
                signUpButton.setVisibility(View.VISIBLE);
                signUpImage.setVisibility(View.VISIBLE);
                signUpPage.setVisibility(View.VISIBLE);

            }
        });

        loginText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loginText.setTextColor(Color.WHITE);
                loginButton.setVisibility(View.VISIBLE);
                loginImage.setVisibility(View.VISIBLE);
                loginPage.setVisibility(View.VISIBLE);

                signUpText.setTextColor(Color.BLUE);
                signUpButton.setVisibility(View.INVISIBLE);
                signUpImage.setVisibility(View.INVISIBLE);
                signUpPage.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void initializedFields()
    {
        loginText = findViewById(R.id.log_in_text);
        signUpText = findViewById(R.id.sign_up_text);

        loginImage = findViewById(R.id.log_in_image);
        signUpImage = findViewById(R.id.sign_up_image);

        loginButton = findViewById(R.id.log_in_button);
        signUpButton = findViewById(R.id.sign_up_button);

        loginPage = findViewById(R.id.log_in_page);
        signUpPage = findViewById(R.id.sign_up_page);
    }
}
