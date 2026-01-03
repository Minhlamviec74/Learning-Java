package pr1.classes.exercise.abstractstuffs;
public class List{//dynamic array of integers
    private int[] els; //I can't access the variable inside the constructor, still do it because of the requirements regardless 
    List(){
        int[] els; //initialize a dummy array  
        els = this.els;  
    }
    private int size = 0; //the list length

    public void add(int value){//Add a value to the left side of the array
        size ++;
        int[] newEls = new int[size];
        int temp = size - 1; 
        while(temp >= 0){ //use temp - 1, size is length not index

            if( temp == size - 1 ){
                newEls[temp] = value; //Just do this once
            }
            else{
                newEls[temp] = els[temp];
            }
            
            temp --;
        }
        els = newEls; //the object to which els referring, is already a garbage now
    }
    public void remove(int index){
        size --; //The opposite of add, add every value except the last one
        int[] newEls = new int[size];
        int temp = 0;
        while(temp < size){
            if(temp == index){
                newEls[temp] = this.els[temp + 1];
                temp ++;
                continue;// Not dealing with els[temp]
            }
            newEls[temp] = els[temp]; 
            temp ++;
        }
        els = newEls;
    }
    public int getValueFromindex(int index){
        return this.els[index];
    }
}