import java.util.Scanner;

public class Function1 {


//    static void takeInput(){
//          Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the first number");
//         int a=sc.nextInt();
//         System.out.println("Enter the second number");
//         int b =sc.nextInt();
//     }

static int juicer(int oranges , int apples){

    System.out.println("juice is in making");
    System.out.println(oranges +" oranges and "+apples+" apples are used to make the juice");
    return oranges+apples;
}
    public static void main(String[] args) {
     


        int o=10;
        int a=19;
        int totalFruits=juicer(o,a);
        System.out.println(totalFruits);
        // takeInput();
        // System.out.println("hello world");
        // takeInput();
        // System.out.println("hi this is our function progrma");
        // takeInput();

    }
}
