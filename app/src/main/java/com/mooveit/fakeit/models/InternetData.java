package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class InternetData extends BaseObservable {

    public final ObservableField<String> internetFreeEmail = new ObservableField<>();
    public final ObservableField<String> internetDomainSuffix = new ObservableField<>();
}
