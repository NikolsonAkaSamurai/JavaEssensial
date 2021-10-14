package com.laboratorka1;

public class User {
    private String login;
    private String password;

    User(){}

    User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    class Query{

        public void printToLog(){
            System.out.println("пользователь "+ login + " пароль "+password);
        }
    }
}
