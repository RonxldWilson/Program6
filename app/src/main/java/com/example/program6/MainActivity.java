package com.example.program6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

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
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        editText = (EditText)findViewById(R.id.editTextTextPersonName);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                BlankFragment ff1 =  new BlankFragment();
                f1.replace(R.id.fragment_container, ff1);
                f1.commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f2 = getSupportFragmentManager().beginTransaction();
                BlankFragment2 ff2 =  new BlankFragment2();
                f2.replace(R.id.fragment_container, ff2);
                f2.commit();
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_send:
                menuSend();
                return true;
            case R.id.menu_colour:
                menuColour();
                return true;
            case R.id.menu_share:
                menuShare();
                return true;
            case R.id.menu_exit:
                menuExit();
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }
    public void menuSend(){
//        long int number = "
        String number = "8359838126";
        String message = "This message is sent through a custom built app";
        Toast.makeText(getApplicationContext(), "Opened WhatsApp", Toast.LENGTH_SHORT).show();

        Uri uri = Uri.parse("smsto:" + number);
        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
        i.setPackage("com.whatsapp");
        startActivity(Intent.createChooser(i, ""));

    }
    public void menuShare(){
        Toast.makeText(getApplicationContext(), "Sharing the text", Toast.LENGTH_SHORT).show();
        String message = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(intent);
    }
    public void menuColour(){
        LinearLayout Layout;
        Toast.makeText(getApplicationContext(), "Colour Change", Toast.LENGTH_SHORT).show();
        Layout = findViewById(R.id.og);
        Layout.setBackgroundColor(Color.YELLOW);
    }
    public void menuExit(){
        Toast.makeText(getApplicationContext(), "App Exited", Toast.LENGTH_SHORT).show();
        this.finishAffinity();
    }
}