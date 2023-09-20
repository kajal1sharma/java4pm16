public class MergeSort {
    public static void main(String[] args) {
        
        int arr1[] ={1,2,4,5,7,8};
        int arr2[] ={2,3,6,9};

        int arr3[]=  new int[arr1.length + arr2.length];


        int i =0;
        int j=0;
        int k=0;

        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]= arr1[i];
                i++;
                k++;
            }
            else if(arr1[i]>=arr2[j]){
                arr3[k] =arr2[j];
                j++;
                k++;

            }
        }

        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
        }



        for(int l=0 ;l<arr3.length;l++){
            System.out.println(arr3[l]);
        }

    }
}
