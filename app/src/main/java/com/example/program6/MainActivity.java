package com.example.program6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
Create a Mobile app that demonstrates the MENU OPTION
Minimum 4 Option in the menu ( Under 3 dot ) [Send, Color, share, Exit....etc]
Display TWO ICONS for the menu on the bar.
Send - will send the message through WhatsApp
Colour - changes the background colour of the app
share - allows the user to share the entered text to other apps
exit - closes the app

Display the appropriate message/ perform the action for each menu item clicked.
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}