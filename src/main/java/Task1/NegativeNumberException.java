package Task1;

/** Ошибка если число оказалось отрицательным
 * @author Pavel Gaiduk
 * @project DZ2
 */
public class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }

}
