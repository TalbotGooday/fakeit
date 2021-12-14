package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class DateTimeData extends BaseObservable {

    public final ObservableField<String> dateFormatter = new ObservableField<>();
    public final ObservableField<String> timeFormatter = new ObservableField<>();
    public final ObservableField<String> dateTimeFormatter = new ObservableField<>();
}