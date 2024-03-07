package Project1;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Pet dog=new Dog();
        Pet domesticCat=new DomesticCat();
        Pet fish=new Fish();
        Pet roboCat=new RoboCat();
        Human man=new Man("Nick","John",1998,120,new String[][]{});
        Human woman=new Woman("Helin","Heny",1990,140,new String[][]{});

        /* Pet pet=new Pet("dog","Jon",5,65,new String[]{"sleep","drink","eat"});
        Human mother=new Human("Elza","Muradova",1979);
        Human father=new Human("Elsever","Kalbaliyev",1977);
        Human child=new Human("Selen","Kalbaliyeva",2004,90,pet,mother,father,new String[][]{{"Monday","Swimming"},{"Wednesday","Playing"},{"Sunday","Resting"}});
        System.out.println(pet.getAge());
        child.greetPet();
        child.describePet();
        child.feedPet(true);
        System.out.println("Mother: " + mother.toString());
        System.out.println("Father: " + father.toString());
        System.out.println("Child: " + child.toString());
        System.out.println("Mother: " + mother.getPet().toString1());
        System.out.println("Father: " + father.getPet().toString1());
        System.out.println("Child: " + child.getPet().toString1());

         */

        dog.respond();
        domesticCat.respond();
        fish.respond();
        roboCat.respond();
        dog.foul();
        domesticCat.foul();
        man.greetPet(dog);
        woman.greetPet(dog);



        ((Man) man).repairCar();
        ((Woman) woman).makeup();







    }

}
