
class Test2{
    public static void main(String[] args) {
        Address add = new Address();
        add.landmark="djkshfkjsa";
        add.setState("new delhi");
        String temp= add.getState();
        System.out.println(temp);
    }
}
class Address{
    private String street;
    private int houseNo;
    private String city;
    private String state;
    String landmark;
    private String phone;

    void setPhone(String phonetemp){
        if(phonetemp.length()>10){
            return;

        }
        else if(phonetemp.length()==10){
            phone=phonetemp;
        }
    }
    //setter => sets the value inside your data member
    void setState(String tempstate){
        state = tempstate;
    }

    String getState(){
        return state;
    }
}

class Student{

}

