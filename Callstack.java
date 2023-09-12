//ODD=> WIN , EVEN LOOSE

public class Callstack {
 
    static void doSomethingEvenMore(){
        int a =90;
        int b=80;
        int sum=a+b;
    }
    static void doSomethingMore(){
        System.out.println("line 1");
        doSomethingEvenMore();
         System.out.println("line 2");
    }

    static void  doSomething(){
         System.out.println("line 3");
        doSomethingMore();
         System.out.println("line 4");
    }


    static void Game(String name){

        int result =  (int)(Math.random()*100);
        if(result%2==0){
            System.out.println(result+ "   "+name+" has lost the game");
        }
        else{
            System.out.println(result+ "   "+name+" has won the game");
            
        }
    }

    public static void main(String[] args) {
        
        Game("meena");
        Game("rita");
        Game("rahul");
        
        //  System.out.println("line 5");
        // doSomething();
        //  System.out.println("line 6");

        // System.out.println(Math.random());
    }
}
