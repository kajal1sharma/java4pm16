import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //1-Monday
        //2->Tuesday
        //3=>Wednesday
        //4=>Thursday
        //5=>Friday
        //6=>Saturday
        //7=>Sunday
        //loop logic 

        Scanner sc = new Scanner(System.in);
        // int day= sc.nextInt();



        //calculator

        //+,-,*,/

        System.out.println("user give some input => +,-,*,/");
        char ch = sc.next().charAt(0);

        int a, b;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        
        switch(ch){
            case '+':
                     int sum = a+b;
                     System.out.println(sum);
                     break;
            case '-':
                     int diff = a-b;
                     System.out.println(diff);
                     break;
            case '/':
                     int div = a/b;
                     System.out.println(div);
                     break;

            case '*':
                     int mul = a*b;
                     System.out.println(mul);
                     break;
            default :System.out.println("Wrong input");
        }

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
