package kmitl.bank58070041.finalproject.lazycafe.controller.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.model.Coffee;

public class KindCoffeepage extends AppCompatActivity {
    private Coffee coffee;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kind_coffeepage);
        final ImageView espresso = findViewById(R.id.espresso);
        final ImageView americano = findViewById(R.id.americano);
        final ImageView macchiato = findViewById(R.id.macchiato);
        final ImageView cappuccino = findViewById(R.id.cappuccino);
        final ImageView flat_white = findViewById(R.id.flat_white);
        final ImageView mocha = findViewById(R.id.mocha);
        final ImageView affogato = findViewById(R.id.affogato);
        final ImageView latte = findViewById(R.id.latte);
        final ImageView latte_macchiato = findViewById(R.id.latte_macchiato);

        espresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                espresso.setBackground(chooseIt);
                americano.setBackground(getResources().getDrawable(R.drawable.blender));
                macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
                cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
                flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
                mocha.setBackground(getResources().getDrawable(R.drawable.blender));
                affogato.setBackground(getResources().getDrawable(R.drawable.blender));
                latte.setBackground(getResources().getDrawable(R.drawable.blender));
                latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

        americano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                americano.setBackground(chooseIt);
                espresso.setBackground(getResources().getDrawable(R.drawable.blender));
                macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
                cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
                flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
                mocha.setBackground(getResources().getDrawable(R.drawable.blender));
                affogato.setBackground(getResources().getDrawable(R.drawable.blender));
                latte.setBackground(getResources().getDrawable(R.drawable.blender));
                latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

        macchiato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                macchiato.setBackground(chooseIt);
                espresso.setBackground(getResources().getDrawable(R.drawable.blender));
                americano.setBackground(getResources().getDrawable(R.drawable.blender));
                cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
                flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
                mocha.setBackground(getResources().getDrawable(R.drawable.blender));
                affogato.setBackground(getResources().getDrawable(R.drawable.blender));
                latte.setBackground(getResources().getDrawable(R.drawable.blender));
                latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

        cappuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                cappuccino.setBackground(chooseIt);
                espresso.setBackground(getResources().getDrawable(R.drawable.blender));
                macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
                americano.setBackground(getResources().getDrawable(R.drawable.blender));
                flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
                mocha.setBackground(getResources().getDrawable(R.drawable.blender));
                affogato.setBackground(getResources().getDrawable(R.drawable.blender));
                latte.setBackground(getResources().getDrawable(R.drawable.blender));
                latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

        flat_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                flat_white.setBackground(chooseIt);
                espresso.setBackground(getResources().getDrawable(R.drawable.blender));
                macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
                americano.setBackground(getResources().getDrawable(R.drawable.blender));
                cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
                mocha.setBackground(getResources().getDrawable(R.drawable.blender));
                affogato.setBackground(getResources().getDrawable(R.drawable.blender));
                latte.setBackground(getResources().getDrawable(R.drawable.blender));
                latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

        mocha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                mocha.setBackground(chooseIt);
                espresso.setBackground(getResources().getDrawable(R.drawable.blender));
                macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
                americano.setBackground(getResources().getDrawable(R.drawable.blender));
                cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
                flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
                affogato.setBackground(getResources().getDrawable(R.drawable.blender));
                latte.setBackground(getResources().getDrawable(R.drawable.blender));
                latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

        affogato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                affogato.setBackground(chooseIt);
                espresso.setBackground(getResources().getDrawable(R.drawable.blender));
                macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
                americano.setBackground(getResources().getDrawable(R.drawable.blender));
                cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
                flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
                mocha.setBackground(getResources().getDrawable(R.drawable.blender));
                latte.setBackground(getResources().getDrawable(R.drawable.blender));
                latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

        latte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                latte.setBackground(chooseIt);
                espresso.setBackground(getResources().getDrawable(R.drawable.blender));
                macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
                americano.setBackground(getResources().getDrawable(R.drawable.blender));
                cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
                flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
                mocha.setBackground(getResources().getDrawable(R.drawable.blender));
                affogato.setBackground(getResources().getDrawable(R.drawable.blender));
                latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

        latte_macchiato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.com_facebook_button_like_icon_selected);
                latte_macchiato.setBackground(chooseIt);
                espresso.setBackground(getResources().getDrawable(R.drawable.blender));
                macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
                americano.setBackground(getResources().getDrawable(R.drawable.blender));
                cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
                flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
                mocha.setBackground(getResources().getDrawable(R.drawable.blender));
                affogato.setBackground(getResources().getDrawable(R.drawable.blender));
                latte.setBackground(getResources().getDrawable(R.drawable.blender));
            }
        });

    }
}
