
abstract class Animal {

    int food;
    int limbs;
    int stomach;
    int hair;

    abstract void run();
    abstract void eat(String food);
    void walk(){
        System.out.println("aniamls use their limbs to walk");
    }
}


class Dog extends Animal{

    void run(){
        System.out.println("Dog can run ");
    }

    void eat(String food){
        System.out.println("Dog can eat");
    }
    void walk(){
        System.out.println("Dog is walking");
    }
}

class Cat extends Animal{
    void run(){
        System.out.println("cat can run");
    }
    void eat(String food){
        System.out.println("cat eats "+food);
    }
}

class PetCat extends Cat{
    String name;

}





public class Abstract3 {
    
}
