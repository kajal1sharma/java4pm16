public class School {
    static int count=0;
    static String name;
    Student arr[];

    School(int studentCount){
        arr= new Student[studentCount];
    }

    void getNewStudent(String univRoll){
        Student st = new Student();
        boolean result = st.setUnivRoll(univRoll, arr);
        if(result==true){
            this.arr[count]=st;
            count++;
        }
        else{

        }
    }

    void getListOfStudents(){
        for(int i=0;i<count;i++){
            System.out.println(arr[i].getUnivRoll()+"= student "+(i+1));
        }
    }
    public static void main(String[] args) {
        School sc = new School(10);
        School.name="DPS";

        sc.getNewStudent("gfhgjklkk");
        sc.getNewStudent("sdfgh5467");
        sc.getNewStudent("34etrfghjk");
        sc.getNewStudent("sdfg67fghjk");
        sc.getListOfStudents();

    }
}
