package сom.company.additional1;

public class Main {
    public static void main(String[] args) throws ArithmeticException{

        try{
            System.out.println(Calculator.div(2,2));
            System.out.println(Calculator.div(2,0));
        }catch(ArithmeticException e){
            System.out.println("на ноль делить нельзя");
        }

    }

    static class Calculator{

        public static double div(double a, double b) throws ArithmeticException{
            double result = a/b;
            return result;

        }
    }
}
