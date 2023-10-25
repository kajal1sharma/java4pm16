
class Car{
    int distance;
    int time;
    void calculateSpeed(){//signature is differet  calculateSpeed()
        System.out.println(distance*time);
    }

    void calculateSpeed(String name){//calculateSpeed(String)
        System.out.println(name+" is having "+distance*time +"speed");
    }

    int calculateSpeed(int speedlimit){//calculateSpeed(int)
        if(speedlimit>2000){
            return -1;
        }
        else{
            return distance*time;
        }
        
    }
}
public class Overloading {
   public static void main(String[] args) {
        Car c= new Car();
        c.distance=12;
        c.time=12;

        c.calculateSpeed();
        c.calculateSpeed("bMw");
   } 
}
