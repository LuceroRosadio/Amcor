package com.amcor.amcorapp.menu.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amcor.amcorapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class QueryTrackingFragment extends Fragment {
    private static final String TAG = "QueryTrackingFragment";




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "oncreate");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_query_tracking, container, false);
    }

}
