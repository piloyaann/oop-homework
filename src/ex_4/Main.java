package ex_4;

public class Main {
    public static void main(String[] args) {
        DynamicIntegerArray dynamicArray = new DynamicIntegerArray(new int[6]);
        dynamicArray.initializeArray();
        dynamicArray.print();
        System.out.println();
        dynamicArray.add(5);
        dynamicArray.print();
    }
}
