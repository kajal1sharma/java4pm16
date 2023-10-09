class Human{
    // data members or proerties
    private String name;
    int mobile;
    String address;
    int pin;

    //getters and setters
     void  setName(String tname){
        //conditions
            name=tname;
     }
      String getName(){
        return name;
      }
    //  void setPin(int tpin){
    //     //validations
    //     //account verify , 
    //     if(pin!=0){
    //         return;
    //     }
    //     pin=tpin;
    //  }
    //member function, methods 
    void printInfo(){
        System.out.println("name of the human is : "+name);
        System.out.println("Mobile of the human "+ mobile);
        System.out.println("Address of the human is  "+address);
    }
}
public  class Test {

    public static void main(String[] args) {
        Human h1= new Human();//new keyword is used to create objects
        // h1.name="kritika";
        h1.pin=1244;
        h1.pin=90897;
        h1.setName("kritika");
        h1.mobile=2938293;
        h1.address="t block new delhi";
        String h1name= h1.getName();
        System.out.println(h1name);
        // h1.printInfo();

        Human h2= new Human();
        // h2.name="ritu";
        h2.setName("ritu");
        h2.mobile=82734762;
        h2.address="q block noida";
        String h2name= h2.getName();
        System.out.println(h2name);
        // h2.printInfo();
    }
    // static void printSum (int []num){
    //     int sum=0;
    //     for(int i=0;i<num.length;i++){
    //         sum=sum+num[i];
    //     }
    //     System.out.println(sum);
    // }
    // public static void main(String[] args) {
    //     int arr[] =new int[]{1,2,3,4,3,2,2};
        
    //     printSum(new int[]{1,2,3,4,5,6});
    //     //Anonymous array

    // }
}
