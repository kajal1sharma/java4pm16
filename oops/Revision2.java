
//all the function are by default => public abstract
//all the data members are final static public
interface Phone{
    String companyName="Nokia";
    String branch ="new delhi";
    void get();
    int size();
}
//when an interface extends other interface then 
//all the abstract methods and properties are inherited
interface Phone2 {

    void set() ;
    String getInfo();

    
}
//multiple inheritence
class Abc implements Phone, Phone2{
    
    public void get() {
        // TODO Auto-generated method stub
        
    }
   
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public void set() {
        // TODO Auto-generated method stub
        
    }
    
    public String getInfo() {
        // TODO Auto-generated method stub
        return null;
    }
}


public class Revision2 {
    public static void main(String[] args) {
     
        System.out.println(Phone.companyName);
        System.out.println(Abc.companyName);
    }
}
