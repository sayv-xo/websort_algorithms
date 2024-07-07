package com.example.sorting.sorters;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort implements SortingAlgorithm {

    @Override
    public int[] sort(int[] array) {
        if (array.length == 0) {
            return array;
        }

        // 1) Create n empty buckets
        int bucketCount = (int) Math.sqrt(array.length);
        ArrayList<Integer>[] buckets = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        // 2) Put array elements in different buckets
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        for (int value : array) {
            int bucketIndex = (int) ((float) value / max * (bucketCount - 1));
            buckets[bucketIndex].add(value);
        }

        // 3) Sort individual buckets
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // 4) Concatenate all buckets into array
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                array[index++] = value;
            }
        }

        return array;
    }
}
