package kmitl.bank58070041.finalproject.lazycafe.model;

import android.widget.EditText;

/**
 * Created by Bankkok_Bank on 25/11/2560.
 */

public class Coffee {
    private String type;
    private String kindCoffee;

    public Coffee() {
    }

    public Coffee(String type, String kindCoffee) {
        this.type = type;
        this.kindCoffee = kindCoffee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKindCoffee() {
        return kindCoffee;
    }

    public void setKindCoffee(String kindCoffee) {
        this.kindCoffee = kindCoffee;
    }

    public void coffeeChoose(String one){}
}

