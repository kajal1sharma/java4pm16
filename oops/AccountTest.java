public class AccountTest {
    public static void main(String[] args) {
        Customer c= new Customer(112, "nita", 'f');
        
        Account2 acc= new Account2(32, c, 1000);
        // System.out.println(acc.getCustomer());
        // System.out.println(acc);
        System.out.println(acc.withdraw(500));
        // System.out.println(c.getId());
        // System.out.println(c.getName());
        // System.out.println(c.getGender());
        // System.out.println(c);

    }
}
