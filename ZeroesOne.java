public class ZeroesOne {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,0,1,0,0,0,1,1,1};


        int i=0;
        int j=arr.length-1;

        for(;;){

            for(;arr[i]==0;i++){
                
            }

            while(arr[j]==1){
                j--;
            }

            if(j<i){
                break;
            }

            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

        // int countOfZeroes =0;
        // for(int i=0;i<arr.length ;i++){
        //     if(arr[i]==0){
        //         countOfZeroes++;
        //     }
        // }


        // for(int i=0;i<countOfZeroes;i++){
        //     arr[i]=0;
        // }
        // for(int i=countOfZeroes;i<arr.length;i++){
        //     arr[i]=1;
        // }


        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }


    }
}
