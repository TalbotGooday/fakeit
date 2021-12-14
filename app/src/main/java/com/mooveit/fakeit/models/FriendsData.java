package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class FriendsData extends BaseObservable {

    public final ObservableField<String> friendsCharacter = new ObservableField<>();
    public final ObservableField<String> friendsLocation = new ObservableField<>();
    public final ObservableField<String> friendsQuote = new ObservableField<>();
}
