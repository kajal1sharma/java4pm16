public class Account2 {
    int id;
    Customer customer;
    double balance =0.0;

    Account2(int id , Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    Account2(int id , Customer customer){
        this.id=id;
        this.customer=customer;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        String s = this.customer.name+"("+this.id+") balance = $"+this.balance;
        return s;
    }
    String getCustomerName(){
        return this.customer.name;
    }
    double deposit(double amount){
        this.balance=this.balance+amount;
        return balance;
    }
    Account2 withdraw(double amount){
        if(this.balance>amount){
            this.balance=this.balance-amount;

        }
        else{
            System.out.println("amount withdrawn exceeds the current balance ");
        }

        return this;
    }

}
