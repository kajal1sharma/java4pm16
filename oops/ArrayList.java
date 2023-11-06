public class ArrayList implements Collection{

    int arr[];
    int index;

     ArrayList(){
        index=0;
        arr = new int[10];
    }
    ArrayList(int size){
        index=0;
        arr= new int[size];
    }

    public void setvalue(int data){
        if(index==arr.length){
            return;
        }
        this.arr[this.index] =data;
        this.index++;
    }
    public int  size(){
        return index;
    }
    public void removeAll(){
        for(int i=0;i<index;i++){
            arr[i]=0;
        }
        index=0;
    }
     public String toString(){
        String s ="[";
        for(int i=0;i<index;i++){
            s=s+arr[i]+",";
        }
       s=s+"]";

       return s;
    }
}