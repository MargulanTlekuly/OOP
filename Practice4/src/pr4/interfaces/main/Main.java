package pr4.interfaces.main;

import pr4.interfaces.model.*;
import pr4.interfaces.services.App;
import pr4.interfaces.services.NameComparator;
import pr4.interfaces.services.Restaurant;
import pr4.interfaces.model.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //Problem2
        Restaurant restaurant = new Restaurant();

        Cat myCat = new Cat();
        Student myStudent = new Student("Madi", 3.9);

        restaurant.servePizza(myCat);
        restaurant.servePizza(myStudent);

        //Problem 3
        App myApp = new App();

        LogicGame lg = new LogicGame();
        MemoryGame mg = new MemoryGame();

        System.out.println("Testing Logic Game:");
        myApp.getStatistics(lg);

        System.out.println("\nTesting Memory Game:");
        myApp.getStatistics(mg);

        System.out.println("\nTesting iPhone:");
        iPhone myPhone = new iPhone();
        myPhone.setPrice(999.99);
        myPhone.plugIn();

        //Problem4
        List<Student> students = new ArrayList<>();
        students.add(new Student("Akezhan", 3.9));
        students.add(new Student("Shynggyskhan ", 3.5));
        students.add(new Student("Margulan", 3.8));

        System.out.println("\nList:");
        for (Student s : students) System.out.println(s);

        Collections.sort(students);
        System.out.println("\nSorting by GPA (Comparable):");
        for (Student s : students){
            System.out.println(s);
        }

        Collections.sort(students, new NameComparator());
        System.out.println("\nSorting by name (Comparator):");
        for (Student s : students){
            System.out.println(s);
        }

        //Bonus Task
        int[] numbers = {10, 5, 2, 0, 7, 5, 2, 1, 9};
        System.out.println("\nArray before Counting Sort: " + java.util.Arrays.toString(numbers));
        pr4.interfaces.services.CountingSort.sort(numbers);
        System.out.println("Array after Counting Sort: " + java.util.Arrays.toString(numbers));
    }
}
