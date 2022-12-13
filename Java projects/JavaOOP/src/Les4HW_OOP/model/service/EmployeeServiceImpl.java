package Les4HW_OOP.model.service;
import Les4HW_OOP.model.data.Employee;
import Les4HW_OOP.model.data.User;
import Les4HW_OOP.view.View;

public class EmployeeServiceImpl implements UserService {
    private View view;

    public EmployeeServiceImpl(View view) {
        this.view = view;
    }

    @Override
    public User createUser(String[] param) {
        if (param.length == 3) {
            Employee employee = new Employee(param[0], param[1], param[2]);
            view.set("Создан " + employee);
            return employee;
        }
        view.set("Заданы неверные параметры.");
        return null;
    }

}
