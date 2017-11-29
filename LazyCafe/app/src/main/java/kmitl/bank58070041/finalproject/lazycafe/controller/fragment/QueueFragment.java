package kmitl.bank58070041.finalproject.lazycafe.controller.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kmitl.bank58070041.finalproject.lazycafe.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class QueueFragment extends Fragment {


    public QueueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_queue, container, false);
    }

}
