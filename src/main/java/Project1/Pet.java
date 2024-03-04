package Project1;


import java.util.Arrays;
public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species,String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(String species,String nickname,int age,int trickLevel,String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }

    public void setSpecies(String species){
        this.species=species;
    }
    public String getSpecies(){
        return this.species;
    }
    public void setNickname(String nickname){
        this.nickname=nickname;
    }
    public String getNickname(){
        return this.nickname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setTrickLevel(int trickLevel){
        this.trickLevel=trickLevel;
    }
    public int getTrickLevel(){
        return this.trickLevel;
    }

    public Pet(){

    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello owner.I am"+nickname+". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }
    public String toString1() {
        return (species + "{nickname= " + nickname + " , age= " + age + ", trickLevel= " + trickLevel + ", habits= " + Arrays.toString(habits) + "}");
    }




}
