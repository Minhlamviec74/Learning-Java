package pr1.classes.exercise.irlapplications;
public class CarDemo{
    public static void main(String[] args){
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);
        double gasLeft = myHybrid.getGasInTank();
        System.out.println(gasLeft);
    }
}