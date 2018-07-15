package Homecoding;

public class Car {
    public int weight;
    public String mark;
    public String colour;
    public int max_speed;
    private int price;
    public int year_of_release;

    public void setPrice(int new_price){
        price = new_price;
    }

    public int years_on_roads(){
        return 2017 - year_of_release;
    }
}
