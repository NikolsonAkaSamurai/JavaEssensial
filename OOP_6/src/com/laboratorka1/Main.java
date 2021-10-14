package com.laboratorka1;

public class Main {
    public static void main(String[] args) {
        User user = new User("anton", "12334");
        user.createQuery();

        User.Query query2 = user.new Query();
        query2.printToLog();

        User.Query query3 = new User("dima","4444").new Query();
        query3.printToLog();
    }
}
