package com.example.tanya.design_fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;

import android.support.v4.view.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragApp extends Fragment
{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    Context context;

    public FragApp()
    {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_app, container, false);

        tabLayout = (TabLayout)view.findViewById(R.id.subtablayout);
        viewPager = (ViewPager)view.findViewById(R.id.subviewpager);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        MainActivity.ViewPagerAdapter adapter = new MainActivity.ViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new FragPending(), "Pending");
        adapter.addFragment(new FragWithdrawn(), "withdrawn");

        viewPager.setAdapter(adapter);
    }


}
