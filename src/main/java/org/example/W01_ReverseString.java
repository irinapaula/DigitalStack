package org.example;

public class W01_ReverseString {

    public static void reverseString(char[] s){
        int start = 0;
        int end = s.length - 1;
        char temp;

        while(start <= end) {
            temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        char[] s1 = {'h','e','l','l','o'};
        char[] s2 = {'H','a','n','n','a','h'};

      //  System.out.println(reverseString(s1));
        // System.out.println(reverseString(s2));
    }
}
