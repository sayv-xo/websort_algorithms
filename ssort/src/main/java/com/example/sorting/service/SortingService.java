// com/example/sorting/service/SortingService.java
package com.example.sorting.service;

import com.example.sorting.sorters.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortingService {

    private SortingAlgorithm heapSort;
    private SortingAlgorithm quickSort;
    private SortingAlgorithm mergeSort;
    private SortingAlgorithm radixSort;
    private SortingAlgorithm bucketSort;

    @Autowired
    public void setHeapSort(SortingAlgorithm heapSort) {
        this.heapSort = heapSort;
    }

    @Autowired
    public void setQuickSort(SortingAlgorithm quickSort) {
        this.quickSort = quickSort;
    }

    @Autowired
    public void setMergeSort(SortingAlgorithm mergeSort) {
        this.mergeSort = mergeSort;
    }

    @Autowired
    public void setRadixSort(SortingAlgorithm radixSort) {
        this.radixSort = radixSort;
    }

    @Autowired
    public void setBucketSort(SortingAlgorithm bucketSort) {
        this.bucketSort = bucketSort;
    }

    public int[] sort(String algorithm, int[] array) {
        switch (algorithm.toLowerCase()) {
            case "heap":
                return heapSort.sort(array);
            case "quick":
                return quickSort.sort(array);
            case "merge":
                return mergeSort.sort(array);
            case "radix":
                return radixSort.sort(array);
            case "bucket":
                return bucketSort.sort(array);
            default:
                throw new IllegalArgumentException("Invalid sorting algorithm: " + algorithm);
        }
    }
}
