import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
       
       // Scanner sc = new Scanner(System.in);

       //if you want to terminate or break the loop from inside the looop use break;
    //    for(int  i=1;true;i=i+1)
    //     {
    //         if(i%3==0 &&  i%5==0 && i%7==0){
    //             System.out.println(i);
    //             break;
    //         }
    //     }
        //print 5 such numbers which are divisible by 3 and 5 and 7

        int counter =0;

        for(int i=1;true;i=i+1)
        {
             if(i%3==0 &&  i%5==0 && i%7==0){
                System.out.println(i);
                counter =counter +1;
                if(counter==5){
                    break;
                }
             }
        }


        //1-100
        //3 and  5 and  7 divide =>print that number 

        // for(int i=1;i<=100;i=i+1){
        //     if(i%3==0 && i%5==0){
        //         System.out.println(i);
        //     }
        // }







        // initialization;condition;updation
        //infinite
        // for(;;){
        //     System.out.println("Hello world");
        // }
        
        // String str = "one"+"two"+12;
        // System.out.println(str);

        
        // for(int i =17 ; i<=170;i=i+17){
        //     System.out.println(i);
        // }
        
        // int table =17;
        // for(int i =1; i<=10;i=i+1){
        //     String str= table + " * "+i+" = "+table*i;
        //     System.out.println(str);
            
        // }

        // 2 table => 
        // 2,4,6,8,10.12.14,16,18,20
        // 3 table 


        // 2*1=2
        // 2*2=4
        // ...
        // 2*10=20

        
        
        
        // for(int i=0;i<5;i=i+1){
        //     System.out.println("enter the first number");
        //     int a=sc.nextInt();
        //     System.out.println("Enter the second number");
        //     int b=sc.nextInt();
        //     int sum = a+b;
        //     System.out.println("the sum is : " +sum);
        // }






        // int a;
        // a= sc.nextInt();

        // System.out.println(a);

        // boolean a= sc.nextBoolean();
        // System.out.println(a);
        // float f= sc.nextFloat();
        // System.out.println(f);
        // String str= sc.next();
        // System.out.println(str);
        // String str2 = sc.nextLine();
        // System.out.println(str2);

    }
}
