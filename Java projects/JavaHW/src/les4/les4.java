package les4;
/*
3*. В калькулятор добавьте возможность отменить последнюю операцию
*/

// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import static java.lang.Character.isDigit;

public class les4 {
//    public static void main (String[] args) {
//        Logger logger = Logger.getAnonymousLogger();
//        List<String> listStr = new LinkedList<>();
//        Collections.addAll(listStr, "rr", "ee", "ttt");
//        Collections.reverse(listStr);
//        logger.info(String.valueOf(listStr));
//    }

//    //2. Реализуйте очередь с помощью LinkedList со следующими методами:
//    //    enqueue() - помещает элемент в конец очереди,
//    //    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    //    first() - возвращает первый элемент из очереди, не удаляя.
//
//
//        static LinkedList<String> listStr = new LinkedList<>();
//        public static LinkedList<String> enqueue(String str) {
//            listStr.addLast(str);
//            return listStr;
//        }
//        public static Object dequeue () {
//            return "First element: "+ listStr.pollFirst()+ "; Updated list: " + listStr;
//        }
//        public static Object first() {
//            return "First element: "+ listStr.peekFirst()+ "; Not updated list: " + listStr;
//        }
//        public static void main(String[] args) {
//            Logger logger = Logger.getAnonymousLogger();
//            logger.info(String.valueOf(enqueue("rrr")));
//            logger.info(String.valueOf(enqueue("eee")));
//            logger.info(String.valueOf(enqueue("tsss")));
//            logger.info(String.valueOf(enqueue("ooo")));
//            logger.info(String.valueOf(enqueue("ttt")));
//            logger.info(String.valueOf(dequeue()));
//            logger.info(String.valueOf(first()));
//        }

//4.Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
//http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181 Вычислить запись если это возможно

    public static int checkOperPriority (char c)
    {
        if (c == '*' || c == '/') {
            return 1;
        }
        if (c == '+' || c == '-') {
            return 2;
        }
        return Integer.MAX_VALUE;
    }
    public static boolean checkOperator(char c)
    {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    public static String infixToPostfix(String infix)
    {
        if (infix == null || infix.length() == 0) {
            return infix;
        }
        Stack<Character> s = new Stack<>();
        String postfix = "";
        for (char c: infix.toCharArray())
        {
            if (c == '(') {
                s.add(c);
            }
            else if (c == ')')
            {
                while (s.peek() != '(') {
                    postfix += s.pop();
                }
                s.pop();
            }
            else if (checkOperator(c)) {
                postfix += c;
            }
            else {
                while (!s.isEmpty() && checkOperPriority(c) >= checkOperPriority(s.peek())) {
                    postfix += s.pop();
                }
                s.add(c);
            }
        }
        while (!s.isEmpty()) {
            postfix += s.pop();
        }
        return postfix;
    }
    public static String calculatorPostfix(String postfix) {
        int res = 0;
        Stack<Integer> st = new Stack<> ();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (isDigit(c)) {
                st.push (Character.getNumericValue (c));
            } else {
                switch (c) {
                    case '+':
                        res = st.pop () + st.pop ();
                        st.push (res);
                        break;
                    case '-':
                        res = -st.pop () + st.pop ();
                        st.push (res);
                        break;
                    case '*':
                        res = st.pop () * st.pop ();
                        st.push (res);
                        break;
                    case '/':
                        res = st.pop () / st.pop ();
                        st.push (res);
                        break;
                    default:
                        break;
                }
            }
        }
        res = st.pop ();
        return String.valueOf (res);
    }

    public static void main(String[] args)    {
        Logger logger = Logger.getAnonymousLogger ();
        String infix = "1*2+7-3";
        String postfix = infixToPostfix(infix);
        String res = calculatorPostfix(postfix);
        logger.info (postfix + " = " + res);

    }
}
