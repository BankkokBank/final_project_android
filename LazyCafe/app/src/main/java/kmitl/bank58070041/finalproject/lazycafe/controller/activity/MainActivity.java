package kmitl.bank58070041.finalproject.lazycafe.controller.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;


import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.controller.fragment.HomeFragment;
import kmitl.bank58070041.finalproject.lazycafe.controller.fragment.ProfileFragment;
import kmitl.bank58070041.finalproject.lazycafe.controller.fragment.QueueFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //FragmentHomeOpenApp
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout,new HomeFragment()).commit();

         }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.frameLayout,new HomeFragment()).commit();
                    return true;
                case R.id.navigation_queue:
                    transaction.replace(R.id.frameLayout,new QueueFragment()).commit();
                    return true;
                case R.id.navigation_profile:
                    transaction.replace(R.id.frameLayout,new ProfileFragment()).commit();
                    return true;
            }
            return false;
        }
    };



}
