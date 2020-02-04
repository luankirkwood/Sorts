package com.company.java;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {


        int[] numbers = {4, 2, 1, 3, 11, 45, 7, 98, 76, -3, -21};

        for (int i = 0; i < numbers.length; i++) {
            int index = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index])
                    index = j;

            }

            //move j to the front
            int fakeNumber = numbers[index]; //numbers[i+1] = 2
            numbers[index] = numbers[i]; // change number at position i (i = 0, change 4 to 2)
            numbers[i] = fakeNumber;//change number at position j (i = 1, change 2 to 4)

        }

        System.out.println(Arrays.toString(numbers));
    }

}