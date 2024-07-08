
package com.bptn.course.week5.teachback;

import java.util.List ;
import java.util.Arrays ;
import java.util.ArrayList ;
import java.util.function.Predicate;


public class SummerWardrobe {
    public static void main(String[] args) {
        List<String> clothes = Arrays.asList("green gym shorts", "blue jeans", "black t-shirt", "white dress-shirt", "dark navy jacket");
        noLambdaOrganizeSummerWardrobe(clothes);
        withLambdaOrganizeSummerWardrobe(clothes);

//        List<String> shoesList = Arrays.asList("green shoes", "blue shoes", "black shoes", "white shoes", "dark navy shoes");
//        noLambdaOrganizeSummerWardrobe(shoesList);
//        withLambdaOrganizeSummerWardrobe(shoesList);
    }

    public static void noLambdaOrganizeSummerWardrobe(List<String> clothes) {
        System.out.println(" Traditional OOP (No Lambda): ");
        List<String> lightClothes = new ArrayList<>();
        for (String item : clothes) {
            if (!isDarkColor(item)) {
                lightClothes.add(item);
            }
        }

        for (String item : lightClothes) {
            System.out.println(item);
        }
    }

//    public static void withLambdaOrganizeSummerWardrobe(List<String> clothes) {
//        clothes.stream()
//                .filter(element -> !isDarkColor(element))
//                .forEach(item -> System.out.println(item));
//    }
//
//

    public static void withLambdaOrganizeSummerWardrobe(List<String> clothes) {
        System.out.println("\n With Lambda: ");
        clothes.stream()
                .filter(isLightColor())
                .forEach(item -> System.out.println(item));
    }

    public static boolean isDarkColor(String item) {
        return item.contains("black") || item.contains("navy");
    }

    public static Predicate<String> isLightColor() {
        return item -> !isDarkColor(item);
    }
}

