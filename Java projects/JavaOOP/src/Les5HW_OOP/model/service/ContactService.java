package Les5HW_OOP.model.service;
import Les5HW_OOP.model.data.Contact;
import Les5HW_OOP.model.data.Phone;
import Les5HW_OOP.model.data.User;

import java.util.List;

public interface ContactService<T extends User> {
    public Contact createContact(T user, List<Phone> phoneList);

    public boolean addNumber(Contact contact, Phone phone);

    public void editUser(Contact contact, String first, String second);
}
