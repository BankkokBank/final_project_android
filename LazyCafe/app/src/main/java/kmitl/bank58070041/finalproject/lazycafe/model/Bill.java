package kmitl.bank58070041.finalproject.lazycafe.model;


public class Bill {
    private String coffee;
    private String picture;
    private String price;
    private String time;

    public Bill(String coffee, String picture, String price, String time) {
        this.coffee = coffee;
        this.picture = picture;
        this.price = price;
        this.time = time;
    }

    public String getCoffee() {return coffee;}

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {return time;}

    public void setTime(String time) {this.time = time;}
}
