package сom.company.additional1;

public class Calculator {



        public static double sum(double a, double b){
            double result = a + b;
            return result;
        }

        public static double sub(double a, double b){
            double result = a - b;
            return result;
        }

        public static double mult(double a, double b){
            double result = a * b;
            return result;
        }

        public static double div(double a, double b){
            try{
                if(b != 0){
                    return a/b;
                }else{
                    throw new ExceptionZero("Нельзя делить на ноль!");
                }
            }catch (ExceptionZero e){
                System.out.println(e.getMessage());
            }
            return 0;// так и не понял как по другом сделать проверку в методе с возращаемым значением
        }
}
