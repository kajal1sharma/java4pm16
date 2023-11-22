import utility.Car;
class Test {

    // public static void main(int a){

    // }
    public static void main(String[] args) {
        Human h= new Human(1, 2, 2, 5);
        h.printInfo();

        Car c = new Car();
        Car c2= new Car(4,4);
        c.run();
    }    
}
