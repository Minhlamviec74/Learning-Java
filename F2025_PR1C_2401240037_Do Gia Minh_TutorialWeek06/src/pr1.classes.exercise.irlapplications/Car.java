package pr1.classes.exercise.irlapplications;
public class Car{
    private double fuelLevel = 0; 
    //We don't want users to meddle in fuelLevel, also it is measured in gallon
    private double fuelEfficiency = 0;// miles/gallons
    Car(double fuelEfficiency){
        this.fuelEfficiency = fuelEfficiency;
    }
    Car(){
        this.fuelEfficiency = 0;
    }
    public void drive(double miles){//drive method
        double usedFuel = (1/this.fuelEfficiency) * miles;
        this.fuelLevel -= usedFuel; //this is in gallons
    }
    public double getGasInTank(){
        //Accessor
        return fuelLevel;
    }
    public void addGas(double gallons){
        //Mutator
        fuelLevel += gallons;
    }

}