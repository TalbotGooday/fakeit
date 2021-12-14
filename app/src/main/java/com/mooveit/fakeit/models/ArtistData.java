package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class ArtistData extends BaseObservable {

    public final ObservableField<String> artistName = new ObservableField<>();
}
