

public class DisplayingtheCurrentTime{
    public static void main(String[] args){
        System.out.println(System.currentTimeMillis()); //This method returns the elapsed time since 1/1/1970 0:00
        // Let's calculate hour first
        long hour = (System.currentTimeMillis() / (1000 * 60 * 60))  % 24; //Each day has 24 hour, by using modulo, we can get the hour!
        long minute = (System.currentTimeMillis() / (1000 * 60)) % 60; 
        long second = (System.currentTimeMillis() / 1000) % 60;
        System.out.printf("%d:%d:%d", hour, minute, second);
    }
}