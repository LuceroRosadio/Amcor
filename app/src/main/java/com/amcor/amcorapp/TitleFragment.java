package com.amcor.amcorapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TitleFragment extends Fragment {

    View rootView;

    @BindView(R.id.title_name)
    TextView titleName;

    @BindView(R.id.main_content)
    LinearLayout mainContent;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_title_fragment, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    public void setTitle(String title) {
        titleName.setText(title);
    }
}
