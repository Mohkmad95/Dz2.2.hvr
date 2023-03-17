package com.example.dz22hvr;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

public class FirstFragment extends Fragment {
    private Button button2, button3, button4;
    private final String[] randomTexts = {"QWSXFDm", "QSDFGHJ", "LKJH", "HGVBNM", "1QWSDC"};
    private final String[] randomElements = {"true", "3.1234", "false"};
    private final String[] randomNumber = {"2", "10", "12", "14", "17", "200", "2000", "23332"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button2 = requireActivity().findViewById(R.id.button2);
        button3 = requireActivity().findViewById(R.id.button3);
        button4 = requireActivity().findViewById(R.id.button4);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("QWERTY", getRandomText());
                bundle.putString("UIOP", getRandomNumber());
                bundle.putString("ASDFGH", getRandomElements());
                SecondFragment fragment = new SecondFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container,
                        fragment).commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(";lkjhgc", getRandomText());
                bundle.putString("mnbv", getRandomNumber());
                bundle.putString("qsc", getRandomElements());
                ThirdFragment fragment = new ThirdFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, fragment).commit();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("randomText", getRandomText());
                bundle.putString("evenNumbers", getRandomNumber());
                bundle.putString("miscData", getRandomElements());
                FourthFragment fragment = new FourthFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, fragment).commit();
            }
        });
    }
    private String getRandomText() {
        return randomTexts[new Random().nextInt(randomTexts.length)];
    }

    private String getRandomElements() {
        return randomElements[new Random().nextInt(randomElements.length)];
    }

    private String getRandomNumber() {
        return randomNumber[new Random().nextInt(randomNumber.length)];
    }
}


