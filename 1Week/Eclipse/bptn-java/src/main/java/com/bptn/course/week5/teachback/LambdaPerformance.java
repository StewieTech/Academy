package com.bptn.course.week5.teachback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaPerformance {
    public static void main(String[] args) {
        List<String> clothes = new ArrayList<>();
        IntStream.range(0, 1000000).forEach(i -> clothes.add("clothes item: " + i));

        long startSequential = System.currentTimeMillis();
        clothes.stream()
                .filter(item -> !isDarkColor(item))
                .forEach(item -> System.out.println(item));
        long endSequential = System.currentTimeMillis();
        String resultSequential = ("Sequential processing time: " + (endSequential - startSequential) + " ms");

        long startParallel = System.currentTimeMillis();
        clothes.parallelStream()
                .filter(item -> !isDarkColor(item))
                .forEach(item -> System.out.println(item));
        long endParallel = System.currentTimeMillis();
        System.out.println("Parallel processing time: " + (endParallel - startParallel) + " ms");
        System.out.println(resultSequential);
    }

    public static boolean isDarkColor(String item) {
        return item.contains("black") || item.contains("navy");
    }
}

