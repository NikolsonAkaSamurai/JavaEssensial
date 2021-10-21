package сom.company.myTests.test2;

public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("мое исключение"); //создается объект класса Exception

        try{ // в блоке try забрасыается объект исключения в поток
            throw ex;
        }catch (Exception e){ // catch вылавливает из потока исключение ex и выводится его сообщение
            System.out.println(e.getMessage());
        }
    }
}
