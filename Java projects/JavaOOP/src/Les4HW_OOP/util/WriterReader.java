package Les4HW_OOP.util;

import Les4HW_OOP.model.data.Task;
import Les4HW_OOP.model.data.User;
import java.util.List;
public interface WriterReader {
    public void updateDB(String path, List<Task<? extends User>> data);

    public String read(String path);
}
