package com.amcor.amcorapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by johel on 5/08/2017.
 */

class Subtitule implements Parcelable{

    private String name;

    public Subtitule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
    }

    protected Subtitule(Parcel in) {
        this.name = in.readString();
    }

    public static final Parcelable.Creator<Subtitule> CREATOR = new Parcelable.Creator<Subtitule>() {
        @Override
        public Subtitule createFromParcel(Parcel source) {
            return null;
        }

        @Override
        public Subtitule[] newArray(int size) {
            return new Subtitule[size];
        }

    };
}
