package Les1HW;

public class HotDrink {
    public String drinkName;
    public Double volume;
    public Double price;

    public HotDrink(String drinkName, Double volume, Double price) {
        this.drinkName = drinkName;
        this.price = price;
        this.volume = volume;
    }
    public HotDrink() {
        this.drinkName = "default";
        this.price = 100.00;
        this.volume = 0.2;
    }
}
