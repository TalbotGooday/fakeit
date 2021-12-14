package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class CoffeeData extends BaseObservable {

    public final ObservableField<String> coffeeBlendName = new ObservableField<>();
    public final ObservableField<String> coffeeOrigin = new ObservableField<>();
    public final ObservableField<String> coffeeVariety = new ObservableField<>();
    public final ObservableField<String> coffeeNotes = new ObservableField<>();
}
