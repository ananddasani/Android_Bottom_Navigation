package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.homeIcon:
                        Toast toast = Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0,0);
                        toast.show();
                        break;

                    case R.id.searchIcon:
                        Toast toast1 = Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER, 0,0);
                        toast1.show();
                        break;

                    case R.id.addIcon:
                        Toast toast2 = Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT);
                        toast2.setGravity(Gravity.CENTER, 0,0);
                        toast2.show();                        break;

                    case R.id.favIcon:
                        Toast toast3 = Toast.makeText(MainActivity.this, "Activity", Toast.LENGTH_SHORT);
                        toast3.setGravity(Gravity.CENTER, 0,0);
                        toast3.show();
                        break;

                    case R.id.profileIcon:
                        Toast toast4 = Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT);
                        toast4.setGravity(Gravity.CENTER, 0,0);
                        toast4.show();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getItemId());
                }
                return true;
            }
        });
    }
}