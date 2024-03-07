package Project1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
public abstract class Human {
    private String name;
    private String surname;
    private int yearofBirth;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;

    public Human(String name,String surname,int yearofBirth,int iq,String[][] schedule){
        this.name=name;
        this.surname=surname;
        this.yearofBirth=yearofBirth;
        this.iq=iq;
        this.schedule=schedule;
    }

    public Human(String name,String surname,int yearofBirth){
        this.name=name;
        this.surname=surname;
        this.yearofBirth=yearofBirth;
    }
    public Human(String name,String surname,int yearofBirth,Human mother,Human father){
        this.name=name;
        this.surname=surname;
        this.yearofBirth=yearofBirth;
        this.mother=mother;
        this.father=father;
    }
    public Human (String name,String surname,int yearofBirth,int iq,Pet pet,Human mother,Human father,String[][] schedule){
        this.name=name;
        this.surname=surname;
        this.yearofBirth=yearofBirth;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;
        this.schedule=schedule;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setYearofBirth(int yearofBirth){
        this.yearofBirth=yearofBirth;
    }
    public int getYearofBirth(){
        return this.yearofBirth;
    }
    public void setIq(int iq){
        this.iq=iq;
    }
    public int getIq(){
        return this.iq;
    }

    public void setPet(Pet pet){
        this.pet=pet;
    }
    public Pet getPet(){
        return this.pet;
    }
    public void setMother(Human mother){
        this.mother=mother;
    }
    public Human getMother(){
        return this.mother;
    }
    public void setFather(Human father){
        this.father=father;
    }
    public Human getFather(){
        return this.father;
    }
    public void setFamily(Family family){
        this.family=family;
    }
    public Family getFamily(){
        return this.family;
    }
    public Human(){

    }
    public abstract void greetPet(Pet pet);
    public void describePet(){
        String slyLevel=(pet.getTrickLevel()>50 ? "very sly":"almost not sly");
        System.out.println("I have a "+pet.getSpecies()+"is "+pet.getAge()+"years old, he is "+slyLevel);
    }

    public String toString() {
        return ("Human{name= " + name + " , surname= " + surname + " , yearOfBirth= " + yearofBirth +
                " , iq= " + iq + " , mother= " + mother.getName() + " " + mother.getSurname() +
                " , father= " + father.getName() + " " + father.getSurname() +
                " , pet= " + pet.toString() + "}");
    }

    public boolean feedPet(boolean isTimeforFeeding){
        if(isTimeforFeeding){
            System.out.println("Hmmm... I will feed Jack's "+pet.getNickname());
            return true;
        }
        else{
            Random random=new Random();
            int randomNum=random.nextInt(101);
            if(pet.getTrickLevel()>randomNum){
                System.out.println("Hmmm... I will feed Jack's "+pet.getNickname());
                return true;
            }
            else{
                System.out.println("I think "+pet.getNickname()+"is not hungry");
                return false;
            }

        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearofBirth == human.yearofBirth && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, yearofBirth, iq, pet, mother, father);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

















}
