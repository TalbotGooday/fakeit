package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class HarryPotterData extends BaseObservable {

    public final ObservableField<String> harryPotterCharacter = new ObservableField<>();
    public final ObservableField<String> harryPotterLocation = new ObservableField<>();
    public final ObservableField<String> harryPotterQuote = new ObservableField<>();
    public final ObservableField<String> harryPotterBook = new ObservableField<>();
}
