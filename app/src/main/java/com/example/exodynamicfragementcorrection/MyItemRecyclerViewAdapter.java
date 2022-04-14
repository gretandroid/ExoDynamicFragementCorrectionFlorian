package com.example.exodynamicfragementcorrection;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.exodynamicfragementcorrection.model.Personne;
import com.example.exodynamicfragementcorrection.databinding.FragmentListBinding;
import java.util.List;


public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<Personne> mValues;

    public MyItemRecyclerViewAdapter(List<Personne> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mContentView.setText(mValues.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mContentView;

        public ViewHolder(FragmentListBinding binding) {
            super(binding.getRoot());
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}