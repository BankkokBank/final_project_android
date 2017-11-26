package kmitl.bank58070041.finalproject.lazycafe.controller.activity;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import kmitl.bank58070041.finalproject.lazycafe.R;

public class ExtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        final ImageView wipcream = findViewById(R.id.wipcream);
        final ImageView milk_shot = findViewById(R.id.milk_shot);
        final ImageView extra_shot = findViewById(R.id.extra_shot);
        final ImageView double_shot = findViewById(R.id.double_shot);

        wipcream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.hot_choose);
                wipcream.setBackground(chooseIt);

            }
        });

        milk_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.hot_choose);
                milk_shot.setBackground(chooseIt);

            }
        });

        extra_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.hot_choose);
                extra_shot.setBackground(chooseIt);

            }
        });

        double_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.hot_choose);
                double_shot.setBackground(chooseIt);
            }
        });
    }

    public void resetSelected(){
        ImageView wipcream = findViewById(R.id.wipcream);
        ImageView milk_shot = findViewById(R.id.milk_shot);
        ImageView extra_shot = findViewById(R.id.extra_shot);
        ImageView double_shot = findViewById(R.id.double_shot);
        wipcream.setBackground(getResources().getDrawable(R.drawable.hot));
        milk_shot.setBackground(getResources().getDrawable(R.drawable.hot));
        extra_shot.setBackground(getResources().getDrawable(R.drawable.hot));
        double_shot.setBackground(getResources().getDrawable(R.drawable.hot));
    }

    public void btnNextClick(View view) {
            
    }
}
