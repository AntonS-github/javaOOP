
/*
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 */

// import java.util.Scanner;

// public class Les1 {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// System.out.println("Введите N ");
// int value = scan.nextInt();
// int result_sum = showTotalAmount(value);
// System.out.println("\nСумма чисел до " + value + " = " + result_sum);
// System.out.printf("Факториал числа " + value + " = " + fact(value) + "\n");
// }


// public static int showTotalAmount(int value) {
// int result_sum = 0;
// for (int i = 1; i <= value; i++) {
// result_sum += i;
// }
// return result_sum;

// }

// public static long fact(int i) {
// if ((i == 0) || (i == 1)) {
// return 1;
// }
// return i * fact(i - 1);

// }
// }


/* 2. Вывести все простые числа от 1 до 1000 */


// import java.util.ArrayList;
// import java.util.List;
//
// public class Les1 {
// public static void main(String[] args) {
// List res = new ArrayList();
// boolean flag = true;
// for (int i = 2; i <= 1000; i++) {
// for (int j = 2; j < i; j++) {
// if (i % j == 0) {
// flag = false;
// break;
// }
// }
// if (flag)
// res.add(i);
// else
// flag = true;
// }
// System.out.println(res);
//
// }
// }


/* * 3. Реализовать простой калькулятор */

//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//import static java.lang.System.in;
//import static java.lang.System.out;
//
//public class Les1 {
//    public static void main(String[] args) {
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
//            out.println(res);
//        } else if (operator.equals("-")) {
//            int res = nums_int[0] - nums_int[1];
//            out.println(res);
//        } else if (operator.equals("*")) {
//            int res = nums_int[0] * nums_int[1];
//            out.println(res);
//        } else if (operator.equals("/")) {
//            float res = (float) nums_int[0] / nums_int[1];
//            out.println(res);
//        }
//    }
//}


























