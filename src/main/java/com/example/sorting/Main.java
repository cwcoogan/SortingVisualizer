package com.example.sorting;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> arr = CreateArray.createArray(20, 50);
    BubbleSort.sortArray(arr);
    System.out.println(arr.toString());
    ArrayList<Integer> arr2 = CreateArray.createArray(20, 100);
    BubbleSort.sortArray(arr2);
    System.out.println(arr2.toString());
    ArrayList<Integer> arr3 = CreateArray.createArray(20, 2);
    BubbleSort.sortArray(arr3);
    System.out.println(arr3.toString());
  }
}