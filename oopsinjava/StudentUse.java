package oopsinjava;
import java.util.Scanner;

public class StudentUse{
	
	
	
    public static void main(String[] args){
//        Scanner s= new Scanner();
        Student s1= new Student();
        Student s2= new Student();
        System.out.println(s1);
        s1.name="Manisha";
//        s1.rollnumber = 10;
        s1.setRollNumber(100);
        System.out.println(s1.name + " "+ s1.getRollNumber());

//        s2.name= "Ankush";
//        s2.rollnumber= 50;
//
//        System.out.println(s2.name + " " + s2.rollnumber);
//        Student s=new Student();
//        System.out.println(s);
    }

}
