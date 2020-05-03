package Task3;

import java.util.ArrayList;
import java.util.Random;

/** Класс генерации ArrayList<Person>
 * @author Pavel Gaiduk
 * @project DZ2
 */
public class Generator{
    /**
     * @return зашитый список из 10 Person
     */
    public static ArrayList<Person> getConstPersons(){
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person(25, "MAN", "Petrov"));
        persons.add(new Person(32, "MAN", "Sidorov"));
        persons.add(new Person(54, "MAN", "Ivanov"));
        persons.add(new Person(67, "WOMAN", "Medvedeva"));
        persons.add(new Person(33, "MAN", "Chistyakov"));
        persons.add(new Person(20, "MAN", "Konev"));
        persons.add(new Person(25, "MAN", "Milonov"));
        persons.add(new Person(25, "MAN", "Medvedev"));
        persons.add(new Person(25, "WOMAN", "Piankova"));

        return persons;
    }

    /**
     * генерация списка Person
     * @param N количество элементов списка
     * @return список Person
     */
    public static ArrayList<Person> generatePersons(int N){
        ArrayList<Person> persons = new ArrayList<Person>();
        for(int i = 0; i < N; i++) {
            String name = generateName(10);
            int age = generateAge();
            String sex = generateSex();

            persons.add(new Person(age, sex, name));
        }

        return persons;
    }

    /**
     * Генерация поля name для Person
     * @param size имени
     * @return String
     */
    public static String generateName(int size){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(size)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    /**
     * Генерация поля age для Person
     */
    public static int generateAge(){
        Random random = new Random();
        return random.nextInt(99) + 1;
    }

    /**
     * Генерация поля sex для Person
     * @return "MAN" или "WOMAN"
     */
    public static String generateSex(){
        Random random = new Random();
        return random.nextBoolean() ? "MAN" : "WOMAN";
    }

}
