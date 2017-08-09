package com.amcor.amcorapp.menu;

import android.view.View;
import android.widget.TextView;

import com.amcor.amcorapp.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by johel on 8/08/2017.
 */

public class OpcionModuloViewHolder extends ChildViewHolder {

    private TextView opcionModuloName;

    public OpcionModuloViewHolder(View itemView) {
        super(itemView);
        opcionModuloName = (TextView)itemView.findViewById(R.id.txtOpcionModulo);
    }

    public void setOpcionModuloName(String name) {
        opcionModuloName.setText(name);
    }
}
