package Project1;

public class Dog extends Pet implements Foulable{


    @Override
    public void respond(){
        System.out.println("Dogs bark sharply.");
    }
    @Override
    public void foul() {
        System.out.println("Dog leaves a mess on the floor.");
    }
}
