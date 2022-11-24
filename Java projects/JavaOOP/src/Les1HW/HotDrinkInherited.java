package Les1HW;

public class HotDrinkInherited extends HotDrink {
    public int temperature;

    public HotDrinkInherited(String drinkName, Double volume, Double price, int temp) {
        super.drinkName = drinkName;
        super.volume = volume;
        super.price = price;
        this.temperature = temp;
    }

    @Override
    public String toString() {
        return String.format ("Your drink is: %s, Temerature is: %s, Size is: %s, Price is: %s",
                super.drinkName, this.temperature, super.volume, super.price);
    }
}
