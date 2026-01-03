package pr1.classes.exercise.abstractstuffs; //state the package cuz it is necessary
public class FactorGenerator{
    private int workingNumber;
    private String factorList = "";
    private boolean isPrime( int inputNumber){ //check if a number is prime or not
        if((inputNumber == 0) || (inputNumber == 1)){
            return false;
        }
        for( int i = 2; i <= Math.sqrt(inputNumber); i++ ){
            if( inputNumber % i == 0){
                return false; //Nope, not a prime number
            }
        }
        return true;
    }
    FactorGenerator(int numberToFactor){ //The desired constructor
        workingNumber = numberToFactor;
        if(isPrime(workingNumber)){
            System.out.println("1 " + workingNumber); //Ye right to the conclusion wooo
        }
        nextFactor();
        hasMoreFactor(); // Just call it to prevent missing the final prime factor :)
    }
    private void nextFactor(){ //the next factor, last factor and current number are needed.
        for( int testFactor = 2; testFactor <= Math.sqrt(this.workingNumber); testFactor++ ){
            while(this.workingNumber % testFactor == 0){
                this.factorList += (testFactor + " "); //Squeezing out some factors in the form of string
                this.workingNumber /= testFactor; // and to make the while loop finite
            }
                
        }
    }
    boolean hasMoreFactor(){ //To check if there's still more factor to find
        if(this.workingNumber != 1){
            this.factorList += (this.workingNumber + ""); //the last prime factor
            this.factorList += "1";
            return true;
        }
        else{
            this.factorList += "1";
            return false;
        }
    }
    String getFactorList(){
        return this.factorList; //getter
    }
}