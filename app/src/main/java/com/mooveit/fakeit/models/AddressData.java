package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class AddressData extends BaseObservable {

    public final ObservableField<String> city = new ObservableField<>();
    public final ObservableField<String> streetAddress = new ObservableField<>();
    public final ObservableField<String> buildingNumber = new ObservableField<>();
    public final ObservableField<String> zipCode = new ObservableField<>();
    public final ObservableField<String> state = new ObservableField<>();
    public final ObservableField<String> stateAbbreviation = new ObservableField<>();
}
