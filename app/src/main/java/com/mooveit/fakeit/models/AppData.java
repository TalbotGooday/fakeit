package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class AppData extends BaseObservable {

    public final ObservableField<String> appName = new ObservableField<>();
    public final ObservableField<String> appVersion = new ObservableField<>();
    public final ObservableField<String> appAuthor = new ObservableField<>();
}
