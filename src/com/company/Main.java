package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 1, 11, 3, 4, 2, 6, 7, 8, 2, 6, 10, 2};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Input value you want delete: ");
        int delValue = input.nextInt();
        delArray(delValue, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int getIndex(int value, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void delArray(int value, int[] array) {
        int index = getIndex(value, array);
        while (index != -1) {
            for (int i = index; i < array.length; i++) {
                if (i != array.length - 1) array[i] = array[i + 1];
                else array[array.length - 1] = 0;
            }
            index = getIndex(value, array);
        }
    }
}
