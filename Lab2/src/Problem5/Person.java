package Problem5;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void assignPet(Animal pet){
        this.pet=pet;
    }

    public void removePet(){
        this.pet = null;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void leavePetWith(Person other){
        if(this.pet != null){
            other.assignPet(this.pet);
            this.removePet();
        }
    }

    public void retrievePetFrom(Person other){
        if(other.pet != null){
            this.assignPet(other.pet);
            other.removePet();
        }
    }

    public abstract String getOccupation();

    public String toString(){
        String petInfo;
        if(pet == null){
            petInfo = "No pet";
        } else{
            petInfo = pet.toString();
        }
        return name + " (" + age + ") - " + getOccupation() + " Pet: " + petInfo;
    }
}
