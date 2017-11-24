package kmitl.bank58070041.finalproject.lazycafe.controller.activity;

import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.controller.fragment.KindCoffeeFragment;
import kmitl.bank58070041.finalproject.lazycafe.model.Coffee;

public class BuyCoffee extends AppCompatActivity {
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_coffee);
        final ImageView blend = findViewById(R.id.blender);
        final ImageView ice = findViewById(R.id.ice);
        final ImageView hot = findViewById(R.id.hot);

        blend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                blend.setBackground(chooseIt);
                ice.setBackground(getResources().getDrawable(R.drawable.ice));
                hot.setBackground(getResources().getDrawable(R.drawable.hot));
                type = "blend";
            }
        });
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                ice.setBackground(chooseIt);
                blend.setBackground(getResources().getDrawable(R.drawable.blender));
                hot.setBackground(getResources().getDrawable(R.drawable.hot));
                type = "ice";
            }
        });
        hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                hot.setBackground(chooseIt);
                blend.setBackground(getResources().getDrawable(R.drawable.blender));
                ice.setBackground(getResources().getDrawable(R.drawable.ice));
                type = "hot";
            }
        });
    }

    public void btnNextClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout,new KindCoffeeFragment()).commit();
        Coffee typeCoffee = new Coffee();
        typeCoffee.setType(type);
    }
}
