package ru.avalon.java.dev.j10.labs;

/**
 * Класс описывает методы обработки элементов массива
 * @author antonneverovich
 */
public class ArrayFactory {
    
    /**
     * Метод выводит элементы массива в консоль
     * @param array 
     */
    public static void toConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                System.out.print("  ");
        }
        System.out.println("\n");
    }
    
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    } 
}
