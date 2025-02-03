//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Michael Watson
 */

 public class Main {
    public static void main(String[] args) {
      System.out.println("hello, world!");
  
      Lab1 lab = new Lab1();
      System.out.println(lab.increment(1));
  
      int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};
      
      // Output array in order using while loop
      int i = 0;
      while (i < numbers.length) {
        System.out.print(numbers[i] + " ");
        i++;
      }
      System.out.println();
  
      // Output array in reverse using for loop
      for (int j = numbers.length - 1; j >= 0; j--) {
        System.out.print(numbers[j] + " ");
      }
      System.out.println();
  
      // Output first and last values of the array
      System.out.println("First: " + numbers[0] + ", Last: " + numbers[numbers.length - 1]);
  
      // Call the methods from Lab1
      System.out.println("Max of 4 and 10: " + lab.max(4, 10));
      System.out.println("Min of 4 and 10: " + lab.min(4, 10));
      System.out.println("Sum of array: " + lab.sum(numbers));
      System.out.println("Average of array: " + lab.average(numbers));
      System.out.println("Max in array: " + lab.max(numbers));
      System.out.println("Min in array: " + lab.min(numbers));
    }
  }     
  
  // Add all of the methods here
  class Lab1 {
    public int increment(int num) {
      return ++num;
    }
    
    public int max(int a, int b) {
      if (a > b) return a;
      return b;
    }
  
    public int min(int a, int b) {
      if (a < b) return a;
      return b;
    }
  
    public int sum(int[] nums) {
      int total = 0;
      for (int num : nums) {
        total += num;
      }
      return total;
    }
  
    public int average(int[] nums) {
      int total = 0;
      for (int num : nums) {
        total += num;
      }
      return total / nums.length;
    }
  
    public int max(int[] nums) {
      int maxValue = nums[0];
      for (int i = 1; i < nums.length; i++) {
        if (nums[i] > maxValue) {
          maxValue = nums[i];
        }
      }
      return maxValue;
    }
  
    public int min(int[] nums) {
      int minValue = nums[0];
      for (int i = 1; i < nums.length; i++) {
        if (nums[i] < minValue) {
          minValue = nums[i];
        }
      }
      return minValue;
    }
  }