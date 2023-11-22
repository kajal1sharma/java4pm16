package utility;

 public class Car {
    int wheel;
    int doors;
    public Car(){

    }
    public Car(int wheel, int doors){
        this.doors=doors;
        this.wheel=wheel;
    }

    public void run(){
        System.out.println("the car is running");
    }
}
