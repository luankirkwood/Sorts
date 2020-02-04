package com.company.java;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);

        int initialArraySize = numbers.size();

        List<Integer> newListOfNumbers = new ArrayList<>();

        newListOfNumbers.add(numbers.get(0));
        numbers.remove(0);

        for (int i = 0; i < initialArraySize-1; i++){

            int numberToMove = numbers.get(0);
//            int lastNumberOfSortedNumbersList = newListOfNumbers.get(newListOfNumbers.size()-1);

            newListOfNumbers.add(numberToMove);
            numbers.remove(0);

            if (numberToMove < newListOfNumbers.get(newListOfNumbers.size()-2)){
                while (newListOfNumbers.indexOf(numberToMove) != 0 && numberToMove < newListOfNumbers.get(newListOfNumbers.indexOf(numberToMove)-1)){

                    int indexOfNumberToMove = newListOfNumbers.indexOf(numberToMove);
                    int indexOfPreviousNumber = newListOfNumbers.indexOf(numberToMove)-1;
                    int previousNumber = newListOfNumbers.get(indexOfPreviousNumber);

                    newListOfNumbers.set(indexOfPreviousNumber,numberToMove);
                    newListOfNumbers.set(indexOfNumberToMove,previousNumber);
                }
            }
        }

        System.out.println(newListOfNumbers.toString());
    }
}