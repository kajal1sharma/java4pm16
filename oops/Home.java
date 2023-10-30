
class Architechture{
   
   public String toString() {
       return "hello you arev inside Architechturw class";
    //    return super.toString();
   }
}

class Design extends Architechture{
 public String toString() {
       return "hello you arev inside Design class";
    //    return super.toString();
   }
}

public class Home  extends Design{
    public String toString() {
       return "hello you arev inside Home class";
    //    return super.toString();
   }
    public static void main(String[] args) {
        Object o = new Object();
        Architechture a= new Architechture();
        Design d= new Design();
        Home h= new Home();

        System.out.println(o.toString());
        System.out.println(a.toString());
        System.out.println(d.toString());
        System.out.println(h.toString());
    }
}


//Object => Architechture => Design => Home
