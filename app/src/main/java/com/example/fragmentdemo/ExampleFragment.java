package com.example.fragmentdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ExampleFragment extends Fragment {

    private static  final String ARG_TEXT = "argText";
    private static final String ARG_NUMBER = "argNumber";


    private String text;
    private int number;

    public static ExampleFragment newInstence(String text, int number){
        ExampleFragment fragment = new ExampleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, text);
        args.putInt(ARG_NUMBER, number);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.example_fragment,container, false);
        TextView textView = v.findViewById(R.id.frag_text);
        if(getArguments() != null){
            text = getArguments().getString(ARG_TEXT);
            number = getArguments().getInt(ARG_NUMBER);
        }

        textView.setText(text + number);

        return v;
    }
}
