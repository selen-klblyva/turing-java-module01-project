package Project1;

public final class Man extends Human{

    public Man(String name,String surname,int yearofBirth,int iq,String[][] schedule){
        super(name,surname,yearofBirth,iq,schedule);
    }

    @Override
    public void greetPet(Pet pet){
        System.out.println("Hello,my sweet Pet");
    }
    public void repairCar() {
        System.out.println("Man is repairing the car.");
    }

}
