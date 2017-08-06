package com.amcor.amcorapp;

import android.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TextInputEditText;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements RecyclerAdapter.ItemClickChild {

    //@BindView(R.id.homeRecyclerView)
    RecyclerView recyclerView;
    //@BindView(R.id.navigView)
    NavigationView navigationView;
    //@BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    String names[] = Constant.name;
    String subNames[] = Constant.subName;

    //@BindView(R.id.toolbar_container)
    Toolbar toolbar;
    //@BindView(R.id.frameHome)
    FrameLayout frame;

    TitleFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = (RecyclerView)findViewById(R.id.homeRecyclerView);
        navigationView = (NavigationView)findViewById(R.id.navigView);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        frame = (FrameLayout)findViewById(R.id.frameHome);



        setSupportActionBar(toolbar);
        final ActionBar actionar = getSupportActionBar();
        actionar.setDisplayHomeAsUpEnabled(true);
        actionar.setHomeAsUpIndicator(R.drawable.ic_menu);

        List<TitleMenu> list = getList();
        RecyclerAdapter adapter = new RecyclerAdapter(this, list, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        setFragment();
    }

    private List<TitleMenu> getList() {
        List<TitleMenu> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            List<Subtitule> subTitles = new ArrayList<>();
            for (int j = 0; j < subNames.length; j++) {
                Subtitule subTitle = new Subtitule(subNames[j]);
                subTitles.add(subTitle);
            }
            TitleMenu model = new TitleMenu(names[i], subTitles, null);
            list.add(model);
        }
        return list;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setFragment() {
        fragment = new TitleFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameHome, fragment, "TitleFragment").commit();
    }

    @Override
    public void onChildClick(int position) {
        String name = subNames[position];
        drawerLayout.closeDrawers();
        fragment.setTitle(name);
    }
}
