package Problem4;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getHireData().compareTo(e2.getHireData());
    }
}
