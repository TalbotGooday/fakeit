package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class DemographicData extends BaseObservable {

    public final ObservableField<String> race = new ObservableField<>();
    public final ObservableField<String> educationalAttainment = new ObservableField<>();
    public final ObservableField<String> demonym = new ObservableField<>();
    public final ObservableField<String> maritalStatus = new ObservableField<>();
    public final ObservableField<String> sex = new ObservableField<>();
}
