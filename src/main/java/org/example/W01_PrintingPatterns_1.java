package org.example;

public class W01_PrintingPatterns_1 {
    public static void printingTrianglePattern1(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
           for(int j = 1; j <= i; j++) {
               count++;
               System.out.print(count +" ");
            }
            System.out.println();
        }
    }

    public static void printPascalTriangle(int n){
        for(int i = 0; i <= n; i++){
            int currentValue = 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (i - j) / j ;
            }
            System.out.println();
        }

        /*opt2 with matrix
        int[][] matrix = new int[100][100];
         */
    }


    public static void main(String[] args){
        //printingTrianglePattern1(5);
        printPascalTriangle(6);
    }
}
