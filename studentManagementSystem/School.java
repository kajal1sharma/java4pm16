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
            System.out.println(arr[i].getUnivRoll()+"\t"+arr[i].getName()+"\t"+arr[i].getEmail()+"\t"+arr[i].getMarks().getTotalMarks());
        }
    }

    void editInformation(String roll){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ;i<count;i++){
            if(arr[i].getUnivRoll().equals(roll)){
                int ch;
                System.out.println("Enter \n1:name\n2.email\n3.marks");
                ch = sc.nextInt();
                if(ch==1){
                    System.out.println("enter your name");
                    String name= sc.next();
                    arr[i].setName(name);
                }
                else if(ch==2){
                     System.out.println("enter your email id");
                    String email= sc.next();
                    arr[i].setEmail(email);
                }
                else if(ch==3){
                    System.out.println("Enter 5 subject marks");
                    System.out.println("subject 1");
                    int subject1 = sc.nextInt();
                    System.out.println("subject 2");
                    int subject2 = sc.nextInt();
                    System.out.println("subject 3");
                    int subject3 = sc.nextInt();
                    System.out.println("subject 4");
                    int subject4 = sc.nextInt();
                    System.out.println("subject 5");
                    int subject5 = sc.nextInt();
                    arr[i].setMarks(subject1, subject2, subject3, subject4, subject5);   
                }
            }
        }
    }
    public static void main(String[] args) {
        School sc = new School(10);
        School.name="DPS";

        char ch='Y';
        Scanner scanner = new Scanner(System.in);

        while(ch=='Y'){
            System.out.println("Enter \n1.Admission\n2.Student List\n3.Edit Student info");
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
                case 3:System.out.println("Enter roll no");
                        String rollno = scanner.next();
                        sc.editInformation(rollno);
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
