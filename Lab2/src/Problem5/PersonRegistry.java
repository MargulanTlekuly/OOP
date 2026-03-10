package Problem5;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people = new Vector<>();

    public void addPerson(Person p){
        people.add(p);
    }

    public void removePerson(Person p){
        people.remove(p);
    }

    public void printPeopleWithPets(){
        for(Person p : people){
            if(p.hasPet()){
                System.out.println(p);
            }
        }
    }

    public void printPeopleWithoutPets(){
        for(Person p : people){
            if(!p.hasPet()){
                System.out.println(p);
            }
        }
    }

    public String toString(){
        String result = "Registry:\n";
        for(Person p : people){
            result += p + "\n";
        }
        return result;
    }
}
