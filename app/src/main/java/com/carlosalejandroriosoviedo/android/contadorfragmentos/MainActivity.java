package com.carlosalejandroriosoviedo.android.contadorfragmentos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
                fragment = new ContadorFragment();
                fm.beginTransaction()
                        .add(R.id.fragment_container, fragment)
                        .commit();

        }

    }
}
