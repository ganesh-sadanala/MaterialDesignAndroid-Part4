package com.ganesh.materialdesignpro4;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar mainToolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainToolbar=findViewById(R.id.toolbar);
        mainToolbar.setTitle("List of Chapters");
        navigationView=findViewById(R.id.navigationMain);
        drawerLayout=findViewById(R.id.DrawerMain);
        setUpNavigationDrawerMenu();
    }

    private void setUpNavigationDrawerMenu() {
        //creates hamburger icon
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,mainToolbar
        ,R.string.drawer_open,R.string.drawer_close);
        //Now we need to link our nv to dt
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }
}
