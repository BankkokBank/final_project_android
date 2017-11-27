package kmitl.bank58070041.finalproject.lazycafe.controller.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.model.Coffee;

public class KindCoffeepage extends AppCompatActivity {

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

        final Coffee coffee = new Coffee();

        espresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                espresso.setBackground(chooseIt);
                coffee.setKindCoffee("espresso");

            }
        });

        americano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                americano.setBackground(chooseIt);
                coffee.setKindCoffee("americano");
            }
        });

        macchiato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                macchiato.setBackground(chooseIt);
                coffee.setKindCoffee("macchiato");
            }
        });

        cappuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                cappuccino.setBackground(chooseIt);
                coffee.setKindCoffee("cappuccino");
            }
        });

        flat_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                flat_white.setBackground(chooseIt);
                coffee.setKindCoffee("flat_white");
            }
        });

        mocha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                mocha.setBackground(chooseIt);
                coffee.setKindCoffee("mocha");


            }
        });

        affogato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                affogato.setBackground(chooseIt);
                coffee.setKindCoffee("affogato");

            }
        });

        latte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                latte.setBackground(chooseIt);
                coffee.setKindCoffee("latte");
            }
        });

        latte_macchiato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                latte_macchiato.setBackground(chooseIt);
                coffee.setKindCoffee("latte_macchiato");
            }
        });


    }

    public void resetSelected(){
        ImageView espresso = findViewById(R.id.espresso);
        ImageView americano = findViewById(R.id.americano);
        ImageView macchiato = findViewById(R.id.macchiato);
        ImageView cappuccino = findViewById(R.id.cappuccino);
        ImageView flat_white = findViewById(R.id.flat_white);
        ImageView mocha = findViewById(R.id.mocha);
        ImageView affogato = findViewById(R.id.affogato);
        ImageView latte = findViewById(R.id.latte);
        ImageView latte_macchiato = findViewById(R.id.latte_macchiato);
        espresso.setBackground(getResources().getDrawable(R.drawable.blender));
        americano.setBackground(getResources().getDrawable(R.drawable.blender));
        macchiato.setBackground(getResources().getDrawable(R.drawable.blender));
        cappuccino.setBackground(getResources().getDrawable(R.drawable.blender));
        flat_white.setBackground(getResources().getDrawable(R.drawable.blender));
        mocha.setBackground(getResources().getDrawable(R.drawable.blender));
        affogato.setBackground(getResources().getDrawable(R.drawable.blender));
        latte.setBackground(getResources().getDrawable(R.drawable.blender));
        latte_macchiato.setBackground(getResources().getDrawable(R.drawable.blender));

    }

    public void btnNextClick(View view) {
        Coffee coffee = new Coffee();
        Intent intent = new Intent(KindCoffeepage.this, ExtraActivity.class);
        Intent getIntent = getIntent();
        int total = getIntent.getIntExtra("total", 0);
        String typeCoffee = getIntent.getStringExtra("bill");
        intent.putExtra("total", total+20);
        intent.putExtra("bill", typeCoffee + " : " + coffee.getKindCoffee());

        Log.i("totalTag", String.valueOf(total+20));
        Log.i("typeTag", typeCoffee+coffee.getKindCoffee());

        startActivity(intent);
    }
}
