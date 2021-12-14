package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class RickAndMortyData extends BaseObservable {

    public final ObservableField<String> rickAndMortyCharacter = new ObservableField<>();
    public final ObservableField<String> rickAndMortyLocation = new ObservableField<>();
    public final ObservableField<String> rickAndMortyQuote = new ObservableField<>();
}
