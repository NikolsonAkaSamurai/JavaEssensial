package com.company.task4;

public class Links {
    /*
    описание вложенных классов на сайте Oracle
    https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
        Внутренний класс имеет доступ к полям и методам внешнего класса, даже если они private.
    Внутренний класс ялвяется членом внешнего класса. В свою очередь внешний класс не имеет доступа
    к полям и методам внутреннего класса. Экземпляр внутреннего класса будет находиться в экземпляре
    внешнего класса. Внешние классы нельзя делать private, protected и static.

                ---------создание внутреннего класса----------
    OuterClass{
        InnerClass{
        }
    }
                -----создание объекта внутреннего класса---------
    OuterClass outerObject = new OuterClass();
    OuterClass.InnerClass innerObject = outerObject.new InnerClass();


        Внутренний статический класс не будет иметь доступа к полям и методам внешнего класса.
     Вложенный статический класс может получить доступ к полям и методам внешнешл класса только
     через ссылку на его объект.

        -----вывод в консоль статического поля внешнего класса через вложенный-----
     OuterClass{
     static int field = 1;
        static InnerClass{
            System.out.println(outerObject.field);
        }
     }

        Статические методы можно распологать только в статическом классе. В то время как в
     как в статическом классе можно записывать нестатические методы.

     */
}
