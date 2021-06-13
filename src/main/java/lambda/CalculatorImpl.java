package lambda;

interface Calculator{

//    void switchOn();
//    void sum(int input);
    int subtraction(int a,int b);



}

public class CalculatorImpl {

    //() -> {body}

    public static void main(String[] args) {
//        Calculator calculator=()->{
//            System.out.println("SwitchOn");
//        };
//
//        calculator.switchOn();

//        Calculator calculator=(input)->System.out.println("The sum is :"+input);
        Calculator calculator=(number1,number2)->{
            return number2-number1;
        };
        int result=calculator.subtraction(5,3);
        System.out.println("The result is "+result);

    }
}
