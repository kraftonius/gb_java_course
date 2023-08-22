package seminar6;

public class Employee {
    // поля
    // конструкторы
    // методы

    // public - виден всем
    // protected - виден внутри пакета + наследники
    // default - виден внутри пакета
    // private - не виден никому

    //static - общее для всех объектов
    //



    //getterы - setterы


    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public boolean isOlderThan(int threshold) {
        return age > threshold;
    }

}
