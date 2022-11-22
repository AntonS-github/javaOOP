package Les6;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Les6 {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger ();

        Notebook laptop1 = new Notebook("001");
        Notebook laptop2 = new Notebook("002");
        Notebook laptop3 = new Notebook("003");

        laptop1.setModel ("Dell Vostro");
        laptop1.setMemory (8196);
        laptop1.setHardDiskStorage (500);
        laptop1.setOperatingSystem ("Ubuntu");
        laptop1.setColor ("Black");

        laptop2.setModel ("Apple MacBookPro");
        laptop2.setMemory (16384);
        laptop2.setHardDiskStorage (1000);
        laptop2.setOperatingSystem ("MacOS");
        laptop2.setColor ("Silver");

        laptop3.setModel ("Lenovo IdeaBook");
        laptop3.setMemory (8196);
        laptop3.setHardDiskStorage (1000);
        laptop3.setOperatingSystem ("Windows");
        laptop3.setColor ("Black");

        logger.info(Notebook.infoMessage ());
        //Notebook.filterBy(2, 9000);
        Notebook.filterBy(3, 600);
        ArrayList<Notebook> setOfBooks  = new ArrayList<>();
        setOfBooks.add(laptop1);
        setOfBooks.add(laptop2);
        setOfBooks.add(laptop3);


        var result = Notebook.getNotebooks(setOfBooks);
        logger.info(String.valueOf(result));

    }
}
