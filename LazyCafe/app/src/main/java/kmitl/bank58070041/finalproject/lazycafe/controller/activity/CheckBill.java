package kmitl.bank58070041.finalproject.lazycafe.controller.activity;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.model.Bill;
import kmitl.bank58070041.finalproject.lazycafe.model.Coffee;
import kmitl.bank58070041.finalproject.lazycafe.model.User;

public class CheckBill extends AppCompatActivity {



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_bill);
        final User user = User.getUserInstance();

        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
        final DatabaseReference mBillRef = mRootRef.child(user.getUsername());


        Button button = findViewById(R.id.button3);
        Intent getIntent = getIntent();
        final int total = getIntent.getIntExtra("total",0);
        final String bill = getIntent.getStringExtra("bill");
        TextView detail = findViewById(R.id.detail);
        final TextView price = findViewById(R.id.price);
        detail.setText("Coffee : "+bill);
        price.setText("Price : "+String.valueOf(total + " Bath"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePicker timePicker = findViewById(R.id.timePicker);

                Bill checkBill =new  Bill(bill, user.getUriProfile(), String.valueOf(total)+" Bath", timePicker.getHour()+":"+timePicker.getMinute());
                mBillRef.push().setValue(checkBill);
                Intent intent =new Intent(CheckBill.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });




    }
}
