package com.mooveit.fakeit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import com.mooveit.fakeit.databinding.ActivityMainBinding;
import com.mooveit.fakeit.viewmodels.MainViewModel;
import com.mooveit.library.Fakeit;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements MainViewModel.MainCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new MainViewModel(this));

        Fakeit.initWithLocale(this, Locale.ENGLISH);
    }

    @Override
    public void startActivityWithLayout(int layout) {
        startActivity(DataActivity.getIntentWithExtras(layout, this));
    }
}