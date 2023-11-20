class A{
    int x;
    void getInfo(){
        System.out.println("Iam getInfo function of A Class");
    }
      void sum(){
        System.out.println("sum with no args");
    }
}

class B extends A{

    //overloading is achieved via changing the function signature
    void sum(){
        System.out.println("sum with no args");
    }
    void sum(int a){
        System.out.println("sum with one args");
    }
    void sum(int a , int b){
        System.out.println("sum with 2 args");
    }

    //overriding
     void getInfo(){
        System.out.println("Iam getInfo function of B Class");
    }
}

class Revision2{
    public static void main(int a, int b){
        System.out.println("iam another main  method");
    }
    public static void main(String[] args) {
        Revision2.main(10, 20);
        // B obj = new B();
        // obj.getInfo();
        // obj.sum();
        // obj.sum(12);
        // obj.sum(12,12);
    }    
}


// //all the function are by default => public abstract
// //all the data members are final static public
// interface Phone{
   
//     String companyName="Nokia";
//     String branch ="new delhi";
//     void get();
//     int size();
// }
// //when an interface extends other interface then 
// //all the abstract methods and properties are inherited
// interface Phone2 {

//     void set() ;
//     String getInfo();

    
// }
// //multiple inheritence
// class Abc implements Phone, Phone2{
    
//     Abc(){
//         super();//Object Class const
//         System.out.println(super.toString());
//     }
//     public void get() {
//         // TODO Auto-generated method stub
        
//     }
   
//     public int size() {
//         // TODO Auto-generated method stub
//         return 0;
//     }
    
//     public void set() {
//         // TODO Auto-generated method stub
        
//     }
    
//     public String getInfo() {
//         // TODO Auto-generated method stub
//         return null;
//     }
// }


// public class Revision2 {
//     public static void main(String[] args) {
//         Abc obj = new Abc();
//         System.out.println(Phone.companyName);
//         System.out.println(Abc.companyName);
//     }
// }
