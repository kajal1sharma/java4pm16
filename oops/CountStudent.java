
class Student3{
    static private int count;
    int rollno;
    String name;

    int incrementCount(){
        count++;
        return count;
    }
}

public class CountStudent {
    public static void main(String[] args) {

        Student3[] arr =new Student3[5];

        for(int i=0;i<5;i++){
            arr[i]=new Student3();
            arr[i].incrementCount();
           //Student3.count=Student3.count+7;
        }

        // Student3 obj1=new Student3();
        // obj1.incrementCount();
        // Student3 obj2=new Student3();
        // obj2.incrementCount();
        // Student3 obj3=new Student3();
        // obj3.incrementCount();
       
        // Student3 obj4=new Student3();
        // obj4.incrementCount();


        //  System.out.println(obj1.count);
        //  System.out.println(obj2.count);
        //  System.out.println(obj3.count);
        // System.out.println(obj4.count);
       // System.out.println("total student : "+Student3.count);
    }
}
