package kmitl.bank58070041.finalproject.lazycafe.controller.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.model.Coffee;

public class ExtraActivity extends AppCompatActivity {

    private int extraPrice;
    Coffee coffee = new Coffee();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        final ImageView wipcream = findViewById(R.id.wipcream);
        final ImageView milk_shot = findViewById(R.id.milk_shot);
        final ImageView extra_shot = findViewById(R.id.extra_shot);
        final ImageView double_shot = findViewById(R.id.double_shot);
        coffee.setExtra("");

        wipcream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.whipcream_c);
                wipcream.setBackground(chooseIt);
                coffee.setExtra("Wipcream");
                extraPrice = 15;

            }
        });

        milk_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.milk_c);
                milk_shot.setBackground(chooseIt);
                coffee.setExtra("Milk Shot");
                extraPrice = 10;

            }
        });

        extra_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.shot_c);
                extra_shot.setBackground(chooseIt);
                coffee.setExtra("Extra Shot");
                extraPrice = 20;

            }
        });

        double_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.double_shot_c);
                double_shot.setBackground(chooseIt);
                coffee.setExtra("Double Shot");
                extraPrice = 35;

            }
        });
    }

    public void resetSelected(){
        ImageView wipcream = findViewById(R.id.wipcream);
        ImageView milk_shot = findViewById(R.id.milk_shot);
        ImageView extra_shot = findViewById(R.id.extra_shot);
        ImageView double_shot = findViewById(R.id.double_shot);
        wipcream.setBackground(getResources().getDrawable(R.drawable.whipcream));
        milk_shot.setBackground(getResources().getDrawable(R.drawable.milk));
        extra_shot.setBackground(getResources().getDrawable(R.drawable.shot));
        double_shot.setBackground(getResources().getDrawable(R.drawable.double_shot));
    }

    public void btnNextClick(View view) {
        Intent intent = new Intent(ExtraActivity.this, CheckBill.class);
        Intent getIntent = getIntent();
        int total = getIntent.getIntExtra("total",0);
        String bill = getIntent.getStringExtra("bill");
        intent.putExtra("total", total+extraPrice);
        intent.putExtra("bill",bill+ " : " + coffee.getExtra());
        startActivity(intent);

    }
}
