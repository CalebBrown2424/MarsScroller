package com.example.sidescrollerduefriday;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout scrollLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollLayout = (LinearLayout)findViewById(R.id.scroll_layout);
        fillLayout();
    }
    private void fillLayout()
    {
        ImageButton imageButton;
        for(int i = 0; i < GameDB.descriptions.length; i++)
        {
            Game game = new Game(GameDB.descriptions[i], GameDB.drawableIDs[i]);
            imageButton = new ImageButton(this);
            imageButton.setImageDrawable(getDrawable(game.getDrawableID()));
            imageButton.setContentDescription(game.getDescription());
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text = ((ImageButton) v).getContentDescription().toString();
                    Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
                }
            });
            scrollLayout.addView(imageButton);
        }
    }
}