import java.util.Arrays;

public class ArrayRecap {

    // static void febonacciSeries(int n){

    //     if(n==1){
    //         System.out.println(0);
    //     }
    //     else if(n==2){
    //         System.out.println(0 +" "+1);
    //     }
    //     else{
    //         int firstTerm  =  0;
    //         int secondTerm = 1;
    //         System.out.print(firstTerm+ "  "+secondTerm+"  ");
    //         int nextTerm;
        
    //         for(int i=3 ; i <=n ; i++)
    //         {
    //             nextTerm =firstTerm + secondTerm;
    //             System.out.print(nextTerm+"  ");
    //             firstTerm = secondTerm;
    //             secondTerm=nextTerm;
    //         }
       

    //     }


    //    }
    static int febonacci(int n){

        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            int firstTerm  =0 ;
            int secondTerm =1;

            int nextTerm=0;
            for(int i=3 ; i<=n ;i++){
                nextTerm =firstTerm +secondTerm;
                firstTerm= secondTerm;
                secondTerm =nextTerm;
            }
            return nextTerm;
        }
    }

    static int[] febonacciArr(int n){
        int arr[] = new int[n];

        if(n==1)
        {
            arr[0]=0;
            return arr;
        }
    
        arr[0]=0;
        arr[1]=1;

        
        for(int i=2;i<n;i++){
        arr[i]=arr[i-1]+arr[i-2];    
        }

        return arr;

    }
    

    public static void main(String[] args) {


        // int n=10;
        // int nthterm[]  = febonacciArr(n);

        // for(int i=0;i<nthterm.length;i++){
        //     System.out.println(nthterm[i]+" ");
        // }
        //febonacci  series 
        // 0 1 1 2 3  5 8 13 

        // int n=18;
        // febonacciSeries(n);


        //febonacci series
        //term1 =0;
        //term1 =1
        // 0 1 1 2 3 5 8 13 21 34....

        // int term1=0;
        // int term2 =1;
        // int n=15;

        // if(n==1){
        //     System.out.println(term1);
        // }
        // else if(n==2){
        //     System.out.println(term1);
        //     System.out.println(term2);
        // }
        // else{
        //     System.out.println(term1);
        //     System.out.println(term2);
        //     for(int i=3;i<=n;i++){
        //         int currTerm  = term1+term2;
        //         System.out.println(currTerm);
        //         term1=term2;
        //         term2 = currTerm;
        //     }
        // }



        // int arr1[]={4,3,2,6,5,1};
        // int arr2[]={1,3,2,5,4,6};


        // boolean flag=true;
        // if(arr1.length!=arr2.length){
        //     flag=false;
        // }
        // else{

        //     for(int i=0;i<arr1.length;i++){
        //         boolean found=false;
        //         for(int j=0;j<arr2.length;j++){
        //             if(arr1[i]==arr2[j]){
        //                 found=true;
        //                 break;
        //             }
        //         }

        //         if(found==false){
        //             flag=false;
        //         }
        //     }
        // }

        // if(flag==false){
        //     System.out.println("array are not equal");
        // }
        // else{
        //     System.out.println("arrays are equal0");
        // }

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);


        // if(arr1.length !=arr2.length){
        //     System.out.println("these arrays are not equal");
        // }
        // else{
        //     boolean flag=true;
        //     for(int i=0 ;i <arr1.length;i++){
        //         if(arr1[i]==arr2[i]){
        //             continue;
        //         }
        //         else
        //         {
        //             flag=false;
        //             if(flag==true){
        //                 System.out.println("these arrays are equal");
        //             }
        //             else{
        //                 System.out.println("these arrays are not equal");
        //             }
        //             break;
        //         }
        //     }
            

        // }


//         for(int i=0;i<arr1.length;i++){
//             System.out.print(arr1[i]+" ");
//         }
// System.out.println();
//         for(int i=0;i<arr2.length;i++){
//             System.out.print(arr2[i]+" ");
//         }


        //all the elements of array 1 == array2

     
        
        //Ques => reverse this array
        // int arr[] ={ 1,2,0,3,2,4,5,2};
        // Arrays.sort(arr);
        // int i=0;
        // int j=arr.length-1;

        // while(i<j){
            //swapping

        //     i++;
        //     j--;
        // }



//         
//         //find the element which is repeated most number of times;
//         int max=0;
//         int ele=0;
//         //select each element one by one
//         for(int i=0;i<arr.length;i++){
//             int count=0;
//             int num=arr[i];
//             for(int j=0;j<arr.length;j++){
//                 if(arr[j]==num){
//                     count++;
//                 }
//             }
//             if(max<count){
//                 max=count;
//                 ele=num;
//             }
//         }
// System.out.println(ele +" is repeated "+ max +" number of times");
        // int arr[] ={2  ,5,1,4,6,3,5}; 

        // int max = Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         max=arr[i];
        //     }
        // }
        // System.out.println("greatest element is =>" + max);

        //find the largest element in this array



        // int [] emp = new int[5];


        // int salary=10000;
        // for(int i=0;i<5;i++){
        //     emp[i]=salary*(i+1);
        // }
        // int sum=0;
        // for(int i=0;i<emp.length;i++){
        //     sum =sum+emp[i];
        // }

        // int i=0;
        // while(i<5){
        //     emp[i]=10000;
        //     i++;

        // }

        // for(int i=0;i<5;i++){
        //     emp[i]=10000;
        // }

        // int emp1=20000;
        // int emp2=30000;
        // int emp3=40000;
        // int emp4=70000;
        // int  emp5= 50000;

        // emp1 = emp1+emp1*10/100;

        // System.out.println("emp 1 salray "+emp1);
        // System.out.println("emp 2 salary "+emp2);
        // System.out.println("emp 3 salary "+emp3);
        // System.out.println("emp 4 salary "+emp4);
        // System.out.println("emp 5 salary "+emp5);

        // int sum = emp1+emp2+emp3+emp4+emp5;
        // System.out.println("sum of salary of all the employees = "+sum);
    }
}
