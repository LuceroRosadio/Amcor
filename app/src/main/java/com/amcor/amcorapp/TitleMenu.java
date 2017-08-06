package com.amcor.amcorapp;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by johel on 5/08/2017.
 */

public class TitleMenu extends ExpandableGroup<Subtitule>{

    private String imageUrl;

    public TitleMenu(String title, List<Subtitule> items, String imageUrl) {
        super(title, items);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
