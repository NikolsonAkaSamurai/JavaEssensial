package сom.company.task2;

import java.util.*;
import static сom.company.task2.InputText.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        Worker[] workers = new Worker[5];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        //-----------заполнение массива из программы
//        workers[0].setName("Smith A.D.");
//        workers[0].setEmployeePosition("director");
//        workers[0].setYearOfJoining(1990);
//        workers[1].setName("Brown E.S.");
//        workers[1].setEmployeePosition("manager");
//        workers[1].setYearOfJoining(1991);
//        workers[2].setName("Johnson B.R.");
//        workers[2].setEmployeePosition("art-director");
//        workers[2].setYearOfJoining(1992);
//        workers[3].setName("Michael O.P.");
//        workers[3].setEmployeePosition("worker");
//        workers[3].setYearOfJoining(1993);
//        workers[4].setName("Halt J.D.");
//        workers[4].setEmployeePosition("rider");
//        workers[4].setYearOfJoining(1996);



        //-----------заполнение массива через Scanner
        for (Worker temp:workers) {
            temp.inputName();
            temp.inputEmployeePosition();
            temp.inputYearOfJoining();
        }

        //----------сортировка массива с компаратором
        Arrays.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //----------поиск работника по стажу с вводом количества лет через Scanner
        System.out.println("поиск работников со стажем больше (укажите сколько) лет");
        int experience = inputInt();
        for (Worker temp:workers) {
            if (temp.employeeExperience() > experience){
                System.out.println(temp.getName());
            }
        }
    }
}
