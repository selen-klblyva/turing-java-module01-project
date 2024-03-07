package Project1;

import java.util.Arrays;
import java.util.Objects;

public class Family{
    private Human mother;
    private Human father;
    private Human[] child;
    private Pet pet;

    public Family(Human mother,Human father,Human[] child,Pet pet){
        this.mother=mother;
        this.father=father;
        this.child=child;
        this.pet=pet;
    }

    public void setPet(Pet pet) {
        this.pet=pet;
    }

    public Pet getPet() {
       return this.pet;
    }

    public void setMother(Human mother) {
        this.mother=mother;
    }

    public Human getMother() {
        return this.mother;
    }


    public void setFather(Human father) {
        this.father=father;
    }

    public Human getFather() {
        return this.father;
    }

    public void setChild(Human[] child){
       this.child=child;
   }
    public Human[] getChild(){
        return this.child;
    }

    public boolean deleteChild(int index){
        if (index < 0 || index >= child.length) {
            return false;
        }
        Human[] newChild = new Human[child.length - 1];
        int newIndex = 0;
        for (int i = 0; i < child.length; i++) {
            if (i != index) {
                newChild[newIndex++] = child[i];
            }
        }
        child= newChild;
        return true;

    }

    public int coutFamily(){
        return 2+child.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(child, family.child) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(child);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", child=" + Arrays.toString(child) +
                ", pet=" + pet +
                '}';
    }

}