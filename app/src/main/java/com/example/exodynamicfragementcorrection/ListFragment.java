package com.example.exodynamicfragementcorrection;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.exodynamicfragementcorrection.controller.Dao;

public class ListFragment extends Fragment {
    private ListViewModel mViewModel;

    public ListFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ListViewModel.class);
        mViewModel.setListePersonne(Dao.getAll());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setAdapter(new MyItemRecyclerViewAdapter(mViewModel.getListePersonne()));
            recyclerView
                    .addOnItemTouchListener(
                            new RecyclerItemClickListener(
                                    context,
                                    (view1,position) -> {
                                        mViewModel.setSelectedPersonne(mViewModel.getListePersonne().get(position));
                                        requireActivity()
                                                .getSupportFragmentManager()
                                                .beginTransaction()
                                                .replace(R.id.frame,new EditFragment(mViewModel))
                                                .addToBackStack(null)
                                                .commit();
                                    }
                            )
                    );
        }
        return view;
    }
}