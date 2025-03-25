package com.ggjiuw;

public class Main {
    public static void main(String[] args) {
        MinLengthFilter minLengthFilter = new MinLengthFilter(5);
        MaxLengthFilter maxLengthFilter = new MaxLengthFilter(15);

        System.out.println("\n=== MinLengthFilter(5) ===");
        String input = "Hi";
        String result = minLengthFilter.handle(input);
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);

        System.out.println("\n=== 5+ characters ===");
        input = "5+ chars";
        result = minLengthFilter.handle(input);
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);

        System.out.println("\n=== MaxLengthFilter(15) ===");
        input = "maxLengthFilter";
        result = maxLengthFilter.handle(input);
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);

        System.out.println("\n=== 15+ characters ===");
        input = "abcdefghijklmnopqrstuvwxyz";
        result = maxLengthFilter.handle(input);
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);
    }
}