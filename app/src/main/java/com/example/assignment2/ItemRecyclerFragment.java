package com.example.assignment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class ItemRecyclerFragment extends Fragment {

    private RecyclerView recyclerView;

    public ItemRecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_recycler, container, false);

        // Now I can do all my normal set up stuff
        recyclerView = view.findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        ItemAdapter itemAdapter = new ItemAdapter();

        // We wrote our setData method to be like a setter, so we give our ArrayList from
        // FakeDatabase to the Adapter.
        itemAdapter.setData(FakeDatabase.getAllItems());
        recyclerView.setAdapter(itemAdapter);

        return view;
    }

    // This is just an example of a way that the Fragment can communicate with the parent Activity.
    // Specifically, this is using a method belonging to the parent.
    @Override
    public void onResume() {
        super.onResume();
        MainActivity parent = (MainActivity) getActivity();
        parent.showCoolMessage("Welcome to Borger Kong!");
    }
}

