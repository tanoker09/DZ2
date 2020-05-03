package Task3.Sorts;

import Task3.Task3;

/** Ошибка совпадения возраста и имени при сравнении Person
 * @author Pavel Gaiduk
 * @project DZ2
 */
public class SortPersonException extends Exception{
    SortPersonException(String message){
        super(message);
    }
}
