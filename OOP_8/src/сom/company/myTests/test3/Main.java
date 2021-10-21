package сom.company.myTests.test3;

public class Main {
    public static void main(String[] args) {
        try{
            throw new Exception("мое исключение");// в поток забрасывается новый объект класса Exception
        }catch (Exception e){   // catch его ловит и выводит сообщение
            System.out.println(e.getMessage());
        }
    }
}
