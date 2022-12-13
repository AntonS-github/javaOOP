package Les5;

import java.util.logging.Logger;


public class les5 {
  //  1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может
  //  иметь несколько телефонов.
//  public static void main(String[] args) {
//      Map<String, List<String>> db = new HashMap<String, List<String>> ();
//      ArrayList<String> value1 = new ArrayList<> (Arrays.asList ("222", "333"));
//      ArrayList<String> value2 = new ArrayList<> (Arrays.asList ("7474", "3796"));
//      ArrayList<String> value3 = new ArrayList<> (Arrays.asList ("222"));
//      ArrayList<String> value4 = new ArrayList<> (null);
//      db.putIfAbsent ("Ivanov Ivan", value1);
//      db.putIfAbsent ("Utkin Vasya", value2);
//      db.putIfAbsent ("Titov Fedor", value3);
//      db.putIfAbsent ("Ivanov Ivan", value4);
//      System.out.println (db.get ("Utkin Vasya"));
//      System.out.println (db.keySet ());
//      System.out.println (db.values ());
//  }
//  2. Пусть дан список сотрудников:
//    Иван Иванов
//    Светлана Петрова
//    Кристина Белова
//    Анна Мусина
//    Анна Крутова
//    Иван Юрин
//    Петр Лыков
//    Павел Чернов
//    Петр Чернышов
//    Мария Федорова
//    Марина Светлова
//    Мария Савина
//    Мария Рыкова
//    Марина Лугова
//    Анна Владимирова
//    Иван Мечников
//    Петр Петин
//    Иван Ежов
//
//    Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности.
//  public static String CheckColleagues(ArrayList<String> colleagues) {
//    Map<String, Integer> colleaguesMatches = new HashMap<> ();
//    for (String name : colleagues) {
//      colleaguesMatches.putIfAbsent (name.split (" ")[0], 0);
//      colleaguesMatches.put (name.split (" ")[0], colleaguesMatches.get (name.split (" ")[0]) + 1);
//    }
//    ArrayList<Integer> list = new ArrayList<> ();
//    LinkedHashMap<String, Integer> sortedFMap = new LinkedHashMap<> ();
//
//    for (Map.Entry<String, Integer> entry : colleaguesMatches.entrySet ()) {
//      list.add (entry.getValue ());
//    }
//    Collections.sort (list);
//    for (int num : list) {
//      for (Map.Entry<String, Integer> entry : colleaguesMatches.entrySet ()) {
//        if (entry.getValue ().equals (num)) {
//          sortedFMap.put (entry.getKey (), num);
//        }
//      }
//    }
//    Object[] allNames = sortedFMap.keySet ().toArray ();
//    for (int i = allNames.length - 1; i >= 0; i--) {
//      if (sortedFMap.containsKey (allNames[i])) {
//        if (sortedFMap.get (allNames[i]) == 1) {
//          sortedFMap.remove (allNames[i]);
//        }
//      }
//    }
//    LinkedHashMap<String, Integer> inversedFMap = new LinkedHashMap<> ();
//    for (int i = sortedFMap.size () - 1; i >= 0; i--) {
//      inversedFMap.put (sortedFMap.keySet ().toArray ()[i].toString (),
//              Integer.parseInt (sortedFMap.values ().toArray ()[i].toString ()));
//    }
//    return inversedFMap.toString ();
//
//  }
//
//  public static void main(String[] args) {
//    Logger logger = Logger.getAnonymousLogger ();
//    ArrayList<String> colleagues = new ArrayList<> ();
//    colleagues.add ("Ivan ivanov");
//    colleagues.add ("Kristin Belova");
//    colleagues.add ("Anna Musina");
//    colleagues.add ("Anna Kurtova");
//    colleagues.add ("Ivan Urin");
//    colleagues.add ("Petr Lukov");
//    colleagues.add ("Pavel Chernov");
//    colleagues.add ("Petr Chernishov");
//    colleagues.add ("Svetlana Petrova");
//    colleagues.add ("Maria Fedorova");
//    colleagues.add ("Svetlana Petrova");
//    colleagues.add ("Maria Fedorova");
//    colleagues.add ("Marina Svetlova");
//    colleagues.add ("Maria Savina");
//    colleagues.add ("Maria Rukova");
//    colleagues.add ("Marina Lugova");
//    colleagues.add ("Anna Vladimirova");
//    colleagues.add ("Ivan Mechnikov");
//    colleagues.add ("Maria Savina");
//    colleagues.add ("Petr Perin");
//    colleagues.add ("Ivan Ezhov");
//
//    logger.info (CheckColleagues (colleagues).toString ());
//  }
//}

//  //3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
//  public static String sort (Integer[] arr) {
//      int n = arr.length;
//      for (int i = n / 2 - 1; i >= 0; i--)
//          heapify(arr, n, i);
//      for (int i=n-1; i>=0; i--)
//      {
//          int temp = arr[0];
//          arr[0] = arr[i];
//          arr[i] = temp;
//          heapify(arr, i, 0);
//      }
//      return arr.toString ();
//  }
//    static void heapify(Integer arr[], int n, int i)
//    {
//        int largest = i; // Инициализируем наибольший элемент как корень
//        int l = 2*i + 1; // левый = 2*i + 1
//        int r = 2*i + 2; // правый = 2*i + 2
//
//        // Если левый дочерний элемент больше корня
//        if (l < n && arr[l] > arr[largest])
//            largest = l;
//        if (r < n && arr[r] > arr[largest])
//            largest = r;
//        if (largest != i)
//        {
//            int swap = arr[i];
//            arr[i] = arr[largest];
//            arr[largest] = swap;
//            heapify(arr, n, largest);
//        }
//    }
//    public static String arrToStr(Integer[] array) {
//        StringBuilder stringArray = new StringBuilder();
//        for (int i = 0; i < array.length - 1; i++) {
//            stringArray.append(array[i]);
//            stringArray.append(", ");
//        }
//        stringArray.append(array[array.length - 1]);
//        return stringArray.toString();
//    }
//
//    public static void main(String args[])
//    {
//        Integer arr[] = {12, 11, 13, 5, 6, 7};
//        Logger logger = Logger.getAnonymousLogger ();
//        logger.info (arrToStr (arr));
//        sort(arr);
//        logger.info (arrToStr (arr));
//    }
    //4. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
    public static void chessBoard(String[] args) {
        pass
    }
}
