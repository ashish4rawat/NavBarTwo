package com.technical.navbartwo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.technical.navbartwo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Complaint extends Fragment {


        public Complaint() {
                // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                // Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_complaint, container, false);
        }

        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
                super.onViewCreated(view, savedInstanceState);
                //you can set the title for your toolbar here for different fragments different titles
                getActivity().setTitle("complaint");
        }

}
