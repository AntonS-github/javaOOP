package Les5HW_OOP.model.service;

import Les5HW_OOP.model.data.User;

public interface UserService {
    public boolean isCorrect(String s);

    public User createUser(String firstName, String lastName);
}
