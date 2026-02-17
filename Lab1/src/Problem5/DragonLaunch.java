package Problem5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> line = new Vector<>();

    public void kidnap(Person p) {
        line.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boys = 0;
        for (Person p : line) {
            if (p.getGender() == Gender.BOY) {
                boys++;
            } else {
                if (boys > 0) {
                    boys--;
                } else {
                    return true;
                }
            }
        }
        return boys > 0;
    }

    public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.GIRL));

        if (dl.willDragonEatOrNot()) {
            System.out.println("Dragon will eat!");
        } else {
            System.out.println("No one left for dragon.");
        }
    }
}