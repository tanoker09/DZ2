package Task3.Sorts;

import Task3.Person;

import java.util.ArrayList;
/** Класс сортировки ArrayList<Person> пузырьком
 * @author Pavel Gaiduk
 * @project DZ2
 */
public class BubbleSortPersons implements PersonsSortable{
    /**
     * Алгоритм сортировки пузырьком
     * @param persons список Person
     * @return время работы алгоритма
     * @throws SortPersonException
     * @author Pavel Gaiduk
     * @project DZ2
     */
    @Override
    public long sort(ArrayList<Person> persons) throws SortPersonException {
        long startTime = System.nanoTime();

        int n = persons.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (comparePersons(persons.get(j), persons.get(j + 1)))
                {
                    // swap arr[j+1] and arr[i]
                    Person temp = persons.get(j);
                    persons.set(j, persons.get(j+1));
                    persons.set(j + 1, temp);
                }

        long endTime = System.nanoTime();

        return (endTime - startTime);
    }
}
