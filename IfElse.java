import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {


        //nested if else

        boolean breakfast = true;
        boolean lunch =true;
        boolean dinner =false;
        //else if 

        if(breakfast==true){
            if(lunch ==true){
                if(dinner ==true){
                    System.out.println("i had all my meals");
                }
                else{
                    System.out.println("have dinner");
                }
            }
            else{
                System.out.println("have some lunch");
            }
        }
        else{
            System.out.println("have some breakfast");
        }



        // int a=90;
        // int b=34;
        // int c=32;
        // int d=93;


        // if(a>b && a>c){
        //     System.out.println(a);
        // }
        // else if(b>a && b>c){
        //     System.out.println(b);
        // }
        // else if(c>a && c>b){
        //     System.out.println(c);
        // }
        // else{
        //     System.out.println("this is other case");
        // }


        // System.out.println("user have you done your lunch??");

        // boolean lunch ;
        // Scanner sc= new Scanner(System.in);
        // lunch = sc.nextBoolean();

        // if(lunch == false){
        //     System.out.println("you should eat something");
        // }
        // else{
        //     System.out.println("well done");
        // }

         
       // System.out.println("Enter a value");
        //Scanner sc =new Scanner(System.in);
        // int a= sc.nextInt();
        // float f = sc.nextFloat();
        
        // System.out.println(f);
        //  int a=90;
        //  int b=80;
        //  int c=45;

       
        // if(a>b && a>c){
        //     int d=90;
        //     int e=80;
        //     int sum=d+e;
        //     System.out.println(sum);
        //     System.out.println("hello this is if statement");
        //     System.out.println("hello this is if statement");
        //     System.out.println("hello this is if statement");
        //     System.out.println("hello this is if statement");
        // }
        // else{
        //     System.out.println("this is else statement");
        // }
    }
}
