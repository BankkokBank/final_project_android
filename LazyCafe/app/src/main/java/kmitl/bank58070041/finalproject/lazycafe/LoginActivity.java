package kmitl.bank58070041.finalproject.lazycafe;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import kmitl.bank58070041.finalproject.lazycafe.fragment.HomeFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //DataBase
        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
//        DatabaseReference mIDRef = mRootRef.child("Bankkok_Bank");
//        //write database
//        mIDRef.child("username").setValue("Bankkok_Bank");
//        mIDRef.child("password").setValue("12345678");
//        mIDRef.child("email").setValue("58070041@kmitl.ac.th");

//        DatabaseReference mIDRef = mRootRef.child("nuttawat17");
//        //write database
//        mIDRef.child("username").setValue("nuttawat17");
//        mIDRef.child("password").setValue("12345678");
//        mIDRef.child("email").setValue("58070041@kmitl.ac.th");

    }

    public void loginClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
