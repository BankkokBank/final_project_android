package kmitl.bank58070041.finalproject.lazycafe.controller.activity;



import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.model.Coffee;

public class TypeCoffeePage extends AppCompatActivity {
    private String type;

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
                Drawable chooseIt = getResources().getDrawable(R.drawable.blender_choose);
                blend.setBackground(chooseIt);
                ice.setBackground(getResources().getDrawable(R.drawable.ice));
                hot.setBackground(getResources().getDrawable(R.drawable.hot));
                type = "blend";
            }
        });
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.ice_choose);
                ice.setBackground(chooseIt);
                blend.setBackground(getResources().getDrawable(R.drawable.blender));
                hot.setBackground(getResources().getDrawable(R.drawable.hot));
                type = "ice";
            }
        });
        hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable chooseIt = getResources().getDrawable(R.drawable.hot_choose);
                hot.setBackground(chooseIt);
                blend.setBackground(getResources().getDrawable(R.drawable.blender));
                ice.setBackground(getResources().getDrawable(R.drawable.ice));
                type = "hot";
            }
        });
    }

    public void btnNextClick(View view) {
        Coffee typeCoffee = new Coffee();
        typeCoffee.setType(type);
        Intent intent = new Intent(TypeCoffeePage.this, KindCoffeepage.class);
        intent.putExtra("typeCoffee",typeCoffee.getType());
        startActivity(intent);
    }
}





















