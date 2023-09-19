public class MergeSortedArray {
    static void sort(int arr[]){
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
        }
    public static void main(String[] args) {
        int arr1[] ={1,3,5,7,9,10};
        int arr2[] ={4,5,8,9,12,14,45};

        int arr3[] = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            arr3[i] =arr1[i];
        }



        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }

        sort(arr3);


        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

    }
}
