import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of square matrix");
        //square matrix is a 2-D array whose number of rows is equals to number column
        int size=sc.nextInt();

        int arr[][]= new int[size][size];

        //input 
        for(int i=0;i<size;i=i+1){
            
            for(int j=0;j<size;j=j+1){
                System.out.print("arr["+i+"]["+j+"] ");
                arr[i][j]=sc.nextInt();
            }
        }

        int i=0;
        int j=0;
        int lrsum=0;
        while(i<size){
            lrsum =lrsum + arr[i][j];
            i=i+1;
            j=j+1;
        }
        // i=0;
        // j=size-1;
        int rlsum=0;
        
        for(int k=0,l=size-1;k<size;k=k+1,l=l-1){
            rlsum=rlsum+arr[i][j];
        }

        // while(i<size){
        //     rlsum=rlsum+arr[i][j];
        //     i=i+1;
        //     j=j-1;

        // }

        
        int diff = lrsum-rlsum;
        diff =Math.abs(diff);
        // if(diff<0){
        //     diff=diff*-1;
        // }
        System.out.println(diff);


        //logic
        // for(int i=0;i<size;i=i+1){
            
        //     for(int j=0;j<size;j=j+1){
        //         if(i<=j){
        //             System.out.print(arr[i][j]+" ");
        //         }
        //         else{
        //             System.out.print("0 " );                    
        //         }
        //     }
        //     System.out.println();
        // }

    }
}
