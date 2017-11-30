package kmitl.bank58070041.finalproject.lazycafe.controller.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import kmitl.bank58070041.finalproject.lazycafe.controller.activity.TypeCoffeePage;
import kmitl.bank58070041.finalproject.lazycafe.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment{


    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        ImageView goCoffee = view.findViewById(R.id.goCoffee);
        goCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TypeCoffeePage.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
