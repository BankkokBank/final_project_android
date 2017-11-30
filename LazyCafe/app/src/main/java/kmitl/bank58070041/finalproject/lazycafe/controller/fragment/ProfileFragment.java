package kmitl.bank58070041.finalproject.lazycafe.controller.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.facebook.FacebookSdk;
import com.facebook.login.Login;
import com.facebook.login.LoginManager;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.controller.activity.LoginActivity;
import kmitl.bank58070041.finalproject.lazycafe.model.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        User user = User.getUserInstance();
        View rootview = inflater.inflate(R.layout.fragment_profile, container, false);
        TextView userID = rootview.findViewById(R.id.user_id);
        TextView name = rootview.findViewById(R.id.name);
        ImageView picture = rootview.findViewById(R.id.picture);
        Glide.with(getContext()).load(user.getUriProfile()).into(picture);
        userID.setText("User ID : "+user.getId());
        name.setText("Name : "+user.getUsername());
        Button logoutBtn = rootview.findViewById(R.id.logout);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginManager.getInstance().logOut();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                getActivity().finish();
                startActivity(intent);

            }
        });
        return rootview;
    }
    }


