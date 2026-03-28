package OOPS;
import java.util.*;

abstract class Student{
    String name;
    int age;
    String program;
    
    public Student(String name, int age, String program){
        this.name=name;
        this.age=age;
        this.program=program;
    }
    
    public void display_student_info(){
        System.out.println("Student Name: "+ name);
        System.out.println("Student Age: "+ age);
        System.out.println("Student Department: "+ program);
    }
}

class Graduate extends Student{
    double percentage;
    String stream;
    
    public Graduate(String name, int age, String program,double percentage, String stream){
        super(name,age,program);
        this.percentage=percentage;
        this.stream=stream;
    }
    @Override
    public void display_student_info(){
        super.display_student_info();
        System.out.println("12th Percentage : "+ percentage);
        System.out.println("Stream: "+ stream);
    }
    
}

class Research extends Student{
    String spl;
    int yoe;
    
    public Research(String name, int age, String program,String spl, int yoe){
        super(name,age,program);
        this.spl=spl;
        this.yoe=yoe;
    }
    @Override
    public void display_student_info(){
        super.display_student_info();
        System.out.println("Specialization : "+ spl);
        System.out.println("Years Of Experience: "+ yoe);
    }
    
}
public class Question1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------University Student Records------");
        Research stud1=new Research("Divyanshi Sahu",23,"BTech", "Data Science",2);
        stud1.display_student_info();
        System.out.println("---------xxxxxxxxxxxxxxxxxxxxxxxxxx------");
        sc.close();
    }
}