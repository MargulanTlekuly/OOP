package Problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee{
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name,double salary, Date hireDate, String insuranceNumber){
        super( name,salary,hireDate,insuranceNumber);
        this.team=new Vector<>();
        this.bonus=0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void addToTeam(Employee e){
        team.add(e);
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Manager)) return false;
        if(!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0;
    }
    @Override
    public int compareTo(Employee other){
        int result = super.compareTo(other);
        if(result == 0 && other instanceof Manager){
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return result;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>();
        for(Employee e : this.team){
            cloned.team.add((Employee) e.clone());
        }
        return cloned;
    }
    @Override
    public String toString() {
        return super.toString() + " Manager[bonus=" + bonus + ", teamSize=" + team.size() + "]";
    }
}
