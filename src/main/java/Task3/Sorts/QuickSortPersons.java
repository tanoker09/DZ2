package Task3.Sorts;

import Task3.Person;

import java.util.ArrayList;

/** Класс быстрой сортировки ArrayList<Person>
 * @author Pavel Gaiduk
 * @project DZ2
 */
public class QuickSortPersons implements PersonsSortable{
    /**
     * Алгоритм быстрой сортировки
     * @param persons список Person
     * @return время работы алгоритма
     * @throws SortPersonException
     * @author Pavel Gaiduk
     * @project DZ2
     */
    @Override
    public long sort(ArrayList<Person> persons) throws SortPersonException {
        long startTime = System.nanoTime();
        qsort(persons, 0, persons.size() - 1);
        long endTime = System.nanoTime();

        return (endTime - startTime);
    }

    /**
     * Перестановка элементов в подмассиве
     * @param arr список Person
     * @param low индекс с которого начинается перестановка
     * @param high индекс на котором заканчивается перестановка
     * @return индекс элемента разбиения массива
     * @throws SortPersonException
     */
    private int partition(ArrayList<Person> arr, int low, int high) throws SortPersonException {
        Person pivot = arr.get(high);
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (!comparePersons(arr.get(j), pivot))
            {
                i++;

                // swap arr[i] and arr[j]
                Person temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Person temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i+1;
    }

    /**
     *
     * @param arr список Person
     * @param low индекс начала подмассива для сортировки
     * @param high индекс конца подмассива для сортировки
     * @throws SortPersonException
     */
    private void qsort(ArrayList<Person> arr, int low, int high) throws SortPersonException {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            qsort(arr, low, pi-1);
            qsort(arr, pi+1, high);
        }
    }
}
