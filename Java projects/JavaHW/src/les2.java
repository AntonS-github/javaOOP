
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import static java.lang.System.in;
import static java.lang.System.out;

//public class les2 {
//    public static void sortBubbleClassic(int[] array) throws IOException {
//        int maxPosition;
//        int currentPosition;
//        int temp;
//        int switchCount = 0;
//        int compareCount = 0;
//        Logger logger = Logger.getLogger(les2.class.getName());
//        FileHandler fh = new FileHandler("log2.xml");
//        logger.addHandler(fh);
//        XMLFormatter xml = new XMLFormatter();
//        fh.setFormatter(xml);
//        for (maxPosition = array.length - 1; maxPosition >= 0; maxPosition--) {
//            for (currentPosition = 0; currentPosition < maxPosition; currentPosition++) {
//                compareCount++;
//                if (array[currentPosition] > array[currentPosition + 1]) {
//                    temp = array[currentPosition];
//                    array[currentPosition] = array[currentPosition + 1];
//                    array[currentPosition + 1] = temp;
//                    switchCount++;
//                    logger.info("Итерация"+(switchCount+1));
//                }
//            }
//        }
//
//}
//    public static void main(String args[]) throws IOException {
//        int[] array = {12, 6, 4, 1, 15, 10};
//        sortBubbleClassic(array);
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + "\n");
//        }
//    }


    // Задание 3 - Напишите метод, который определит тип (расширение) файлов из текущей папки
// и выведет в консоль результат вида
//1 Расширение файла: txt
//2 Расширение файла: pdf
//3 Расширение файла:
//4 Расширение файла: jpg
//    public static void main(String[] args) throws IOException {
//        File currentDir = new File("/home/antons/Studying/Java projects/JavaHW/src");
//        fileExtention(currentDir);
//    }
//    public static void fileExtention (File dir) throws IOException {
//        List<String> ext = new ArrayList<>();
//        String fileName = null;
//        int count = 0;
//        for ( File file : dir.listFiles() ){
//            if ( file.isFile() )
//                fileName = file.getName();
//                int i = fileName.lastIndexOf('.');
//                ext.add(fileName.substring(i+1));
//                System.out.println(count + " Расширение файла: " + ext.get(ext.size() - 1));
//                count++;
//        }
//    }


//    Задание 4 - К калькулятору из предыдущего дз добавить логирование.
//    public static void main(String[] args) throws IOException {
//        Logger logger = Logger.getLogger(les2.class.getName());
//        FileHandler fh = new FileHandler("log4.xml");
//        logger.addHandler(fh);
//        XMLFormatter xml = new XMLFormatter();
//        fh.setFormatter(xml);
//        Scanner scanInput = new Scanner(in);
//        out.println("Введите выражение для вычисления: ");
//        String input = scanInput.nextLine();
//        String operator = input.replaceAll("\\d", "");
//        String[] nums = input.split("\\D");
//        int[] nums_int = new int[2];
//        for (int i = 0; i < nums_int.length; i++) {
//            nums_int[i] = Integer.parseInt(nums[i]);
//        }
//        if (operator.equals("+")) {
//            int res = nums_int[0] + nums_int[1];
//            logger.info("Проведена операция сложения");
//            out.println(res);
//        } else if (operator.equals("-")) {
//            int res = nums_int[0] - nums_int[1];
//            logger.info("Проведена операция вычитания");
//            out.println(res);
//        } else if (operator.equals("*")) {
//            int res = nums_int[0] * nums_int[1];
//            logger.info("Проведена операция умножения");
//            out.println(res);
//        } else if (operator.equals("/")) {
//            float res = (float) nums_int[0] / nums_int[1];
//            logger.info("Проведена операция деления");
//            out.println(res);
//        }
//    }
//}



