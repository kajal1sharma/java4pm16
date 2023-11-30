class Student{

    private String univRoll;//univRoll it should be different for all studetn
    private String name;
    private String email;

    private Address add;
    private Marks marks;

    Student(){
        this.add = new Address(null, 0);
        marks=new Marks(0, 0, 0, 0, 0);
    }

    Student(String name){
          this.add = new Address(null, 0);
         marks=new Marks(0, 0, 0, 0, 0);
        this.name=name;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
    public Address getAdd() {
        return add;
    }
    public void setMarks(int subject1, int subject2, int subject3, int subject4, int subject5) {
        // Marks temp = new Marks(subject1, subject2, subject3, subject4, subject5);
        marks.setSubject1(subject1);
        marks.setSubject2(subject2);
        marks.setSubject3(subject3);
        marks.setSubject4(subject4);
        marks.setSubject5(subject5);
        
    }
    public Marks getMarks() {

        return marks;
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
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        // pattern checking
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

}