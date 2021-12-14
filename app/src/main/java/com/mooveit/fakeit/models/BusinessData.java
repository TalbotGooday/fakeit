package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class BusinessData extends BaseObservable {

    public final ObservableField<String> businessName = new ObservableField<>();
    public final ObservableField<String> businessType = new ObservableField<>();
    public final ObservableField<String> businessSubType = new ObservableField<>();
}
