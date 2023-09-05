
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {


        int arr1[]={1,2,3,4,5,9,6,7};
        System.out.println(arr1.length);
        boolean flag = true;;
        for(int i=0;i<arr1.length-1;i=i+1){
            if(arr1[i]<arr1[i+1])
                {
                    continue;
                }  
            else{
                flag= false;
                break;
                }     
        
}

if(flag==true){
    System.out.println("ascending");
}
else{
    System.out.println("not in ascending");
}

        int arr2[]={1,3,2,34,6,6,3};

    //INPUT  TO BE PROVIDED BY THE USER
        
        // char ch='a';
        // int a;
        // a=0;
        //         int arr2 [][]=new int [3][3];
        // int arr[][] ;
        // arr = new int[3][3];
        // int arr3[][]={{1,2,3},{3,4,5},{6,7,8}};


        // int arr4[][]=new int[3][3];



        // Scanner sc= new Scanner(System.in);
        // for(int i=0;i<3;i=i+1){
        //     for(int j=0;j<3;j=j+1){
        //         System.out.println("enter element arr["+i+"]["+j+"]");
        //         arr[i][j]=sc.nextInt();
        //     }
        // }

        // for(int i=0;i<3;i=i+1){
        //     for(int j=0;j<3;j=j+1){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // int sum=0;
        // for(int i=0;i<3;i=i+1){
        //     for(int j=0;j<3;j=j+1){
        //         if((i+j)>=2){
        //           sum=sum+arr[i][j];  
        //         }
        //     }
        // }
        // System.out.println(sum);


        // int arr[][] = new int[3][3];
        // for(int i=0;i<3;i=i+1){
        //     for(int j=0;j<3;j=j+1){
        //         arr[i][j]=i+j;
        //     }
        // }

        //sum of right diagonal
        // int sum=0;
        // for(int i=0;i<3;i=i+1){
        //     for(int j=0;j<3;j=j+1){
        //         if(i==j){
        //             sum=sum+arr[i][j];
        //         }
        //     }
        // }
        // System.out.println("sum of diagonal = " +sum);
        
        // int arr2[][] =new int[4][3];


        // //i pointer is used to point out rows
        // for(int i=0;i<4;i=i+1){

        //     //point out column
        //     for(int j=0;j<3;j=j+1){
        //         arr2[i][j]=i+j;
        //     }
        // }

        // int arr[] = new int[4];

        // arr[0]=90;
        // arr[1]=80;
        // arr[2]=70;
        // arr[3]=60;


        // //iteration
        // for(int i = 0 ; i<4;i=i+1){
        //     System.out.println(arr[i]);
        // }
        //loop => repeated task perform


        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);

        // int arr[] = new int [3];
        // arr[0]=90;
        // arr[1]=180;
        // arr[2]=700;
        // int arr2[] ={23,34,56,78};

        //loop => we can iterate/traverse over array

       // int arr3[][] = new int[3][4]; 


        //traversing
        
        //i pointer is pointing to the rows
        // for(int i=0 ;i<3;i=i+1){
        //     //j th pointer is for the columns
        //     for(int j=0;j<4;j=j+1){
        //         arr3[i][j]=i+j;
        //     }
        // }


        // for(int i=0;i<3;i=i+1){
        //     for(int j=0;j<4;j=j+1){
        //         System.out.print(arr3[i][j]+"  ");
        //     }
        //     System.out.println();
        // }


    }
}
