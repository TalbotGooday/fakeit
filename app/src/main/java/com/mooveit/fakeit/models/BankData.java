package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class BankData extends BaseObservable {

    public final ObservableField<String> bankName = new ObservableField<>();
    public final ObservableField<String> bankSwiftBic = new ObservableField<>();
    public final ObservableField<String> bankCountryCode = new ObservableField<>();
    public final ObservableField<String> bankIbanLetterCode = new ObservableField<>();
    public final ObservableField<String> bankIbanDigits = new ObservableField<>();
}
