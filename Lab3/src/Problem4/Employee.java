package Problem4;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name,double salary, Date hireData, String insuranceNumber){
        super(name);
        this.hireDate=hireData;
        this.salary=salary;
        this.insuranceNumber=insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setHireData(Date hireData) {
        this.hireDate = hireData;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireData() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public int compareTo(Employee other){
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString(){
        return super.toString() + " Employee[=" + salary + ", hireDate=" + hireDate + "]";
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Employee)) return false;
        if(!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(insuranceNumber, employee.insuranceNumber);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
