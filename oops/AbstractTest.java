
abstract class Vehicle{
    abstract int getSpeed();
}

abstract class Train extends Vehicle{

}
class Metro extends Train{
    @Override
    int getSpeed() {
        
        return 100;
    }
}

public class AbstractTest {
    public static void main(String[] args) {
       // Vehicle v= new Vehicle();
    //    Metro m = new Metro();

    }
}
