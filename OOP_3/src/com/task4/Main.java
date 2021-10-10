package com.task4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("введите 4-х значный ключ");
        String productKey = scn.next();

        DocumentWorker doc;

        if(productKey.equals("3333")){
            doc = new ExpertDocumentWorker();
        }else if(productKey.equals("2222")){
             doc = new ProDocumentWorker();
        }else{
             doc = new DocumentWorker();
        }
        doc.openDocument();
        doc.editDocument();
        doc.saveDocument();

    }

}
