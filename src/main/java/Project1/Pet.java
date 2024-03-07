package Project1;


import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(Species species,String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(Species species,String nickname,int age,int trickLevel,String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }

    public void setSpecies(Species species){
        this.species=species;
    }
    public Species getSpecies(){
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
    public abstract void respond();
    public void foul(){
        System.out.println("I need to cover it up");
    }
    public String toString1() {
        return (species + "{nickname= " + nickname + " , age= " + age + ", trickLevel= " + trickLevel + ", habits= " + Arrays.toString(habits) + "}");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}
