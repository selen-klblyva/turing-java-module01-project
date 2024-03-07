package Tasks;

public class StudentApp {
    public static void main(String[] args){
        Student selen=new Student(20,"Selen",new double[]{96,86,98});
        System.out.println(selen);

        selen.getGrades()[0]=71;
        System.out.println(selen);
        selen.getGrades()[0]=81;
        System.out.println(selen);


    }

}
