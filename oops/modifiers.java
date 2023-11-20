// default 
class Car {
    private  int a =10 ;
    private int b =20;

}

class Bus extends Car{
    int c =30;
    {
    System.out.println(c);
    }
    // void gettInfo(){
    //     System.out.println(a);
    //     System.out.println(d);
    // }
}

public class modifiers{
    public static void main(String[] args) {
        Bus b = new Bus();
        // System.out.println(b.a);
        // System.out.println(b.b);
        System.out.println(b.c);
    }
}
