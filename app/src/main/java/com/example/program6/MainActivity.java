package com.example.program6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                Blankfragment ff1 =  new Blankfragment();
                f1.replace(R.id.fragmentcontainer, ff1);
                f1.commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f2 = getSupportFragmentManager().beginTransaction();
                Blankfragment ff2 =  new Blankfragment();
                f2.replace(R.id.fragmentcontainer, ff2);
                f2.commit();
            }
        });
    }
}