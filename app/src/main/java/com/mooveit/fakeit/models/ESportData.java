package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class ESportData extends BaseObservable {

    public final ObservableField<String> player = new ObservableField<>();
    public final ObservableField<String> team = new ObservableField<>();
    public final ObservableField<String> league = new ObservableField<>();
    public final ObservableField<String> event = new ObservableField<>();
    public final ObservableField<String> game = new ObservableField<>();
}
