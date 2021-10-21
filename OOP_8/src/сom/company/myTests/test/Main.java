package сom.company.myTests.test;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        try{ //помещается исполняемый код
            System.out.println(a/b);

        }catch (Exception e){ //если в try появляется ошибка, она принимается в catch и выводится сообщение ошибки
            System.out.println(e.getMessage());
        }

    }
}
