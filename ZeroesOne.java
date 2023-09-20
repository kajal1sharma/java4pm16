public class ZeroesOne {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,0,0,1,1,1};

        int countOfZeroes =0;
        for(int i=0;i<arr.length ;i++){
            if(arr[i]==0){
                countOfZeroes++;
            }
        }


        for(int i=0;i<countOfZeroes;i++){
            arr[i]=0;
        }
        for(int i=countOfZeroes;i<arr.length;i++){
            arr[i]=1;
        }


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
