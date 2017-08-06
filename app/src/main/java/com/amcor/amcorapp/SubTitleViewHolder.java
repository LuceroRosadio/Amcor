package com.amcor.amcorapp;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by johel on 5/08/2017.
 */

class SubTitleViewHolder extends ChildViewHolder{
    private TextView subTitleTextView;

    public SubTitleViewHolder(View itemView) {
        super(itemView);
        subTitleTextView = (TextView) itemView.findViewById(R.id.txtSubtitle);
    }

    public void setSubTitleName(String name) {
        subTitleTextView.setText(name);
    }

}
