public class TwoDArray {
     public static void main(String[]args){
        
        

          int [][][] arr = {{{1,2,3,4},{2,3},{4,9,3,5,6}},{{1,2,3},{7,8,4,9},{4,5,6,7}},{{4,2,3,4},{7,4,5,6},{3,4,5}}};
      
          int sum=0;

          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               for(int k=0;k<arr[i][j].length;k++){
                  sum=sum+arr[i][j][k];
               }
            }
          }
          System.out.println(sum);

          // int arr[][] = new int[4][];


          // arr[0]= new int[12];
          // arr[1]=new int[4];
          // arr[2]=new int[8];
          // arr[3]=new int[4];

          // int [][]arr={{1,2,3,9,0},{3,4,5,1},{3,2,5}};

          // int arr2[][]=new int[2][3];

          // for(int j=0;j<arr[0].length;j++){

          //      for(int i=0;i<arr.length;i++){
          //           System.out.print(arr[i][j]+" ");
          //      }
          //      System.out.println();
          // }

          // for(int i=0;i<arr.length;i++){
          //      for(int j=0;j<arr[i].length;j++){
          //           System.out.print(" "+arr[i][j]);
          //      }
          //      System.out.println();
          // }
        

          //app1 => initialization is done in next line
        // int [][] arr;
        // arr= new int[4][3];//number of rows, colms
    
     //    int arr[][]={{1,2,3,4},{3,4,5,6,7},{6,4,8,9,9,6,0},{1,2,3,4,5,6,6,7}};//declaration and initialization 
       



     //    for(int i=0;i<arr.length;i++){
     //         int sum=0;
     //        for(int j=0;j<arr[i].length;j++){
     //            // System.out.print(arr[i][j]+" ");
     //            sum=sum+arr[j][i];
     //        }
     //         System.out.println(sum);
     //    }
       

        //app2=> same line initialization
        //int brr[][] = new int[2][2];





        
        
        
        
        // int brr[][];
        // int []crr[];
        // int[] [] drr;


     }
}
