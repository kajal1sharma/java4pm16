class Student1{
    static String principal;
    private String name;
    private String mobile;
    private int age;
    private int marks;

    public void setAge(int tempAge) {
        age = tempAge;
    }
    public void setMarks(int tempMarks) {
        marks = tempMarks;
    }
    public void setMobile(String tempMarks) {
        mobile = tempMarks;
    }
    public void setName(String tempName) {
        name =tempName ;
    }
    public void setPrincipal(String tempprincipal) {
        principal =tempprincipal;
    }
    public int getAge() {
        return age;
    }
    public int getMarks() {
        return marks;
    }
    public String getMobile() {
        return mobile;
    }
    public String getName() {
        return name;
    }
    public String getPrincipal() {
        return principal;
    }


}


public class StaticKey {
    
    public static void main(String[] args) {
        Student1.principal="vk singh";
        Student1 obj1= new Student1();
        obj1.principal="ln mishra";
        obj1.setPrincipal("sk shrma");
        obj1.setName("meena");

        //static variables can be accessed through classname
        //there is only one copy created for static variables
        //that resides in method area with the class def

        Student1.principal="mn gandhi";

        Student1 obj2 =new Student1();
        String principalName = obj2.getPrincipal();
        principalName= obj2.principal;
        System.out.println(principalName);
        // Student1 obj2 = new Student1();
        // obj2.setPrincipal("vk singh");
        // obj2.setName("rahul");

        // Student1 obj3 = new Student1();
        // obj3.setPrincipal("vk singh");
        // obj3.setName("sita");

        ///////////////////////////////////////////////

        // obj1.setPrincipal("sk sharma");
        // obj2.setPrincipal("sk sharma");
        // obj3.setPrincipal("sk sharma");

    }
}











