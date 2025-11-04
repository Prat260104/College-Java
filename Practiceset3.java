package Streams;

import java.util.*;
import java.util.stream.*;

public class Practiceset3 {




    public static void main(String[] args) {
        
        // Q1. Print Even Numbers
        List<Integer> numbers1 = Arrays.asList(3, 8, 12, 5, 7, 10, 15);
        List<Integer> evenNumbers = numbers1.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        for (Integer n : evenNumbers) {
            System.out.println(n);
        }

        System.out.println();

        // Q2. Square and Filter
        List<Integer> numbers2 = Arrays.asList(4, 6, 8, 3, 10);
        List<Integer> squaredFiltered = numbers2.stream()
                                                .map(n -> n * n)
                                                .filter(n -> n > 50)
                                                .collect(Collectors.toList());
        for (Integer n : squaredFiltered) {
            System.out.println(n);
        }

        System.out.println();

        // Q3. Names Starting with ‘A’
        List<String> names = Arrays.asList("Amit", "Rahul", "Anita", "Sneha", "Arjun");
        List<String> namesWithA = names.stream()
                                       .filter(name -> name.startsWith("A"))
                                       .collect(Collectors.toList());
        for (String name : namesWithA) {
            System.out.println(name);
        }

        System.out.println();

        // Q4. Find Maximum
        List<Integer> numbers3 = Arrays.asList(25, 78, 12, 56, 89, 45);
        Optional<Integer> maxNum = numbers3.stream().max(Integer::compareTo);
        if (maxNum.isPresent()) {
            System.out.println(maxNum.get());
        }

        System.out.println();

        // Q5. Convert to Uppercase and Sort
        List<String> fruits = Arrays.asList("banana", "apple", "mango", "cherry");
        List<String> upperSortedFruits = fruits.stream()
                                               .map(String::toUpperCase)
                                               .sorted()
                                               .collect(Collectors.toList());
        for (String fruit : upperSortedFruits) {
            System.out.println(fruit);
        }}}






