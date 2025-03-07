package com.example.sorting.sorters;

import java.util.Arrays;

public class RadixSort implements SortingAlgorithm {

    @Override
    public int[] sort(int[] array) {
        // Find the maximum number to know the number of digits
        int max = Arrays.stream(array).max().getAsInt();

        // Do counting sort for every digit. Note that instead
        // of passing the digit number, exp is passed. exp is 10^i
        // where i is the current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
        return array;
    }

    private void countingSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n]; // output array
        int[] count = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] now contains actual
        // position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        // Copy the output array to array[], so that array[] now
        // contains sorted numbers according to the current digit
        System.arraycopy(output, 0, array, 0, n);
    }
}
