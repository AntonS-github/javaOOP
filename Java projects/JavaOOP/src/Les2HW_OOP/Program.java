package Les2HW_OOP;
/*
1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов
2. Создать класс УчебнаяГруппаСервис, в котором реализована логика чтения Студентов и Преподавателя из файла TXT,
создания класса УчебнаяГруппа и возвращения его
3. Создать метод в Контроллере, в котором агрегируются
4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре*/

import Les2HW_OOP.controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller ();
        controller.controllerStart();
    }

}
