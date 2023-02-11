package com.example.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

  // swap elements in array
  public static void swap(ArrayList<Integer> arr, int a, int b) {
    int temp = arr.get(a);
    arr.set(a, arr.get(b));
    arr.set(b, temp);
  }

  public static boolean compare(int a, int b) {
    return a > b;
  }

  public static void sortArray(ArrayList<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.size() - i - 1; j++) {
        if (compare(arr.get(j), arr.get(j + 1))) {
          swap(arr, j, j + 1);
        }
      }
      System.out.println("Swap: " + arr.toString());
    }
  }
}