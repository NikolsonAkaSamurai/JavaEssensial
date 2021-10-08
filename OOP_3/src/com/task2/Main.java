package com.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите сложность учебной программы\nвремя урока(45-90) сложность заданий(1-5) "
                +"количество страниц конспекта(1-10)");
        LearnProgram lp = new LearnProgram(getNum(),getNum(),getNum());

        ClassRoom class1 = new ClassRoom(getPupil(lp),getPupil(lp),getPupil(lp),getPupil(lp));

        classInfo(class1);

    }

    //введение пользователем параметров
    static int getNum(){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        return num;
    }

    //метод возвращающий рандомного ученика
    static Pupil getPupil(LearnProgram lp){

        //характеристики учебной программы
        int timeLesson = lp.timeLesson;//длительность урока в минутах
        int hardnessOfTask = lp.hardnessOfTask; // сложность заданий на уроке от 1 до 5;
        int amountOfText = lp.amountOfText;// количество страниц, которые ученик пишет за урок

        //характеристики ученика
        Random rnd = new Random();
        int endurance = rnd.nextInt(45)+45;
        int gumption = rnd.nextInt(4)+1;
        int writeEndurance = rnd.nextInt(5)+2;

        //соотношение сложности программы и способностей ученика
        float e = endurance / timeLesson;
        float g = gumption / hardnessOfTask;
        float w = writeEndurance / amountOfText;
        float result = e + g + w;

        //возврат ученика
        if(result >= 2.5){
            ExcellentPupil pupil = new ExcellentPupil();
            return pupil;
        }else if(result >= 2. && result < 2.5){
            GoodPupil pupil = new GoodPupil();
            return pupil;
        }else{
            BadPupil pupil = new BadPupil();
            return pupil;
        }

    }

    //посмотреть информацию о всех учениках
    static void classInfo(ClassRoom class1){
        class1.pupil1.study();
        class1.pupil2.study();
        class1.pupil3.study();
        class1.pupil4.study();

        System.out.println("");
        class1.pupil1.write();
        class1.pupil2.write();
        class1.pupil3.write();
        class1.pupil4.write();

        System.out.println("");
        class1.pupil1.read();
        class1.pupil2.read();
        class1.pupil3.read();
        class1.pupil4.read();

        System.out.println("");
        class1.pupil1.relax();
        class1.pupil2.relax();
        class1.pupil3.relax();
        class1.pupil4.relax();
    }
}
