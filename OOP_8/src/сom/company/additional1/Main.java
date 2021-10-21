package сom.company.additional1;

public class Main {
    public static void main(String[] args){
        try{
            System.out.println(Calculator.div(2,2));
            System.out.println(Calculator.div(2,0));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }

    static class Calculator{

        public static double div(int a, int b) throws ArithmeticException{
            double result = a/b;
            return result;
        }
    }
}
