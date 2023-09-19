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

        
    //     int[] arr1 = {2, 4, 5, 7, 8, 9,21,28};
    // int[] arr2 = {3, 8, 13, 14, 15};

    // int len1 = arr1.length;
    // int len2 = arr2.length;
    // int[] arr3 = new int[len1 + len2];

    // int i = 0;
    // int j = 0; 
    // int p = 0;

    // for (p = 0; p < arr3.length; p++) {
    //     if (i < len1 && (j >= len2 || arr1[i] < arr2[j])) {
    //         arr3[p] = arr1[i++];
    //     } else {
    //         arr3[p] = arr2[j++];
    //     }
    // }

    // for (p = 0; p < arr3.length; p++) {
    //     System.out.print(arr3[p] + " ");
    // }
        // int arr1[] ={1,3,5,7,9,10};
        // int arr2[] ={4,5,8,9,12,14,45};

        // int arr3[] = new int[arr1.length+arr2.length];

        // for(int i=0;i<arr1.length;i++){
        //     arr3[i] =arr1[i];
        // }



        // for(int i=0;i<arr2.length;i++){
        //     arr3[i+arr1.length]=arr2[i];
        // }

        // sort(arr3);


        // for(int i=0;i<arr3.length;i++){
        //     System.out.println(arr3[i]);
        // }

    }
}
