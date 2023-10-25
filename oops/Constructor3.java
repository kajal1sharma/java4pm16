
class Parent{
    int x;
    int y;

    Parent(){
        System.out.println("iam parent default constructor");
    }
    Parent(int x, int y){
        System.out.println("iam parameterized constructor of Parent class");
        this.x=x;
        this.y=y;
    }

}
class Child extends Parent{
    int p;
    int q;
    float r;
    Child(){
        System.out.println("iam default constructor of child class");
    }
    Child(int p , int q){
        System.out.println("iam parameterized constructor of Parent class");
        this.p=p;
        this.q=q;
    }
    Child(float r){
        this.r=r;
    }

    Child(int p, int q, float r){
        //  this(p,q);
        super(23, 34);
        this.r=r;
    }

    Child(int p, int q, int x, int y){
        super(x,y);
        System.out.println("this ia para cons 2");
        this.p=p;
        this.q=q;
        // this.x=x;
        // this.y=y;
    }
}
class Constructor3{
    public static void main(String[] args) {
        Child obj = new Child(12, 12, 56, 23);
        Child obj2 = new Child(12,34);
        // Child c = new Child();
        // Child c2= new Child(2,3);
    }
}














