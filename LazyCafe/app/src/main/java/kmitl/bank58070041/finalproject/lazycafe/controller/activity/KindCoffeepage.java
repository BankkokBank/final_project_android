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

    final Coffee coffee = new Coffee();
    private int kindCoffeePrice = 0;

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
        coffee.setKindCoffee("");


        espresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.espresso_c);
                espresso.setBackground(chooseIt);
                coffee.setKindCoffee("Espresso");
                kindCoffeePrice = 20;

            }
        });

        americano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.americano_c);
                americano.setBackground(chooseIt);
                coffee.setKindCoffee("Americano");
                kindCoffeePrice = 20;
            }
        });

        macchiato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.macchiato_c);
                macchiato.setBackground(chooseIt);
                coffee.setKindCoffee("Macchiato");
                kindCoffeePrice = 20;
            }
        });

        cappuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.cappuccino_c);
                cappuccino.setBackground(chooseIt);
                coffee.setKindCoffee("Cappuccino");
                kindCoffeePrice = 20;
            }
        });

        flat_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.flat_white_c);
                flat_white.setBackground(chooseIt);
                coffee.setKindCoffee("Flat White");
                kindCoffeePrice = 20;
            }
        });

        mocha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.mocha_c);
                mocha.setBackground(chooseIt);
                coffee.setKindCoffee("Mocha");
                kindCoffeePrice = 20;


            }
        });

        affogato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.affogato_c);
                affogato.setBackground(chooseIt);
                coffee.setKindCoffee("Affogato");
                kindCoffeePrice = 20;

            }
        });

        latte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.latte_c);
                latte.setBackground(chooseIt);
                coffee.setKindCoffee("Latte");
                kindCoffeePrice = 20;
            }
        });

        latte_macchiato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.latte_macchiato_c);
                latte_macchiato.setBackground(chooseIt);
                coffee.setKindCoffee("Latte Macchiato");
                kindCoffeePrice = 20;
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
        espresso.setBackground(getResources().getDrawable(R.drawable.espresso));
        americano.setBackground(getResources().getDrawable(R.drawable.americano));
        macchiato.setBackground(getResources().getDrawable(R.drawable.macchiato));
        cappuccino.setBackground(getResources().getDrawable(R.drawable.cappuccino));
        flat_white.setBackground(getResources().getDrawable(R.drawable.flat_white));
        mocha.setBackground(getResources().getDrawable(R.drawable.mocha));
        affogato.setBackground(getResources().getDrawable(R.drawable.affogato));
        latte.setBackground(getResources().getDrawable(R.drawable.latte));
        latte_macchiato.setBackground(getResources().getDrawable(R.drawable.latte_macchiato));

    }

    public void btnNextClick(View view) {
        Intent intent = new Intent(KindCoffeepage.this, ExtraActivity.class);
        Intent getIntent = getIntent();
        int total = getIntent.getIntExtra("total", 0);
        String bill = getIntent.getStringExtra("bill");
        intent.putExtra("total", total+kindCoffeePrice);
        intent.putExtra("bill", bill + " : " + coffee.getKindCoffee());
        startActivity(intent);
    }
}
