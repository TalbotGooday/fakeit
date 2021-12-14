package com.mooveit.fakeit.utils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class FragmentUtils {

    public static void initFragment(AppCompatActivity activity, Fragment fragment, int layout, String tag) {
        activity.getSupportFragmentManager().beginTransaction().add(layout, fragment, tag).commitAllowingStateLoss();
    }
}
