package com.company.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

//        List<Integer> input = new ArrayList<>();
//
//        input.add(4);
//        input.add(1);
//        input.add(2);
//        input.add(5);
//        input.add(3);
//        input.add(7);
//        input.add(6);
//        input.add(8);
//
//        int initialArraySize = input.size();
//
//        int halfArraySize = initialArraySize/2;
//
//        int quaterArraySize = halfArraySize/2;
//
//        int eigthArraySize = quaterArraySize/2;
//
//        System.out.println("The size of the aray is " + initialArraySize + ". Half of this is " + halfArraySize);
//
//        List<Integer> firstHalfOfArray = new ArrayList<>(input.subList(0,halfArraySize));
//        List<Integer> secondHalfOfArray = new ArrayList<>(input.subList(halfArraySize,8));
//
//        //split the lists into pairs again
//
//        List<Integer> firstPairOfArray = new ArrayList<>(firstHalfOfArray.subList(0,quaterArraySize));
//        List<Integer> secondPairOfArray = new ArrayList<>(firstHalfOfArray.subList(quaterArraySize,halfArraySize));
//
//        List<Integer> thirdPairOfArray = new ArrayList<>(secondHalfOfArray.subList(0,quaterArraySize));
//        List<Integer> fourthPairOfArray = new ArrayList<>(secondHalfOfArray.subList(quaterArraySize,halfArraySize));

//        //split one final time
//
//        List<Integer> first = new ArrayList<>(firstPairOfArray.subList(0,eigthArraySize));
//        List<Integer> second = new ArrayList<>(firstPairOfArray.subList(eigthArraySize,quaterArraySize));
//        List<Integer> third = new ArrayList<>(secondPairOfArray.subList(0,eigthArraySize));
//        List<Integer> fourth = new ArrayList<>(secondPairOfArray.subList(eigthArraySize,quaterArraySize));
//        List<Integer> fifth = new ArrayList<>(thirdPairOfArray.subList(0,eigthArraySize));
//        List<Integer> sixth = new ArrayList<>(thirdPairOfArray.subList(eigthArraySize,quaterArraySize));
//        List<Integer> seventh = new ArrayList<>(fourthPairOfArray.subList(0,eigthArraySize));
//        List<Integer> eigth = new ArrayList<>(fourthPairOfArray.subList(eigthArraySize,quaterArraySize));
//
//        first.addAll(second);
//        third.addAll(fourth);
//        fifth.addAll(sixth);
//        seventh.addAll(eigth);
//
//        sortList(first);
//        sortList(third);
//        sortList(fifth);
//        sortList(seventh);

        Integer[] input = {4, 2, 1, 3, 11, 45, 7, -3};

        int arraySize = input.length;

        List<Integer> inputList = listNumbers(input);

        List<Integer> singleList = splitList(inputList);
//        ArrayList<ArrayList<Object>>sineList = (ArrayList<ArrayList<Object>>) split(inputList);

        List sortedList = sortList(singleList);

        System.out.println(singleList);
        System.out.println(sortedList);
    }

    private static List<Integer> sortList(List<Integer> integerList) {

        List<Integer> mergedNumbers = new ArrayList<>();
        int firstNumber;
        int nextNumber;

        for (int i = 0; i < integerList.size() - 1; i++) {
            firstNumber = integerList.get(i);
            nextNumber = integerList.get(i + 1);

            if (firstNumber > nextNumber) {
                int temp = firstNumber;
                firstNumber = nextNumber;
                nextNumber = temp;

                mergedNumbers.add(firstNumber);
                mergedNumbers.add(nextNumber);
            } else {
                mergedNumbers.add(firstNumber);
                mergedNumbers.add(nextNumber);
            }
        }
        return mergedNumbers;
    }

    private static List<Integer> listNumbers(Integer[] numbers) {

        List<Integer> allOfTheInputs = new ArrayList<>();
        Collections.addAll(allOfTheInputs, numbers);

        return allOfTheInputs;
    }

    private static List<Integer> splitList(List<Integer> list) {

        int arraySize = list.size();

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        for (int i = 0; i < arraySize / 2; i++) {

            leftList.add(list.get(i));
        }

        //need to store the newly created list every time
        //right now its overriding the past list and losing the memory of them

        int newArraySize = leftList.size() / 2;

        if (leftList.size() > 1) {

            for (int x = newArraySize; x < arraySize/2; x++) {

                rightList.add(leftList.get(x));
            }
            leftList.removeAll(rightList);
        }

        if (leftList.size() > 1) {
            splitList(leftList);
        }

        list = leftList;

        //split the array list into half and half again until the size of each list is 1
        //split and work with first half always
        //SPLIT UNTIL BASE CASE IS MET
        return leftList;
    }


//    private static List<ArrayList<Object>> split (List<Integer> list){
//
//        List<Integer> leftList = new ArrayList<>();
//        List<Integer> rightList = new ArrayList<>();
//        List<Integer> tempList = new ArrayList<>();
//        ArrayList<ArrayList<Object>> returnValue = new ArrayList<>();
//        int size = 8;
//
//        if(list.size() < 1){ //base case
//            return returnValue;
//        }
//
//        else {
//
//            for (int i = list.size() -1; 0 < list.size(); size--) {
//                returnValue.add(new ArrayList<>());
//            }
//
//                leftList = list.subList(0,(list.size()/2));
//                rightList = list.subList((list.size()/2),list.size());
//
//                tempList.addAll(list.subList(0,(list.size()/2)));
//        }
//
//        splitList(tempList);
//
//        return returnValue;
//    }
}