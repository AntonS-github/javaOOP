package Les5HW_OOP.model.service;
import Les5HW_OOP.model.data.Contact;
import Les5HW_OOP.model.data.Phone;
import Les5HW_OOP.model.data.User;

import java.util.List;

public class ContactServiceImpl implements ContactService<User> {
    @Override
    public Contact createContact(User user, List<Phone> phoneList) {
        return new Contact(user, phoneList);
    }

    @Override
    public boolean addNumber(Contact contact, Phone phone) {
        return contact.getPhones().add(phone);
    }

    @Override
    public void editUser(Contact contact, String first, String last) {
        contact.getUser().setFirstName(first);
        contact.getUser().setLastName(last);
    }
}
