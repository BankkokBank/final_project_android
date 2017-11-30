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

public class TypeCoffeePage extends AppCompatActivity {

    final Coffee coffee = new Coffee();
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_coffee);
        final ImageView blend = findViewById(R.id.blender);
        final ImageView ice = findViewById(R.id.ice);
        final ImageView hot = findViewById(R.id.hot);

        blend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                blend.setBackground(chooseIt);
                coffee.setType("Blend");
                coffee.setPrice(20);
            }
        });
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.ice_choose);
                ice.setBackground(chooseIt);
                coffee.setType("Iced");
                coffee.setPrice(15);
            }
        });
        hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelected();
                Drawable chooseIt = getResources().getDrawable(R.drawable.hot_choose);
                hot.setBackground(chooseIt);
                coffee.setType("Hot");
                coffee.setPrice(10);
            }
        });
    }

    public void resetSelected(){
        ImageView blend = findViewById(R.id.blender);
        ImageView ice = findViewById(R.id.ice);
        ImageView hot = findViewById(R.id.hot);
        hot.setBackground(getResources().getDrawable(R.drawable.hot));
        blend.setBackground(getResources().getDrawable(R.drawable.blender));
        ice.setBackground(getResources().getDrawable(R.drawable.ice));
    }

    public void btnNextClick(View view) {
        Intent intent = new Intent(TypeCoffeePage.this, KindCoffeepage.class);
        String bill = coffee.getType();
        int price = coffee.getPrice();
        intent.putExtra("bill", coffee.getType());
        intent.putExtra("total", coffee.getPrice());
        startActivity(intent);

    }
}





















