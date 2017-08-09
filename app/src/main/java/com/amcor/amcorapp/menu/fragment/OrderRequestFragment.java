package com.amcor.amcorapp.menu.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amcor.amcorapp.R;

import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderRequestFragment extends Fragment {
    private static final String TAG = "orderFragment";

    View rootView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "oncreateOrder");
        rootView = inflater.inflate(R.layout.fragment_order_request, container, false);
        return rootView;
    }

}
