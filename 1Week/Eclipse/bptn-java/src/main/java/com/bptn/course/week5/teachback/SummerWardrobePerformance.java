package com.bptn.course.week5.teachback;


import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

public class SummerWardrobePerformance {


        public static void main(String[] args) {
            List<String> clothes = Arrays.asList("green gym shorts", "blue jeans", "black t-shirt", "white dress-shirt", "dark navy jacket");

            long sequentialTime = measureTime(() -> noLambdaOrganizeSummerWardrobe(clothes));
            long parallelTime = measureTime(() -> withLambdaOrganizeSummerWardrobe(clothes));

            System.out.println("\nParallel processing time: " + parallelTime + " ms");
            System.out.println("Sequential processing time: " + sequentialTime + " ms");
        }


        public static void noLambdaOrganizeSummerWardrobe(List<String> clothes) {
            for (int i = 0; i < clothes.size(); i++) {
                String item = clothes.get(i);
                for (int j = 0; j < 1_000_000; j++) {
                    System.out.println("Sequential item " + i + ": " + item);
                }
            }
        }

        public static void withLambdaOrganizeSummerWardrobe(List<String> clothes) {
            ForkJoinPool customThreadPool = new ForkJoinPool(8); // Example with 8 threads
            customThreadPool.submit(() ->
                    clothes.parallelStream()
                            .forEach(item -> {
                    String threadName = Thread.currentThread().getName();
                                for (int j = 0; j < 1_000_000; j++) {
                                    System.out.println("Parallel item: " + item + " (Thread: " + threadName + ")");
                                }
                            })
            ).join();
        }

        public static long measureTime(Runnable task) {
            long startTime = System.currentTimeMillis();
            task.run();
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }
    }

