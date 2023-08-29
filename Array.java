import java.util.Scanner;

class Array{
    public static void main(String[] args) {
        

        Scanner sc =new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array");
        size=sc.nextInt();

        int arr[]= new int[size];

        for(int i=0;i<size;i=i+1){
            System.out.println("enter "+(i+1)+"value");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i=i+1){
            sum=sum+arr[i];
        }
        System.out.println("the sum of all the values is : "+sum);


        // int arr[] = {23,23,45,76,67,35};// declaration with initialization
        
        // for(int i=0 ;i<=5;i=i+1){
        //     System.out.println(arr[i]);
        // }

        //Scanner 
       
        //arr[0]
        //arr[1]
        //arr[2]
        //arr[3]
        //arr[4]

        // Scanner sc = new Scanner(System.in);
        //  int n;
        //  System.out.println("Enter the size of array");
        // n =sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the first value");
        // arr[0]=sc.nextInt();
        // System.out.println("Enter the 2nd value");
        // arr[1]=sc.nextInt();
        // System.out.println("Enter the 3rd value");
        // arr[2]=sc.nextInt();
        // System.out.println("Enter the 4th value");
        // arr[3]=sc.nextInt();
        // System.out.println("Enter the 5th value");
        // arr[4]=sc.nextInt();

        // for(int i=0;i<=4;i=i+1){
        //     System.out.println("enter "+i+" value");
        //     arr[i]=sc.nextInt();
        // }
        // //sum of all values 
        // for(int i=0;i<=4;i=i+1){
        //     System.out.println(arr[i]);
        // }


        //user

        
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr[5]);

        // char charr[] = new char[4];
        // double d[]= new double[10];
        // char []ch2= new char[5];
        // char[] ch3 =new char[4];


        // int studentMarks[]= new int[5];
        // studentMarks[0]=45;
        // studentMarks[1]=89;
        // studentMarks[2]=90;
        // studentMarks[3]=67;
        // studentMarks[4]=90;

        // System.out.println("marks of student 1 : "+studentMarks[0]);
        // System.out.println("Marks of student 2 : "+studentMarks[1]);
        // System.out.println("Marks of student 3 : "+studentMarks[2]);
        //  System.out.println("Marks of student 4 : "+studentMarks[3]);
        //   System.out.println("Marks of student 5 : "+studentMarks[4]);

        //collection of same type of data undder one name in contiguous memory location

        // int a=23;
        // float f= 34.34f;
        // double d= 34.5656;
        // boolean bool = false;

        // int student1=100;
        // int student2=300;
        // int student3=250;
        // int student4=600;

        // int avg = (student1+student2+student3+student4)/4;
        // System.out.println("average of marks of all students = "+avg);


    }
}