package utility;

  public class Car {
    protected int wheel;
    public int doors;
    protected Car(){

    }
    public Car(int wheel, int doors){
        this.doors=doors;
        this.wheel=wheel;
    }

    public void run(){
        System.out.println("the car is running");
    }
}
