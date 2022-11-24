package Les1HW;

import java.util.function.Supplier;
import java.util.logging.Logger;
public class Main {

    public static void main(String[] args) {
        HotDrinkInherited drink1 = new HotDrinkInherited ("Americano", 0.3, 150.00, 90);
        HotDrinkInherited drink2 = new HotDrinkInherited ("Cappucino", 0.2, 200.00, 60);
        HotDrinkInherited drink3 = new HotDrinkInherited ("Latte", 0.3, 250.00, 50);

        HotDrinkInherited[] set1 = {drink1, drink3};
        HotDrinkInherited[] set2 = {drink2, drink1};
        HotDrinkInherited[] set3 = {drink1, drink3};

        HotDrinksMachine machine1 = new HotDrinksMachine (set1);
        HotDrinksMachine machine2 = new HotDrinksMachine (set2);
        HotDrinksMachine machine3 = new HotDrinksMachine (set3);


        Logger logger = Logger.getAnonymousLogger ();
        logger.info (String.valueOf (machine1.getProduct ("Latte", 0.3, 50)));
        logger.info (String.valueOf (machine3.getProduct ("Cappucino", 0.3, 50)));
        logger.info (String.valueOf (machine2.getProduct ("Americano", 0.3, 90)));
    }
}
