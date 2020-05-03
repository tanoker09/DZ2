package Task3.Sorts;

import Task3.Person;

import java.util.ArrayList;

/** Интерфейс сортировки ArrayList<Person>
 * @author Pavel Gaiduk
 * @project DZ2
 */
public interface PersonsSortable {
    /**
     * Компаратор для сравнения двух Person
     * @return true, если a > b
     * @throws SortPersonException
     * @author Pavel Gaiduk
     * @project DZ2
     */
    default boolean comparePersons(Person a, Person b) throws SortPersonException{
        if(a == null || b == null){
            throw new SortPersonException("В массиве оказался null");
        }

        String sexA = a.getSex();
        String sexB = b.getSex();
        if(!sexA.equals(sexB)){
            return sexA.equals("WOMAN");
        }

        int ageA = a.getAge();
        int ageB = b.getAge();
        if(ageA != ageB){
            return ageA > ageB;
        }

        String nameA = a.getName();
        String nameB = b.getName();
        int nameEquals = nameA.compareTo(nameB);
        if(nameEquals == 0){
            throw new SortPersonException("В массиве оказался дубликат. " + a + " " + b);
        }

        return nameEquals > 0;
    }

    /**
     * Алгоритм сортировки
     * @param persons список Person
     * @return время работы алгоритма
     * @throws SortPersonException
     * @author Pavel Gaiduk
     * @project DZ2
     */
    public long sort(ArrayList<Person> persons) throws SortPersonException;
}
