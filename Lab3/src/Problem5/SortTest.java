package Problem5;

import Problem4.Employee;

import java.util.Date;

public class SortTest {
    public static void main(String[] args){
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50.5),
                new Chocolate("Snickers",45.0),
                new Chocolate("Bounty", 55.2)
        };

        System.out.println("---- Before the Sorting ---");
        for(Chocolate c:chocolates){
            System.out.println(c.toString());
        }

        Sort.bubbleSort(chocolates);

        System.out.println("--- After the Sorting ---");
        for(Chocolate c:chocolates){
            System.out.println(c.toString());
        }

        System.out.println("\n--- Time Sorting ---");
        Time[] times = {
                new Time(14,30,0),
                new Time(9,15,30),
                new Time(13,30,15)
        };

        Sort.bubbleSort(times);
        for(Time t:times){
            System.out.println(t.toUniversal());
        }
        System.out.println("\n--- Employee Sorting ---");
        Employee[] employees ={
                new Employee("Alice", 75000.0, new Date(), "AB123456C"),
                new Employee("Bob", 50000.0, new Date(), "XY987654Z"),
                new Employee("Charlie", 60000.0, new Date(), "KL555555M")
        };

        Sort.bubbleSort(employees);
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

    }
}

