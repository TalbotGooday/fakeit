package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class JobData extends BaseObservable {

    public final ObservableField<String> jobPosition = new ObservableField<>();
    public final ObservableField<String> jobSeniority = new ObservableField<>();
    public final ObservableField<String> jobTitle = new ObservableField<>();
    public final ObservableField<String> jobField = new ObservableField<>();
    public final ObservableField<String> jobKeySkill = new ObservableField<>();
}
