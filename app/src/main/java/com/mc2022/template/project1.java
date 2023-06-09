package com.mc2022.template;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class project1 extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    less_time lessTime=new less_time();
    monthly_plan monthlyPlan=new monthly_plan();

    public project1() {
    }
    public static project1 newInstance(String param1, String param2) {
        project1 fragment = new project1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }
    Button b1,b2,b3,b4;
    first f=new first();
    second s=new second();
    third t=new third();
    have_time haveTime=new have_time();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_project1, container, false);


        b1=(Button) view.findViewById(R.id.have_time);//defining button for 'start service' button functionality
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,haveTime);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b2=(Button) view.findViewById(R.id.less_time);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,lessTime);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        b3=(Button) view.findViewById(R.id.monthly_plan);//defining button for 'start service' button functionality
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,monthlyPlan);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        b4=(Button) view.findViewById(R.id.elderly_exercise);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,t);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        return view;

}}