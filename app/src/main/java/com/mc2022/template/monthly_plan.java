package com.mc2022.template;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class monthly_plan extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    day1 d1=new day1();
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
    TextView t1,t2,t3,t5,t6,t7,t9,t10,t11,t13,t14,t15,t17,t18,t19,t21,t22,t23,t25,t26,t27,t29,t30;
    public monthly_plan() {

    }

    public static monthly_plan newInstance(String param1, String param2) {
        monthly_plan fragment = new monthly_plan();
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



    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_monthly_plan, container, false);
        t1=(TextView) view.findViewById(R.id.textd);

        b4=(Button) view.findViewById(R.id.day4);
        b8=(Button) view.findViewById(R.id.day8);
        b12=(Button) view.findViewById(R.id.day12);
        b16=(Button) view.findViewById(R.id.day16);
        b20=(Button) view.findViewById(R.id.day20);
        b24=(Button) view.findViewById(R.id.day24);
        b28=(Button) view.findViewById(R.id.day28);

        b4.setTextColor(Color.RED);
        b8.setTextColor(Color.RED);
        b12.setTextColor(Color.RED);
        b16.setTextColor(Color.RED);
        b20.setTextColor(Color.RED);
        b24.setTextColor(Color.RED);
        b28.setTextColor(Color.RED);


        b1=(Button) view.findViewById(R.id.day1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=0;
                MainActivity.text="YOUR DAY-1";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });

        b2=(Button) view.findViewById(R.id.day2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count = 3;
                MainActivity.text = "YOUR DAY-2";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if (!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });

        b3=(Button) view.findViewById(R.id.day3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=6;
                MainActivity.text="YOUR DAY-3";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });


        b5=(Button) view.findViewById(R.id.day5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=9;
                MainActivity.text="YOUR DAY-5";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });

        b6=(Button) view.findViewById(R.id.day6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=12;
                MainActivity.text="YOUR DAY-6";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });

        b7=(Button) view.findViewById(R.id.day7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=15;
                MainActivity.text="YOUR DAY-7";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();

            }
        });


        b9=(Button) view.findViewById(R.id.day9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=18;
                MainActivity.text="YOUR DAY-9";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });

        b10=(Button) view.findViewById(R.id.day10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=21;
                MainActivity.text="YOUR DAY-10";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });

        b11=(Button) view.findViewById(R.id.day11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=24;
                MainActivity.text="YOUR DAY-11";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });

        b13=(Button) view.findViewById(R.id.day13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=27;
                MainActivity.text="YOUR DAY-13";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });


        b14=(Button) view.findViewById(R.id.day14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count = 30;
                MainActivity.text = "YOUR DAY-14";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if (!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });

        b15=(Button) view.findViewById(R.id.day15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=33;
                MainActivity.text="YOUR DAY-15";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();

            }
        });


        b17=(Button) view.findViewById(R.id.day17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=36;
                MainActivity.text="YOUR DAY-17";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
               }
        });

        b18=(Button) view.findViewById(R.id.day18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=39;
                MainActivity.text="YOUR DAY-18";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
               }
        });


        b19=(Button) view.findViewById(R.id.day19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=42;
                MainActivity.text="YOUR DAY-19";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();

            }
        });

        b21=(Button) view.findViewById(R.id.day21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=45;
                MainActivity.text="YOUR DAY-21";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
                }
        });

        b22=(Button) view.findViewById(R.id.day22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=48;
                MainActivity.text="YOUR DAY-22";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
                }
        });

        b23=(Button) view.findViewById(R.id.day23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=51;
                MainActivity.text="YOUR DAY-23";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
                }
        });




        b25=(Button) view.findViewById(R.id.day25);//defining button for 'start service' button functionality
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=54;
                MainActivity.text="YOUR DAY-25";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b26=(Button) view.findViewById(R.id.day26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=57;
                MainActivity.text="YOUR DAY-26";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
                }
        });

        b27=(Button) view.findViewById(R.id.day27);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count = 60;
                MainActivity.text = "YOUR DAY-27";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if (!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
            }
        });


        b29=(Button) view.findViewById(R.id.day29);//defining button for 'start service' button functionality
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=63;
                MainActivity.text="YOUR DAY-29";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b30=(Button) view.findViewById(R.id.day30);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=66;
                MainActivity.text="YOUR DAY-30";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!d1.isAdded())
                    fragmentTransaction.add(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(String.valueOf(d1));
                fragmentTransaction.commit();

            }
        });


        return view;
    }
}