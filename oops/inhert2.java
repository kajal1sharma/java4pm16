class Person{

    String name;
    String address;

    Person(){

    }
    Person(String name, String address){
        this.name=name;
        this.address=address;
    }


}

class Teacher extends Person{
    int salary;
    int countSub;

    
    Teacher(int salary, int countSub, String address, String name){
        // super(name, address);
        this.salary= salary;
        this.countSub=countSub;
        this.address=address;
        this.name=name;

    }

    void printInfo(){
        System.out.println(salary);
        System.out.println(countSub);
        System.out.println(name);
        System.out.println(address);
    }


}

public class inhert2 {
    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher(234243, 3, "Sdasdasf", "reena");
        // t.salary="2313";
        // t.countSub=3;
        // t.name="sdsd";
        // t.address="fdasfdsaf";   
        t.printInfo();
    }
}
