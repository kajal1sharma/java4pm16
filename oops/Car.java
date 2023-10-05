class Car{
    int wheels;
    int seats;
    boolean suv;

    public void drive(){
        System.out.println("i can drive this car");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheels=4;
        obj.seats=4;
        obj.suv=false;
        // int num  = 45; 
    }
};
