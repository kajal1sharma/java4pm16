import java.util.Scanner;

public class School {
    static int count=0;
    static String name;
    Student arr[];

    School(int studentCount){
        arr= new Student[studentCount];
    }

    void getNewStudent(String name,String univRoll){
        Student st = new Student(name);
        boolean result = st.setUnivRoll(univRoll, arr);
        if(result==true){
            this.arr[count]=st;
            count++;
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

        char ch='Y';
        Scanner scanner = new Scanner(System.in);

        while(ch=='Y'){
            System.out.println("Enter 1.Admission\n2.Student List");
            int option= scanner.nextInt();
            switch(option){
                case 1: System.out.println("Enter Student name");
                        String name= scanner.next();
                        System.out.println("Enter the roll no");
                        String roll= scanner.next();
                         sc.getNewStudent(name, roll);
                        break;
                case 2: sc.getListOfStudents();
                        break;
                default:System.out.println("you have entered wrong choice");

            }

            System.out.println("Do you want to continue?(Y for yes)");
            ch = scanner.next().charAt(0);

        }
        System.out.println("Thaank you for using this application");
        // sc.getNewStudent("gfhgjklkk");
        // sc.getNewStudent("sdfgh5467");
        // sc.getNewStudent("34etrfghjk");
        // sc.getNewStudent("sdfg67fghjk");
        // sc.getListOfStudents();

    }
}
