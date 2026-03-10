package Problem5;

public class PetTest {
    public static void main(String[] args) {

        Person john = new Employee("Madi", 30, "Engineer");
        Person alice = new PhDStudent("Margulan", 26, "Computer Science", "AI");

        Animal tom = new Cat("Tom", 5);

        john.assignPet(tom);

        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("Initial:");
        System.out.println(registry);

        john.leavePetWith(alice);

        System.out.println("After leaving pet:");
        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println("After retrieving pet:");
        System.out.println(registry);
    }
}
