package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class CardData extends BaseObservable {

    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> brand = new ObservableField<>();
    public final ObservableField<String> number = new ObservableField<>();
    public final ObservableField<String> type = new ObservableField<>();
    public final ObservableField<String> expirationDate = new ObservableField<>();
}
