package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class CatData extends BaseObservable {

    public final ObservableField<String> catName = new ObservableField<>();
    public final ObservableField<String> catBreed = new ObservableField<>();
    public final ObservableField<String> catRegistry = new ObservableField<>();
}