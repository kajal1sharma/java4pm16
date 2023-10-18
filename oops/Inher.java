class Person{
    String name;
    String address;
    String FathersName;
    String mothersname;

    void printInfo(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(mothersname);
        System.out.println(FathersName);
    }
}

class Teacher extends Person{
    // String name;
    // String address;
    // String FathersName;
    // String mothersname;

    int salary;
    String phone;
    int exp;
    int studednt;
    int sub1;
    int sub2;
    int sub3;

    void printInfo2(){
        
        System.out.println(salary);
        System.out.println(phone);
        
    }

}

class Doctor extends Person{
    // String name;
    // String address;
    // String FathersName;
    // String mothersname;

    int salary;
    String phone;
    String workplace;
    int noDegrees;
    int exp;
    int patientsCount;
}

public class Inher {
    public static void main(String[] args) {
        Teacher t= new Teacher();
        t.name="reena";
        t.mothersname="xyz";
        t.FathersName="pqr";
        t.address="kfjasfasdf";
        t.salary=2323;
        t.phone="2323242";
        t.printInfo();
        System.out.println("============================");
        t.printInfo2();
        

    }    
}
