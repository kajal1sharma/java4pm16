class Base{
    int x;
    Base(int x){
        this.x=x;
    }
    void getInfo(){
        System.out.println("iam getInfo function of base class");
        System.out.println(x);
        // System.out.println(y);
    }
}

class Child2 extends Base{
    int y;
    Child2(int x, int y){
        super(x);
        this.y=y;
    }
    void getInfo(){
        System.out.println("iam getInfo function of child class");
        System.out.println(x);
        System.out.println(y);
    }
    void print(){
        System.out.println("-----------------------------");
    }

}

public class Overriding {
    public static void main(String[] args) {
        Base b= new Base(10);
        // System.out.println(b.x);
        // b.getInfo();

        Base b2= new Child2(20, 30);
        System.out.println(b2.x);
        b2.getInfo();
        // System.out.println(b2.y);


        // Base b= new  Base(10);
        // b.getInfo();
        // Base b2 = new Child2(20, 30);
        // b2.getInfo();
        
        // Base b= new Base(10);
        // b.getInfo();

        // Child2 c= new Child2(20,30);
        // c.getInfo();
    }    
}
