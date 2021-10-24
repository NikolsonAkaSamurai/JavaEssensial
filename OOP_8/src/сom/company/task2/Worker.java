package сom.company.task2;

import static сom.company.task2.InputText.*;

public class Worker{
    private final static int THIS_YEAR = 2021;//текущий год для вычесления стажа работника
    private String name;//фамилия и инициалы работника
    private String employeePosition;//должность работника
    private int yearOfJoining;//год устройства на работу

    Worker(){}

    Worker(String name, String employeePosition, int yearOfJoining){
        this.name = name;
        this.employeePosition = employeePosition;
        this.yearOfJoining = yearOfJoining;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }
    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getName() {
        return name;
    }
    public String getEmployeePosition() {
        return employeePosition;
    }
    public int getYearOfJoining() {
        return yearOfJoining;
    }

    //получение стажа работника
    public int employeeExperience(){
        int experience = THIS_YEAR - yearOfJoining;
        return experience;
    }

    //методы для заполнения данных работника
    public void inputName(){
        System.out.println("Укажите фамилию работника");
        setName(inputString());
    }
    public void inputEmployeePosition(){
        System.out.println("Укажите должность работника");
        setEmployeePosition(inputString());
    }
    public void inputYearOfJoining(){
        System.out.println("Укажите год устройства на работу");
        setYearOfJoining(inputInt());
    }
}
