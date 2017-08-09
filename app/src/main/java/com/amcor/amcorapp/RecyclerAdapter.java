package com.amcor.amcorapp;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amcor.amcorapp.data.model.OpcionModulo;
import com.amcor.amcorapp.menu.ModuloMenu;
import com.amcor.amcorapp.menu.ModuloViewHolder;
import com.amcor.amcorapp.menu.OpcionModuloViewHolder;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import java.util.List;

/**
 * Created by johel on 5/08/2017.
 */

public class RecyclerAdapter extends ExpandableRecyclerViewAdapter<ModuloViewHolder, OpcionModuloViewHolder> {

    private static final String TAG = "RecyclerAdapter";
    private Context context;
    private ItemClickChild mListener;
    public RecyclerAdapter(Context context, List groups, Activity activity) {
        super(groups);
        this.context = context;
        mListener = (ItemClickChild) activity;
    }

    @Override
    public ModuloViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_modulo_title, parent, false);
        return new ModuloViewHolder(view);
    }

    @Override
    public OpcionModuloViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_opcion_modulo, parent, false);
        return new OpcionModuloViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(OpcionModuloViewHolder holder, int flatPosition, ExpandableGroup group, final int childIndex) {
        final OpcionModulo opcionModulo = ((ModuloMenu) group).getItems().get(childIndex);
        holder.setOpcionModuloName(opcionModulo.getNombreOpcion());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClickChild"+opcionModulo.getNombreOpcion());
                mListener.onChildClick(childIndex, opcionModulo.getEstadoOpcion());
            }
        });
    }

    @Override
    public void onBindGroupViewHolder(ModuloViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGenreModuloTitle(context, group);
    }

    public interface ItemClickChild {
        void onChildClick(int position, String opcion);
    }
}
