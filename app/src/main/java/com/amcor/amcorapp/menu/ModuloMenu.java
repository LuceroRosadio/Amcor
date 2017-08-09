package com.amcor.amcorapp.menu;

import android.os.Parcel;

import com.amcor.amcorapp.data.model.OpcionModulo;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by johel on 8/08/2017.
 */

public class ModuloMenu extends ExpandableGroup<OpcionModulo> {

    public ModuloMenu(String title, List<OpcionModulo> items) {
        super(title, items);
    }

    protected ModuloMenu(Parcel in) {
        super(in);
    }
}
