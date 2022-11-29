package Les3HW_OOP.service;


import Les3HW_OOP.data.Stream;
import Les3HW_OOP.utils.StreamComparator;


import java.util.List;

public class StreamService {

    public void sortStreamList(List<Stream> streamList) {
        streamList.sort(new StreamComparator ());
    }
}