class Car{
    byte a;
    int b;
    float c;
    long d;
    boolean f;
    String s;

    // public int getA() {
    //     return a;
    // }
    void printdefValues(Car para){
        System.out.println(para.a);
        System.out.println(para.b);
        System.out.println(para.c);
        System.out.println(para.d);
        System.out.println(para.f);
        System.out.println(para.s);

    }
}

public class TypesOfVar {
    public static void main(String[] args) {


        Car r = new Car();
        r.printdefValues(r);

        // local variables are not given spaces in mem, until it hasnt been initialized
        // int a=34;
        // a=90;//initialization
        // two types of variable  => primitives and refernce
        // int short byte long float double char boolean 
        //  Car c= new Car();
        // a=79;

        // int b;
        // b=90;
        // int d =b-100;
        
        // System.out.println(c);
    }
}
