public class Account {
    int accountNo;
    String name;
    String dob;
    int phone;
    int id;
    String address;
    String url;
    int amount;
    String transactions[];

    public int  getAmount(){
        return 0;
    }
    public String getMyDetails(){
        return "pooja";
    }

    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2= new Account();
        Account acc3= new Account();
        acc1.amount=10000;
        acc3.amount=4534;
        acc2.dob="12/31/2001";

        acc2.getAmount();
        
    }
}
