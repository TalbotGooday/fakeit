package com.mooveit.fakeit.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class FileData extends BaseObservable {

    public final ObservableField<String> extension = new ObservableField<>();
    public final ObservableField<String> mimeType = new ObservableField<>();
}
