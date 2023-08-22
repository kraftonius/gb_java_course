package seminar6;

import java.sql.SQLOutput;

public class OOPMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Igor",100);
        Employee another = new Employee("Another", 30);


        String name = employee.getName();
        System.out.println(name);

    }


}



