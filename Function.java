import java.util.Scanner;

public class Function {



    //defination
// return type   , name of the function , parameters list
   static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b =sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        
    }
                            //parameter
    static void printWish(String name){
        System.out.println("happy birthday "+name);
    }

    public static void main(String[] args) {
        //arguments
        printWish("neeta");
        printWish("rita");
        String name="rahul";
        printWish(name);
        //function calling
        // sum();
        //  sum();



    }
}
