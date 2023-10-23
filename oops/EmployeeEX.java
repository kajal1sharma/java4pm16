
class Employee{
    private int salary;
    private int hours;

    private boolean inc;

    Employee(){
        this.inc=false;
    }
    Employee(int salary, int hours){
        this.salary=salary;
        this.hours=hours;
        this.inc=false;
    }

    void getInfo(){
        System.out.println("========================");
        System.out.println(this.salary);
        System.out.println(this.hours);
        System.out.println("========================");
    }

    void addSal(){
        if(this.salary<500 && inc==false){
            this.inc=true;
            this.salary=this.salary+10;
        }
    }
    void addWork(){
        
        if(this.hours>6 && this.inc==false){
            this.inc=true;
            this.salary=this.salary+5;
        }
    }

}


class EmployeeEx{
    public static void main(String[] args) {
        
        Employee em= new Employee(400, 10);
        em.addSal();
        em.addWork();
        em.addWork();
        em.addWork();
        em.addSal();


        em.getInfo();
    }
}