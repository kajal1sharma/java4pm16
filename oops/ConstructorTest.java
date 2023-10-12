
class Car{
    int Tyre;
    int window;
    String color;

    Car(){
        color="white";
        System.out.println("Now the constructor function is running");
    }
    //parameterized constructor
    Car(String carcolor){
        color=carcolor;
    }
    Car(String carcolor, int carwindow, int cartyre){
        Tyre=cartyre;
        window=carwindow;
        color=carcolor;
    }
    //  Car(int carwindow2,String carcolor2,  int cartyre2){
    //     Tyre=cartyre2;
    //     window=carwindow2;
    //     color=carcolor2;
    // }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Car obj2 = new Car("red");
        Car obj3 = new Car();
        Car obj4 = new Car("blue");
        Car obj5 = new Car("red", 10, 16);
        System.out.println(obj1.color);
        System.out.println(obj2.color);
        System.out.println(obj3.color);
        System.out.println(obj4.color);
        // Car c1= new Car();
        // System.out.println(c1.color);
        // Car c2= new Car();
        //   System.out.println(c2.color);
    }
}
