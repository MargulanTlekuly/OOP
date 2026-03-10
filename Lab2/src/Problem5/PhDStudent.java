package Problem5;

public class PhDStudent extends Student{
    private String researchArea;

    public PhDStudent(String name, int age, String major, String researchArea){
        super(name, age, major);
        this.researchArea = researchArea;
    }

    public String getOccupation(){
        return "PhD Student (" + major + ", research: " + researchArea + ")";
    }
    @Override
    public void assignPet(Animal pet){
        if(pet instanceof Dog){
            System.out.println("PhD students cannot have dogs!");
            return;
        }
        this.pet = pet;
    }
}
