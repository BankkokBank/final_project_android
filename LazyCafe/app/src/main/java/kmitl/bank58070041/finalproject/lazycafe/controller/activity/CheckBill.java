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

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.model.Coffee;

public class CheckBill extends AppCompatActivity {


    Coffee coffee = new Coffee();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_bill);
        Button button = findViewById(R.id.button3);
        Intent getIntent = getIntent();
        int total = getIntent.getIntExtra("total",0);
        String bill = getIntent.getStringExtra("bill");
        TextView detail = findViewById(R.id.detail);
        TextView price = findViewById(R.id.price);
        detail.setText("Detail : "+bill);
        price.setText("Price : "+String.valueOf(total + " Bath"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePicker timePicker = findViewById(R.id.timePicker);
                coffee.setTime(timePicker.getHour() +":"+timePicker.getMinute());
                Intent intent =new Intent(CheckBill.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });




    }
}
