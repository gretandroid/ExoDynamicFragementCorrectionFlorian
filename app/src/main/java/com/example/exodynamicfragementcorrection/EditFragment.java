package com.example.exodynamicfragementcorrection;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class EditFragment extends Fragment {
    ListViewModel mViewModel;

    public EditFragment(ListViewModel mViewModel) {
        this.mViewModel = mViewModel;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit, container, false);

        EditText enom = view.findViewById(R.id.editNom);
        EditText eprenom = view.findViewById(R.id.editPrenom);
        EditText edate = view.findViewById(R.id.editDate);

        enom.setText(mViewModel.getSelectedPersonne().getNom());
        eprenom.setText(mViewModel.getSelectedPersonne().getPrenom());
        edate.setText(mViewModel.getSelectedPersonne().getDate());

        view.findViewById(R.id.button).setOnClickListener(view1 -> {
            mViewModel.getSelectedPersonne().setNom(enom.getText().toString());
            mViewModel.getSelectedPersonne().setPrenom(eprenom.getText().toString());
            mViewModel.getSelectedPersonne().setDate(edate.getText().toString());
            mViewModel.pushChange();
            requireActivity().onBackPressed();
        });

        return view;
    }
}