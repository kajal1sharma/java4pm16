//jvm starts the main thread
//there is a main thread which runs the main function
//one stack memory is associated with the main thread
//for every function ccall a stack frame create
//these stack frames are pushed inside the stack
//which ever stack frame is on the top that executed


public class Callstack2 {



    static void printIt(String []temp){
        for(int i=0;i<temp.length;i=i+1){
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {
    
        String arr[]={"a","b","c","d"};
        printIt(arr);
        for(int i=0;i<args.length;i=i+1){
            System.out.println(args[i]);
        }
    }


    // static void readIt(){
    //     //System.out.println(a);
    //     System.out.println("line 4");
    //     System.out.println("line 5");
    // }
    // static int printIt(int a, int b){
        
    //     System.out.println("line 1");
       
    //     System.out.println("line 2");
    //     int result =a+b;
    //     return result;
    // }
    // public static void main(String[] args) {
    //     int a=90;
    // System.out.println("line 0");
    //    int res= printIt(34,45);

    //     System.out.println(res);
    // }
}


