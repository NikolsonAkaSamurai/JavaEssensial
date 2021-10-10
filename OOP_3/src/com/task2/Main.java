package com.task2;

public class Main {
    public static void main(String[] args) {

        ClassRoom c1 = new ClassRoom(getPupil(5),getPupil(4),getPupil(3),getPupil(2));
        for (int i = 0; i < c1.pupils.length; i++) {
            c1.pupils[i].study();
            c1.pupils[i].write();
            c1.pupils[i].read();
            c1.pupils[i].relax();
            System.out.println("-----------");
        }
    }

    //получение ученика по его оценкам
    static Pupil getPupil(int a){
        if(a == 5){
            return new ExcellentPupil();
        }else if(a == 4){
            return new GoodPupil();
        }else{
            return new BadPupil();
        }

    }
}
