package com.example.sorting;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CreateArray {

  public static int getArrayMax() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How big of an array do you want? ");
    return scanner.nextInt();
  }

  public static ArrayList<Integer> createArray(int arrayMax, int maxNum) {
    ArrayList<Integer> arr = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < arrayMax; i++) {
      int randomNumber = random.nextInt(maxNum);
      arr.add(randomNumber);
    }
    return arr;
  }

  public static void printArray(ArrayList<Integer> arr) {
    System.out.print(arr);
  }
}
