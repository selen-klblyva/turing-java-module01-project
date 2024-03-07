package Project1;

public class DomesticCat extends Pet implements Foulable{

    @Override
    public void respond(){
        System.out.println("Domestic cat purrs and rubs against you.");
    }
   @Override
    public void foul() {
        System.out.println("Domestic cat scratches furniture.");
    }

}
