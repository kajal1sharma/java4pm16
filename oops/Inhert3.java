
class Ape{
    String color;
    int foot;
    Ape(){
        System.out.println("Ape type constructor");
    }
    Ape(String color, int foot){
        this.color=color;
        this.foot=foot;
    }
}

class Human extends Ape{
    String name;
    int age;
    int height;
    int weight;

    Human(){
        //super()
        System.out.println("human class constructor");
    }
    Human(String name, int age,int height, int weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    Human(String name, int age,int height, int weight, String color, int foot){
        super(color, foot);
        
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
}
class Student extends Human{
    int marks;
    int sub;

    Student(){
        //super();
        System.out.println(" student class constructor");
    }
   
    Student(int marks){
        this.marks=marks;
    }
    Student(int marks, int sub){
        //super()
        this(marks);
       // this.marks=marks;
        this.sub=sub;
    }
    Student(int marks, int sub, String name, int age,int height, int weight, String color, int foot )
    {//super() 
        super(name, age, height, weight, color, foot);
        this.marks=marks;
        this.sub=sub;
        // this.name=name;
        // this.age=age;
        // this.height=height;
        // this.weight=weight;
        // this.color=color;
        // this.foot=foot;

    }
}



public class Inhert3 {
    static public void main(String args[]){
        Student s= new Student();
        Student s2=new Student(100, 5);
        
    }
}
