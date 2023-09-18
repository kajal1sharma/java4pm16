class Sorting{
    public static void main(String []args){
        
        int []arr = {9,7,6,5,4,3,2,1};//declaration and initialization at same time

        //total number of cycles
        for(int i=0;i< arr.length-1;i=i+1){
            //total number of comparision
            for(int j=0;j<arr.length-1-i;j=j+1){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        for(int i=0;i<arr.length;i=i+1){
            System.out.println(arr[i]);
        }


    }
}