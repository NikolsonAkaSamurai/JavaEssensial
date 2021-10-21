package сom.company.myTests.test0;

public class Car {
    private boolean carIsFool;

    Car(boolean carIsFool){
        this.carIsFool = carIsFool;
    }

    public void checkCar(){
        try{
            if(carIsFool != true){
                throw new CarException("бак пустой!");
            }else{
                System.out.println("Можно ехать, бензин есть");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
