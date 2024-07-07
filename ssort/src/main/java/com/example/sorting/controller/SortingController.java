// com/example/sorting/controller/SortingController.java
package com.example.sorting.controller;


import com.example.sorting.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.regex.Pattern;

@Controller
public class SortingController {

    @Autowired
    private SortingService sortingService;

    private static final Pattern VALID_INPUT_PATTERN = Pattern.compile("^[0-9\\s,]+$");

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String sort(@RequestParam("algorithm") String algorithm,
                       @RequestParam("arrayValues") String arrayValues,
                       Model model) {
        if (!VALID_INPUT_PATTERN.matcher(arrayValues).matches()) {
            model.addAttribute("errorMessage", "Invalid format, arrays should be numbers.");
            return "index"; // Return to the index page with an error message
        }

        String[] arrayStr = arrayValues.split("\\s*,\\s*|\\s+");

        long startTime = System.nanoTime();
        int[] array = new int[arrayStr.length];
        try {
            for (int i = 0; i < arrayStr.length; i++) {
                array[i] = Integer.parseInt(arrayStr[i]);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "Invalid format, arrays should be numbers.");
            return "index"; // Return to the index page with an error message
        }
        int[] sortedArray = sortingService.sort(algorithm, array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        model.addAttribute("sortedArray", Arrays.toString(sortedArray));
        model.addAttribute("algorithm", algorithm);
        model.addAttribute("arrayValues", Arrays.toString(arrayStr));
        model.addAttribute("duration", duration);
        return "sort";
    }
}
