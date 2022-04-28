package algorithms.sorting;

/**
 * Project Name    : java-interview-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/27/2022
 * Time            : 8:29 AM
 * Description     :
 **/

public class TestArraySortUsingForLoop {

    public static void main(String[] args) {
        // Creating an instance of an array
        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Array elements after sorting:");

        // Sorting logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

            // Prints the sorted element of the array
            System.out.println(arr[i]);
        }
    }
}
