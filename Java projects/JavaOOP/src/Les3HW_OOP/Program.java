package Les3HW_OOP;
//- Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable
//        - Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток
//        - Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator
//        - Модифицировать класс Контроллер, добавив в него созданный сервис
//        - Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, путем вызова созданного сервиса
import Les3HW_OOP.controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller ();
        controller.controllerStart();
    }

}
