package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class ChuckNorrisFactsData extends BaseObservable {

    public final ObservableField<String> chuckNorrisFact = new ObservableField<>();
}