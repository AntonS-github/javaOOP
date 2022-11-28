package Les2HW_OOP.data;

public class User {
    public String name;

    public User (String name) {
        this.name = name;
    }

    public User() {
        this.name = "John Doe";
    }

    @Override
    public String toString() {
        return this.name.toString();
    }
}
