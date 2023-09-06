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

        //logic
        for(int i=0;i<size;i=i+1){
            
            for(int j=0;j<size;j=j+1){
                if(i<=j){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("0 " );                    
                }
            }
            System.out.println();
        }

    }
}
