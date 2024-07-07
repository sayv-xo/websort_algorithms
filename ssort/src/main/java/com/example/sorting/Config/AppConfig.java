// com/example/sorting/Config/AppConfig.java
package com.example.sorting.Config;

import com.example.sorting.*;
import com.example.sorting.service.SortingService;
import com.example.sorting.sorters.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.sorting")
public class AppConfig {

    @Bean
    public SortingAlgorithm heapSort() {
        return new HeapSort();
    }

    @Bean
    public SortingAlgorithm quickSort() {
        return new QuickSort();
    }

    @Bean
    public SortingAlgorithm mergeSort() {
        return new MergeSort();
    }

    @Bean
    public SortingAlgorithm radixSort() {
        return new RadixSort();
    }

    @Bean
    public SortingAlgorithm bucketSort() {
        return new BucketSort();
    }

    @Bean
    public SortingService sortingService() {
        SortingService sortingService = new SortingService();
        sortingService.setHeapSort(heapSort());
        sortingService.setQuickSort(quickSort());
        sortingService.setMergeSort(mergeSort());
        sortingService.setRadixSort(radixSort());
        sortingService.setBucketSort(bucketSort());
        return sortingService;
    }
}
