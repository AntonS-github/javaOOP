package Les1HW;

import java.util.ArrayList;

public class HotDrinksMachine implements VendingMachine {

    public ArrayList<HotDrinkInherited> products = new ArrayList<> ();

    public HotDrinksMachine (HotDrinkInherited[] products) {
        for (HotDrinkInherited inheritedProduct : products) {
            this.products.add(inheritedProduct);
        }
    }

    @Override
    public HotDrinkInherited getProduct(String name, Double volume, int temperature) {
        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).volume.equals(volume) && products.get(i).drinkName.equals(name) &&
                    products.get(i).temperature==(temperature)) {
                return products.get(i);
            }
        }
        return new HotDrinkInherited ("Nothing",  0.0  , 0.0 , 0);
    }
}
