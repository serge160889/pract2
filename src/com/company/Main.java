package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.print("");
        }
        System.out.println();
        System.out.println();

        int[][] array2=new int[3][4];
        array2[0][0]=3;
        array2[0][1]=6;
        array2[1][0]=8;
        array2[1][1]=9;
        array2[0][2]=7;
        array2[1][2]=4;
        array2[0][3]=15;
        array2[1][3]=5;
        array2[2][0]=4;
        array2[2][1]=6;
        array2[2][2]=0;
        array2[2][3]=11;

        for (int i=0; i< array2[0].length;i++) {
          for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[j][i]+" ");
            }
            System.out.println();
        }
    }
}