package lesson01;

import java.util.Arrays;

public class Task01 {
    public static void main (String[] args) {
        int[] array = {99, 6, 3, 34, 7, 25, 5, 9, 10, 3};
        System.out.println("Original: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("bubbleSort: " + Arrays.toString(array));

        int[] array2 = {99, 6, 3, 34, 7, 25, 5, 9, 10, 3};
        System.out.println("Original: " + Arrays.toString(array2));
        quickSort(array2, 0, array2.length - 1);
        System.out.println("quickSort" + Arrays.toString(array2));
    }

    private static void bubbleSort(int[] array){
        for (int i = 1; array.length > i; i++){
            boolean exit = true;
            for (int j = 0; array.length - i > j; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    exit = false;
                }
            }
            if (exit) return;
        }

    }

    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high)
            return;

        int middle = low + (high - low) / 2;
        int sEl = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < sEl) {
                i++;
            }

            while (array[j] > sEl) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

}

