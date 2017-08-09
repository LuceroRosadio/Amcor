package com.amcor.amcorapp.menu;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.amcor.amcorapp.R;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by johel on 8/08/2017.
 */

public class ModuloViewHolder extends GroupViewHolder {

    private TextView moduloName;
    private ImageView arrow;

    public ModuloViewHolder(View itemView) {
        super(itemView);

        moduloName = (TextView)itemView.findViewById(R.id.list_modulo_name);
        arrow = (ImageView)itemView.findViewById(R.id.list_item_arrow);
    }

    public void setGenreModuloTitle(Context context, ExpandableGroup title) {
        if (title instanceof ModuloMenu) {
            moduloName.setText(title.getTitle());
        }
    }

    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand() {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        arrow.setAnimation(rotate);
    }

    private void animateCollapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        arrow.setAnimation(rotate);
    }
}
