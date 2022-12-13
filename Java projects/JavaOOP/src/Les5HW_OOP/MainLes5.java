package Les5HW_OOP;

import Les5HW_OOP.controller.Controller;
import Les5HW_OOP.view.ConsoleViewImpl;

public class MainLes5 {

    public static void main(String[] args) {
        Controller controller = new Controller(new ConsoleViewImpl ());
        controller.start();
    }
}
