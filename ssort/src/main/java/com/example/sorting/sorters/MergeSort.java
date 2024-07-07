package com.example.sorting.sorters;

import com.example.sorting.sorters.SortingAlgorithm;

public class MergeSort implements SortingAlgorithm {

    @Override
    public int[] sort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            // Split left part
            int[] left = new int[mid];
            System.arraycopy(array, 0, left, 0, mid);

            // Split right part
            int[] right = new int[array.length - mid];
            System.arraycopy(array, mid, right, 0, array.length - mid);

            sort(left);
            sort(right);

            merge(array, left, right);
        }
        return array;
    }

    private void merge(int[] array, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

        // Merge while there are elements in both left and right
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                array[mergedIndex++] = left[leftIndex++];
            } else {
                array[mergedIndex++] = right[rightIndex++];
            }
        }

        // Collect remaining elements from left, if any
        while (leftIndex < left.length) {
            array[mergedIndex++] = left[leftIndex++];
        }

        // Collect remaining elements from right, if any
        while (rightIndex < right.length) {
            array[mergedIndex++] = right[rightIndex++];
        }
    }
}
