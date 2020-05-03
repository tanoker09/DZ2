package Task3;

/**
 * Класс Person характеризуется полями
 *  age (возраст, целое число 0-100),
 *  sex (пол – объект класса Sex со строковыми константами внутри MAN, WOMAN),
 *  name (имя - строка).
 *  @author Pavel Gaiduk
 *  @project DZ2
 */
public class Person{
    int age;
    String sex;
    String name;

    public Person(int age, String sex, String name) {
        setAge(age);
        setSex(sex);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 100 || age <= 0){
            throw new IllegalArgumentException("Возраст должен быть от 0 до 100");
        }
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex == null){
            throw new IllegalArgumentException("Пол оказался null");
        }
        if(sex.equals("MAN") || sex.equals("WOMAN")){
            this.sex = sex;
        }
        else{
            throw new IllegalArgumentException("Пол должен быть одной из строк: 'MAN', 'WOMAN'");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException("Имя - null");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex=" + sex +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
