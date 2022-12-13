import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

/* (ВАЖНО) Для вывода необходимо использовать логгер(Java.Util.Logging)*/

public class les3 {

    /*Реализовать алгоритм сортировки слиянием */
//    public static int[] mergeSort(int[] arr) throws IOException {
//        int[] buf = Arrays.copyOf(arr, arr.length);
//        int start = 0;
//        int stop = buf.length - 1;
//        mergeSort(arr, buf, start, stop);
//        return buf;
//    }
//    public static void mergeSort(int[] arr, int[] buf, int start, int end) throws IOException {
//        if (start >= end) {
//            return;
//        }
//        int middle = start + (end - start) / 2;
//        mergeSort(arr, buf, start, middle);
//        mergeSort(arr, buf, middle + 1, end);
//        merging(arr, buf, start, middle, middle + 1, end);
//    }
//    public static int[] merging(int[] array, int[] bufArr, int ls, int le, int rs, int re) throws IOException {
//        for (int i = ls; i <= re; i++) {
//            bufArr[i] = array[i];
//        }
//        int l = ls;
//        int r = rs;
//        for (int i = ls; i <= rs; i++) {
//            if (l > le) {
//                array[i] = bufArr[r];
//                r++;
//            } else if (r > re) {
//                array[i] = bufArr[l];
//                l++;
//            } else if (bufArr[l] < bufArr[r]) {
//                array[i] = bufArr[l];
//                l++;
//            } else {
//                array[i] = bufArr[r];
//                r++;
//            }
//        }
//        return array;
//    }
//    public static void main(String[] args) throws IOException {
//        Logger logger = Logger.getLogger(les3.class.getName());
//        FileHandler fh = new FileHandler("log3.1.xml");
//        logger.addHandler(fh);
//        XMLFormatter xml = new XMLFormatter();
//        fh.setFormatter(xml);
//        int[] resArr = {2, 3, 1, 7, 4};
//        mergeSort(resArr);
//        logger.info("Sorted");
//        for (int i = 0; i < resArr.length; i++) {
//            System.out.print(resArr[i] + " ");
//        }
//    }

//    /* Пусть дан произвольный список целых чисел, удалить из него четные числа */
//    public static List<Integer> evenDel (List<Integer> arr) throws IOException {
//        arr.removeIf(i -> i % 2 == 0);
//        return arr;
//    }
//        public static void main(String[] args) throws IOException {
//            Logger logger = Logger.getLogger(les3.class.getName());
//            FileHandler fh = new FileHandler("log3.2.xml");
//            logger.addHandler(fh);
//            XMLFormatter xml = new XMLFormatter();
//            fh.setFormatter(xml);
//            ArrayList<Integer> A = new ArrayList<Integer>();
//            Collections.addAll(A, 1, 8, 3, 6, 5, 10, 31, 24, 10, 13, 2, 4);
//            evenDel(A);
//            logger.info("Evens successfully deleted");
//            System.out.print(A);
//    }

//
    /*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.*/

    public static List<Integer> minMaxAveVal (List<Integer> arr) throws IOException {
        int minimal = Collections.min(arr);
        int maximum = Collections.max(arr);
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = sum/arr.size();
        System.out.println("Minimum: " + minimal+"\nMaximum: "+ maximum+"\nAverage: "+ average);
        return arr;
    }
        public static void main(String[] args) throws IOException {
            Logger logger = Logger.getLogger(les3.class.getName());
            FileHandler fh = new FileHandler("log3.3.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            ArrayList<Integer> A = new ArrayList<Integer>();
            Collections.addAll(A, 1, 8, 3, 6, 5, 10, 31, 24, 10, 13, 2, 4);
            minMaxAveVal(A);
            logger.info("Min, max and average successfully found");
    }

}
