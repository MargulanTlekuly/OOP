package Problem4;

import java.util.*;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Ali",5000,new Date(),"123");
        Employee e2 = new Employee("Dana",4000,new Date(),"456");

        Manager m = new Manager("Boss",8000,new Date(),"999");
        m.setBonus(2000);

        m.addToTeam(e1);
        m.addToTeam(e2);

        System.out.println(e1);
        System.out.println(m);

        Employee clone = (Employee) e1.clone();
        System.out.println("Clone: " + clone);

        Vector<Employee> list = new Vector<>();
        list.add(e1);
        list.add(e2);

        Collections.sort(list,new NameComparator());
    }
}
