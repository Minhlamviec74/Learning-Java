package pr1.classes.exercise.abstractstuffs;
public class ListDemo{
    public static void main(String[] args){
        List list = new List();
        for(int i = 0; i < 5; i ++){
            list.add(i * 3);
        }
        System.out.println(list.getValueFromindex(2));
    }
}