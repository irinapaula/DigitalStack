package org.example;

import java.util.ArrayList;
import java.util.List;

public class W01_FizzBuzz {

    public static void showFizzBuzz(int n){
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < n ; i++) {
            if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        System.out.println(answer);
    }
    public static void main(String[] args){
        showFizzBuzz(5);
    }
}
