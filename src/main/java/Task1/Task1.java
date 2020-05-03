package Task1;

import java.util.ArrayList;
import java.util.List;

/** Задание 1. Написать программу ”Hello, World!”.
 * В ходе выполнения программы она должна выбросить исключение и завершиться с ошибкой.
 * @author Pavel Gaiduk
 */

public class Task1 {
    public static void main(String[] args) throws NegativeNumberException {
        //1. вызов ошибки NullPointerException
        //callNullException();
        //2. вызов ошибки ArrayIndexOutOfBoundsException
        //callArrayException();
        //3. вызов своего варианта ошибки
        callCustomException();
    }
    /**
     * Моделирует ошибку «NullPointerException»
     */
    public static void callNullException(){
        String nullStr = null;
        nullStr.contains("b");
    }

    /**
     * Моделирует ошибку «ArrayIndexOutOfBoundsException»
     */
    public static void callArrayException(){
        int[] emptyList = new int[1];
        System.out.println(emptyList[1]);
    }

    /**
     * Вызывает свой вариант ошибки через оператор throw
     * Ошибка должна вызываться в случае, если число оказалось отрицательным
     * @throws NegativeNumberException
     */
    public static void callCustomException() throws NegativeNumberException {
        int negNumber = -1;
        if(negNumber < 0)
            throw new NegativeNumberException("Число оказалось меньше нуля");
    }
}

