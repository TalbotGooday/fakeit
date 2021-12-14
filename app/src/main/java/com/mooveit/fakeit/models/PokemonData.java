package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class PokemonData extends BaseObservable {

    public final ObservableField<String> pokemonName = new ObservableField<>();
    public final ObservableField<String> pokemonLocation = new ObservableField<>();
}