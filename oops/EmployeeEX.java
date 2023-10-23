
class Employee{
    private int salary;
    private int hours;

    Employee(){

    }
    Employee(int salary, int hours){
        this.salary=salary;
        this.hours=hours;
    }

    void getInfo(){
        System.out.println("========================");
        System.out.println(this.salary);
        System.out.println(this.hours);
        System.out.println("========================");
    }

    void addSal(){
        if(this.salary<500){
            this.salary=this.salary+10;
        }
    }
    void addWork(){
        if(this.hours>6){
            this.salary=this.salary+5;
        }
    }

}


class EmployeeEx{
    public static void main(String[] args) {
        
        Employee em= new Employee(500, 10);
    }
}