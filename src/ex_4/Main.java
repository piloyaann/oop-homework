package ex_4;

public class Main {
    public static void main(String[] args) {
        DynamicIntegerArray dynamicArray = new DynamicIntegerArray(new int[4]);
        dynamicArray.addAt(0, 5);
        dynamicArray.addAt(1, 5);
        dynamicArray.addAt(2, 6);
        dynamicArray.addAt(3, 6);
        dynamicArray.addAt(4, 6);
        dynamicArray.addAt(5, 6);
        dynamicArray.addAt(6, 6);
        dynamicArray.addAt(7, 6);
        dynamicArray.addAt(8, 6);
        dynamicArray.print();
    }
}
