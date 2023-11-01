
interface Transport{
    //abstract public
    abstract public void doWork();
    int getSpeed();
}

class Roadways implements Transport{
    public void doWork(){
        //.....
    }
    public void getSpeed(){

    }

}


abstract class Vehicle{
    int engine;
    int engineoil;
    int space;
    int  metal;

    public int getSpeed(){
        return 0;
    }
    abstract public int run();
}

abstract class XYZ extends Vehicle{

} 

class Bike extends XYZ{
    abstract public int run(){

    }
}


class Abstract2{
    public static void main(String []args){
        Vehicle v =new Vehicle();
        // Car c = new Car();
        // c.color="red";
    }

}