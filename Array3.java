public class Array3 {
    public static void main(String[] args) {



        int arr[][] = new int[3][3];
        for(int i=0;i<3;i=i+1){
            for(int j=0;j<3;j=j+1){
                arr[i][j]=i+j;
            }
        }

        //sum of right diagonal
        int sum=0;
        for(int i=0;i<3;i=i+1){
            for(int j=0;j<3;j=j+1){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("sum of diagonal = " +sum);
        
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