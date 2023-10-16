
class Abc{
    static int a;
    int b;


    static void printInfoStatic(){

        System.out.println(a);
        System.out.println("iam a static function ");

    }
    void printInfo(){
        System.out.println("iam non static method");
    }
}

public class Stat2 {
    static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {

        Stat2.sum(34,34);
        sum(90,70);
        // Stat2 obj = new Stat2();
        // obj.sum(23, 30);


        // sum(23,34);
        // Abc.a=90;
        // Abc.printInfoStatic();

        // //Abc.b=80;
        // Abc obj = new Abc();
        // obj.b=80;
        // obj.a=50;
    }

}
