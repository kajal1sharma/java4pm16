import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        

         for(int i=0;i<5;i++){

            //spaces+number =5

            for(int j=i;j<4;j=j+1){
                System.out.print(" ");
            }
           
            for(int k = 0 ;k<=i;k=k+1){
                
                System.out.print(" *");
             
            }


            System.out.println();


        }
        // int num=0;
        // for(int i=0;i<5;i++){

        //     //spaces+number =5

        //     for(int j=i;j<4;j=j+1){
        //         System.out.print(" ");
        //     }
           
        //     for(int k = 0 ;k<=i;k=k+1){
                
        //         System.out.print((char)(num+'A'));
        //         num=num+1;
        //     }


        //     System.out.println();


        // }


        //first loop for the rows

        // for(int i=0;i<5;i=i+1){

        //     char ch='A';

        //     for(int j =0;j<=i;j=j+1){
        //         System.out.print((char)(ch+j));
        //     }
        //    System.out.println();

        // }


        //rows first for loop 

//         Scanner sc= new Scanner(System.in);
//         int row = sc.nextInt();
//         for(int i=0;i<row;i=i+1){
// //second loop is for star printing
//             for(int j=0;j<=i;j=j+1){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i=0;i<n;i++ ){
        //     for(int j=0;j<n;j++){

        //         System.out.print("A");
        //     }
        //     System.out.println();
        // }
        

        //1-Monday
        //2->Tuesday
        //3=>Wednesday
        //4=>Thursday
        //5=>Friday
        //6=>Saturday
        //7=>Sunday
        //loop logic 

    //     Scanner sc = new Scanner(System.in);
    //     // int day= sc.nextInt();



    //     //calculator

    //     //+,-,*,/
    //     for(;true;){
    
    //     System.out.println("user give some input => +,-,*,/");
    //     char ch = sc.next().charAt(0);

    //     int a, b;
    //     System.out.println("Enter first number");
    //     a=sc.nextInt();
    //     System.out.println("Enter the second number");
    //     b=sc.nextInt();

    //     switch(ch){
    //         case '+':
    //                  int sum = a+b;
    //                  System.out.println(sum);
    //                  break;
    //         case '-':
    //                  int diff = a-b;
    //                  System.out.println(diff);
    //                  break;
    //         case '/':
    //                  int div = a/b;
    //                  System.out.println(div);
    //                  break;

    //         case '*':
    //                  int mul = a*b;
    //                  System.out.println(mul);
    //                  break;
    //         default :System.out.println("Wrong input");
    //     }

    //     System.out.println("Do you want to continue(1) 0r (0)to exit");
    //     int choice = sc.nextInt();
    //     if(choice ==1){
    //         //continue break =>loops 
    //         continue;
    //     }
    //     else if(choice ==0) {
    //         break;
    //     }

    // }
        // switch(day-1+2){
        //     case 1:System.out.println("Monday");
        //             break;
        //     case 2:System.out.println("Tuesday");
        //             break;
        //     case 3:System.out.println("Wednesday");
        //             break;
        //     case 4:System.out.println("Thursday");
        //            break;
        //     case 5:System.out.println("Friday");
        //             break;
        //     case 6:System.out.println("Saturday");
        //             break;
        //     case 7:System.out.println("Sunday");
        //             break;
        //     default:System.out.println("Not a valid day");
        // }

        // if(day==1){
        //     System.out.println("Monday");
        // }
        // else if(day==2){
        //     System.out.println("Tuesday");
        // }
        // else if(day==3){
        //     System.out.println("Wednesday");
        // }
        // else if(day==4){
        //     System.out.println("Thursday");
        // }
        // else if(day==5){
        //     System.out.println("Friday");
        // }
        // else if(day==6){
        //     System.out.println("Saturday");
        // }
        // else if(day==7){
        //     System.out.println("Sunday");
        // }
        // else{
        //     System.out.println("Not a valid day");
        // }



        //  if(day==1){
        //     System.out.println("Monday");
        // }

        // if(day==2){
        //     System.out.println("Tuesday");
        // }
        // if(day==3){
        //     System.out.println("Wednesday");
        // }
        // if(day==4){
        //     System.out.println("Thursday");
        // }
        // if(day==5){
        //     System.out.println("Friday");
        // }
        // if(day==6){
        //     System.out.println("Saturday");
        // }
        // if(day==7){
        //     System.out.println("Sunday");
        // }
        // else{
        //     System.out.println("Not a valid day");
        // }

    }
}
