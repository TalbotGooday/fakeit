package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class LoremData extends BaseObservable {

    public final ObservableField<String> words = new ObservableField<>();
    public final ObservableField<String> supplemental = new ObservableField<>();
}