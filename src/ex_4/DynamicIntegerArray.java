package ex_4;

import java.util.Random;

public class DynamicIntegerArray {
    private int[] array;
    int currentSize;

    public DynamicIntegerArray(int[] array) {
        this.array = array;
    }

    public void initializeArray(){
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(0, 50);
        }
    }

    public void add(int value){
        int[] arr1 = new int[array.length + 1];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = array[i];
        }
        array = arr1;
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
        int[] arr1 = new int[this.array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == indexOfElement){
                continue;
            }else {
                arr1[k++] = array[i];
            }
        }
        array = arr1;
    }
    public void remove(int value){
        int countOfSpecificValues = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                countOfSpecificValues++;
            }
        }
        int[] arr1 = new int[array.length - countOfSpecificValues];
        int k = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                continue;
            }else {
                arr1[k++] = array[i];
            }
        }
        array = arr1;
    }
    public void print(){
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i] + " ");
        }
    }
}
