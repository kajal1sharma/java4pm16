public class Calculator {


    static int CalculatorFun(int num1, int num2, char symbol){
        int result=0;
        if(symbol=='+'){
            result =num1+num2;
        }
        else if(symbol=='-'){
            result =num1-num2;
        }
        else if(symbol=='*'){
            result=num1*num2;
        }
        else if(symbol=='/'){
            result =num1/num2;
        }
        else{
            result = Integer.MAX_VALUE;
        }
        return result;


    }
    public static void main(String[] args) {
        
        int num1=90;
        int num2=80;
        char symbol ='-';
        int result =CalculatorFun(num1,num2,'*');
         System.out.println(result);
        result =CalculatorFun(num1,num2,'/');
        System.out.println(result);
    }
}
