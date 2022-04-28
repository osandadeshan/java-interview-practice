package algorithms.sorting;

import java.util.Arrays;

/**
 * Project Name    : java-interview-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/27/2022
 * Time            : 8:10 AM
 * Description     :
 **/

public class TestArraySortUsingJavaUtil {

    public static void main(String[] args) {
        // Defining an array of integer type
        int[] array = new int[]{90, 23, 5, 109, 12, 22, 67, 34};

        // Invoking sort() method of the Arrays class
        Arrays.sort(array);

        System.out.println("Elements of array sorted in ascending order: ");

        // Prints array using the for loop
        for (int j : array) {
            System.out.println(j);
        }
    }
}
