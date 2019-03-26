package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;


public class Main {

    public static void main(String[] args) {
            /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     */
        int[] array = new int[20];
        

	    /*
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     */
            
        FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
        fibonacciInitializer.initialize(array);
         
        // Проверка
        System.out.println("Выводим массив из чисел Фибоначчи:");
        ArrayFactory.toConsole(array);
            
            /*
	     * 2. Найти сумму элементов массива.
	     */
        
        int sum = ArrayFactory.sum(array);
        
        // Проверка
        System.out.println("Сумма всех элементов массива = " + sum + "\n");
            
            /*
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     */
        
        RandomInitializer randomInitializer = new RandomInitializer();
        randomInitializer.initialize(array);
        
        // Проверка
        System.out.println("Выводим массив из случайных числе от -50 до 50:");
        ArrayFactory.toConsole(array);
                    
            /*
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     */
            
        Sort bubblesort = new BubbleSort();
        bubblesort.sort(array);
        // Проверка
        System.out.println("Сортируем массив методом пузырьковой сортировки:");
        ArrayFactory.toConsole(array);

            /*
            * 5. Проинициализировать массив последовательностью
            *    случайных чисел в диапазоне от -50 до 50.
            */
         
         randomInitializer.initialize(array);
         // Проверка
         System.out.println("Выводим массив из случайных числе от -50 до 50:");
         ArrayFactory.toConsole(array);
         
            /*
            * 6. Отсортировать массив с использованием
            *    сортировки выбором.
            */
            
        Sort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        // Проверка
        System.out.println("Сортируем массив методом сортировки выбором:");
        ArrayFactory.toConsole(array);
        
            /* 7. Проинициализировать массив последовательностью
            *    случайных чисел в диапазоне от -50 до 50.
            */
         randomInitializer.initialize(array);
         // Проверка
         System.out.println("Выводим массив из случайных числе от -50 до 50:");
         ArrayFactory.toConsole(array);

         
            /* 8. Отсортировать массив с использованием
            *    сортировки Шелла.
            */
            
        Sort shellSort = new ShellSort();
        shellSort.sort(array);
        // Проверка
        System.out.println("Сортируем массив методом сортировки Шелла:");
        ArrayFactory.toConsole(array);
    }
}
