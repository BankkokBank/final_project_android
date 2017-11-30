package kmitl.bank58070041.finalproject.lazycafe.controller.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.adapter.QueueAdapter;
import kmitl.bank58070041.finalproject.lazycafe.model.Bill;


/**
 * A simple {@link Fragment} subclass.
 */
public class QueueFragment extends Fragment {
    private ArrayList<Bill> listBill = new ArrayList<>();
    private QueueAdapter queueAdapter;
    RecyclerView recyclerView;


    public QueueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_queue, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        queueAdapter = new QueueAdapter(getActivity(), getActivity());
        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference("user");
        mRootRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Bill bill = snapshot.getValue(Bill.class);
                    listBill.add(bill);
                }
                queueAdapter.setBills(listBill);
                recyclerView.setAdapter(queueAdapter);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });
        return rootView;
    }





}
