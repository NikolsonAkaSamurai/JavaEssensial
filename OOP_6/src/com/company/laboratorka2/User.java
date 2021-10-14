package com.company.laboratorka2;

public class User {
    private String login;
    private String password;

    User(){}

    User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        class Query{
            public void printToLog(){
                System.out.println("пользователь "+login+" пароль "+password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }




}
