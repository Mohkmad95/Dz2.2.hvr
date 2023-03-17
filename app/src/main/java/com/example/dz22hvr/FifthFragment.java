package com.example.dz22hvr;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FifthFragment extends Fragment {

    private TextView res1, res2, res3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        res1 = requireActivity().findViewById(R.id.res1);
        res2 = requireActivity().findViewById(R.id.res2);
        res3 = requireActivity().findViewById(R.id.res3);

        String result1 = getArguments().getString("key1/");
        res1.setText(result1);

        String result2 = getArguments().getString("key2.");
        res2.setText(result2);

        String result3 = getArguments().getString("key3/]");
        res3.setText(result3);
    }
}