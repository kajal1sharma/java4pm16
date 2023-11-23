import utility.Car;
class Test  {

    // visibility public > protected > default > private
    // public static void main(int a){

    // }
    int x;
    int y;
    Test(){
        // super(2,2,2,2);
    }
    void printInTest(){
        System.out.println(x);
        // System.out.println(doors);
        // System.out.println(wheel);
        // System.out.println(head);
        // System.out.println(leg);
    }
    public static void main(String[] args) {
        Car obj = new Car(12,45);
        obj.wheel=90;
        obj.doors=80;
    }    
}








