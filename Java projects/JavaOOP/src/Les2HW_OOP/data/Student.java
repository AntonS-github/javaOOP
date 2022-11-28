package Les2HW_OOP.data;

public class Student extends User {
    public Student (String name) {
        super.name = name;
    }

    public Student() {
        super.name = "Unknown student";
    }
}
