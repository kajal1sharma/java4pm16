class Student{

    private String univRoll;//univRoll it should be different for all studetn
    private String name;

    Student(String name){
        this.name=name;
    }
    boolean setUnivRoll(String univRoll, Student[] arr){

        int i=0;
        while(arr[i]!=null){
            if(univRoll.equals(arr[i].univRoll)){
                return false;
            }
            i++;
        }
        this.univRoll=univRoll;
        return true;
    }

    String getUnivRoll(){
        return this.univRoll;
    }

}