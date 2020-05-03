package Task2;

import Task1.NegativeNumberException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**Составить программу, генерирующую N случайных чисел.
 * Для каждого числа k вычислить квадратный корень q.
 * Если квадрат целой части q числа равен k, то вывести это число на экран.
 * Предусмотреть что первоначальные числа могут быть отрицательные, в этом случае генерировать исключение.
 * @author Pavel Gaiduk
 * @project DZ2
 */
public class Task2 {
    public static void main(String[] args) throws NegativeNumberException {
        try {
            showSquares(10);
        }
        catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }

    public static void showSquares(int N) throws NegativeNumberException {
        List<Integer> numbers = new ArrayList<>(N);
        Random random = new Random();
        //генерация случайного набора целых чисел
        for(int i = 0; i < N; i++){
            numbers.add(random.nextInt(N * 2) * (random .nextBoolean() ? -1 : 1));
        }

        System.out.println("Сгенерированный набор чисел:");
        System.out.println(numbers.toString());

        for(Integer num : numbers){
            if(num < 0){
                //числа должны быть больше нуля
                throw new NegativeNumberException("Число " + num + " оказалось меньше нуля");
            }
            double result = Math.sqrt(num);
            //проверка, что корень из числа - целое число.
            if(result - Math.floor(result) == 0){
                System.out.println("Корень из числа - целое число:");
                System.out.println(num);
            }
        }
    }
}
