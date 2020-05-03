package Task3;

import Task3.Sorts.BubbleSortPersons;
import Task3.Sorts.PersonsSortable;
import Task3.Sorts.QuickSortPersons;
import Task3.Sorts.SortPersonException;

import java.util.ArrayList;

/**
 * Дан массив объектов Person. Класс Person характеризуется полями
 * age (возраст, целое число 0-100),
 * sex (пол – объект класса Sex со строковыми константами внутри MAN, WOMAN),
 * name (имя - строка).
 * Создать два класса, методы которых будут реализовывать сортировку объектов.
 * Предусмотреть единый интерфейс для классов сортировки.
 * Реализовать два различных метода сортировки этого массива по правилам:
 * первые идут мужчины
 * выше в списке тот, кто более старший
 * имена сортируются по алфавиту
 * Программа должна вывести на экран отсортированный список и время работы каждого алгоритма сортировки.
 * Предусмотреть генерацию исходного массива (10000 элементов и более).
 * Если имена людей и возраст совпадают, выбрасывать в программе пользовательское исключение.
 *
 * @author Pavel Gaiduk
 * @project DZ2
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Person> persons = Generator.generatePersons(100);
        ArrayList<Person> persons2 = Generator.generatePersons(100);

//        ArrayList<Person> persons = Generator.getConstPersons();
//        ArrayList<Person> persons2 = Generator.getConstPersons();

        PersonsSortable bubbleSort = new BubbleSortPersons();
        PersonsSortable quickSort = new QuickSortPersons();
        try {
            long time = bubbleSort.sort(persons);
            System.out.println("Сортировка пузырьком");
            System.out.println(persons);
            System.out.println("Время работы: " + time);
            System.out.println("-------------------");

            long time2 = quickSort.sort(persons2);
            System.out.println("Быстрая сортировка");
            System.out.println(persons2);
            System.out.println("Время работы: " + time2);
            System.out.println("-------------------");
        }
        catch (SortPersonException e){
            System.out.println(e.getMessage());
        }


    }
}

