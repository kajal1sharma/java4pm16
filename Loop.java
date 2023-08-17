import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);


        // initialization;condition;updation
        for(int i=0;i<5;i=i+1){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum = a+b;
            System.out.println(sum);
        }

        


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
