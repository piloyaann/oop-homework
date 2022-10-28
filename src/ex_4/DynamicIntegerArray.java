package ex_4;

import java.util.Random;

public class DynamicIntegerArray {
    private int[] array;

    public DynamicIntegerArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void add(int value){
        
    }
    public void initializeArray(){
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(0, 50);
        }
    }
    public void addAt(int index, int value){
        int[] arr1 = new int[array.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i == index){
                arr1[i] = value;
            }
            else if(i < index) arr1[i] = array[i];
            else arr1[i] = array[i - 1];
        }
        array = arr1;
    }
    public void removeAt(int indexOfElement){

    }
    public void remove(int value){}
    public void print(){
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i] + " ");
        }
    }
}
