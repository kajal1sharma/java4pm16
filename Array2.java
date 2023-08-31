import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        
        int size;//10
        Scanner sc = new Scanner(System.in);
        size= sc.nextInt();

        int arr [] = new int[size];


        for(int i =0 ; i< size;i=i+1){
            System.out.println("enter the "+i +"elemnt");
            arr[i] =sc.nextInt();
        }


        //mul of number
        long multiplication =1;

        for(int i=0;i<size;i=i+1){
            multiplication=multiplication*arr[i];
        }

        System.out.println(multiplication);

        //sum of all the elements
        // int sum=0;
        // for(int i=0;i<size;i=i+1){
        //     sum= sum+arr[i];
        // }
        // System.out.println(sum);

        // for(int  i=0 ;i<size;i=i+1){
        //     System.out.println(arr[i]);
        // }
        // int size = Integer.MAX_VALUE;
        // int size=100000000;
        // double arr[] = new double[size];

        //OutMemoryError occurs when the JVM could not find the prementioned space
    }
}
