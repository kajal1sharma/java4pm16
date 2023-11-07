
class Student{
    final static String principal="vk singh";
    final String name;
    String number;

    Student(String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public static String getPrincipal() {
        return principal;
    }
    // void setName(String name){
    //     this.name=name;
    // }

}

public class FinalKey {
    public static void main(String[] args) {
        Student s =new Student("niya");
        // s.name="tina";
         Student s2 =new Student("tina");
        System.out.println(s.getName()); 
        System.out.println(s2.getName());       
    }
}
