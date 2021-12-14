package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class HeyArnoldData extends BaseObservable {

    public final ObservableField<String> heyArnoldCharacter = new ObservableField<>();
    public final ObservableField<String> heyArnoldLocation = new ObservableField<>();
    public final ObservableField<String> heyArnoldQuote = new ObservableField<>();
}
