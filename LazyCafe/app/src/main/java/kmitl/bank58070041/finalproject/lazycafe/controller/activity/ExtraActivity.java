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
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                wipcream.setBackground(chooseIt);
                milk_shot.setBackground(getResources().getDrawable(R.drawable.hot));
                extra_shot.setBackground(getResources().getDrawable(R.drawable.hot));
                double_shot.setBackground(getResources().getDrawable(R.drawable.hot));

            }
        });

        milk_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                milk_shot.setBackground(chooseIt);
                wipcream.setBackground(getResources().getDrawable(R.drawable.hot));
                extra_shot.setBackground(getResources().getDrawable(R.drawable.hot));
                double_shot.setBackground(getResources().getDrawable(R.drawable.hot));


            }
        });

        extra_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                extra_shot.setBackground(chooseIt);
                wipcream.setBackground(getResources().getDrawable(R.drawable.hot));
                milk_shot.setBackground(getResources().getDrawable(R.drawable.hot));
                double_shot.setBackground(getResources().getDrawable(R.drawable.hot));

            }
        });

        double_shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                double_shot.setBackground(chooseIt);
                wipcream.setBackground(getResources().getDrawable(R.drawable.hot));
                extra_shot.setBackground(getResources().getDrawable(R.drawable.hot));
                milk_shot.setBackground(getResources().getDrawable(R.drawable.hot));

            }
        });
    }

    public void btnNextClick(View view) {
            
    }
}
