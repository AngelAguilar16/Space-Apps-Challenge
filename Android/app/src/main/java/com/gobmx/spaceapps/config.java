package com.gobmx.spaceapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class config extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);


        //BARRA DE NAVEGACION Y MENU
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.config);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {

                    case R.id.home:
                        Intent intent = new Intent(config.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.help:
                        Intent intents = new Intent(config.this, help.class);
                        startActivity(intents);
                        break;
                    case R.id.config:

                        break;
                }
                return;
            }
        });

    }
}