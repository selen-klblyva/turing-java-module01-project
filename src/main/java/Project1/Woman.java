package Project1;

public final class Woman extends Human{
    public Woman(String name,String surname,int yearofBirth,int iq,String[][] schedule){
        super(name,surname,yearofBirth,iq,schedule);
    }
    @Override
    public void greetPet(Pet pet){
        System.out.println("Hello,my dear "+pet.getSpecies()+"!");
    }

    public void makeup() {
        System.out.println("Woman is applying makeup.");
    }

}
