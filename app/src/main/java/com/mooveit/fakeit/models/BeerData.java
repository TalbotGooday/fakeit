package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class BeerData extends BaseObservable {

    public final ObservableField<String> beerName = new ObservableField<>();
    public final ObservableField<String> beerStyle = new ObservableField<>();
    public final ObservableField<String> beerHop = new ObservableField<>();
    public final ObservableField<String> beerYeast = new ObservableField<>();
    public final ObservableField<String> beerMalts = new ObservableField<>();
    public final ObservableField<String> beerIbu = new ObservableField<>();
    public final ObservableField<String> beerAlcohol = new ObservableField<>();
    public final ObservableField<String> beerBlg = new ObservableField<>();
}