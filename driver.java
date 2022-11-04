// Colton Parham: CDP210001 - Project 2, driver.java
// CS 3345.505, Dr. Zhao
// Driver file to run all of the tests against each other 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class driver{
  public static void main(String args[]) throws FileNotFoundException
  {
    // List of Values to be tested
    Scanner input = new Scanner(System.in);
    // input prompt 
    System.out.print("Please select a test to start from: \n 1. 25k Randomly Sorted Elements\n 2. 50k Randomly Sorted Elements\n 3. 100k Randomly Sorted Elements\n 4. 1 Million Randomly Sorted Elements\n 5. Almost Sorted Array 500 elements\n Enter Choice here: ");
    // add input list here with specifications for partially sorted, completely unsorted, small array, medium array, and LARGE array 5k+ elements
    int choice = input.nextInt();
    // closing input 
    input.close();
    // random object to be used.
    Random rd = new Random();
    switch(choice)
    {

      // Case 1: Small Array: Randomly Generated Values - Completely Unsorted (25k units)
      // Merge Sort First, then Quick Sort 
      case 1: 
        // very small array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long endTime1, elapsed1, endTime1Q, elapsed1Q;
        long startTime1 = System.currentTimeMillis();
        // generating array of 25k random elements

        // val to apply to the array size 
        int val = 25000;
        Comparable arr1Random[] = new Comparable[val];
        for (int i = 0; i < arr1Random.length; i++)
       {
          // running the random values into the array. 
          arr1Random[i] = rd.nextInt();
       }

       // applying the random full array here, so the mergesort does not have an immediate advantage.
       Comparable arr1[] = arr1Random;

       // array for the Quick Sort
       Comparable arr1Q[] = new Comparable[arr1.length];
       // copying array
       for (int k = 0; k < arr1.length; k++)
       {
        arr1Q[k] = arr1[k];
       }
        // object creation for the object 
       mergeSort ob1 = new mergeSort(); 
        // function call for the sort 
        ob1.sort(arr1, 0, arr1.length - 1); 
        System.out.println("\nMerge Sorted Array: ");
        // calculation for time it takes to run.
        endTime1 = System.currentTimeMillis();
        elapsed1 = endTime1 - startTime1;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed1 * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Small Array: 25,000 Elements, Randomly Assorted, and Randomly Generated Values");
        
       // QuickSort Portion
      // object creation for quicksort.
       quickSort obQ1 = new quickSort();
       // Startime being defined with Q to differentiate and be as accurate as possible
       long startTime1Q = System.currentTimeMillis();
       // Object Creation for quicksort
       obQ1.quickSort(arr1Q);
       System.out.println("\nQuick Sorted Array: ");
       // grabbing end time
       endTime1Q = System.currentTimeMillis();
       elapsed1Q = endTime1Q - startTime1Q;
       // Message with Details 
       System.out.print("Took " + elapsed1Q * 0.001 + " Seconds to run and sort through the Array\n");
       System.out.println("Small Array: 25,000 Elements, Randomly Assorted, and Randomly Generated Values");
      break;

      case 2:
               // very small array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long endTime2, elapsed2, endTime2Q, elapsed2Q;
        long startTime2 = System.currentTimeMillis();

        // val to apply to the array size 
        int val2 = 50000;
        Comparable arr2Random[] = new Comparable[val2];
        for (int i = 0; i < arr2Random.length; i++)
       {
          // running the random values into the array. 
          arr2Random[i] = rd.nextInt();
       }

       // applying the random full array here, so the mergesort does not have an immediate advantage.
       Comparable arr2[] = arr2Random;

       // array for the Quick Sort
       Comparable arr2Q[] = new Comparable[arr2.length];
       // copying array
       for (int k = 0; k < arr2.length; k++)
       {
        arr2Q[k] = arr2[k];
       }
        // object creation for the object 
       mergeSort ob2 = new mergeSort(); 
        // function call for the sort 
        ob2.sort(arr2, 0, arr2.length - 1); 
        System.out.println("\nMerge Sorted Array: ");
        // calculation for time it takes to run.
        endTime2 = System.currentTimeMillis();
        elapsed2 = endTime2 - startTime2;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed2 * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Medium Array: 50,000 Elements, Randomly Assorted, and Randomly Generated Values");
        
       // QuickSort Portion
      // object creation for quicksort.
       quickSort obQ2 = new quickSort();
       // Startime being defined with Q to differentiate and be as accurate as possible
       long startTime2Q = System.currentTimeMillis();
       // Object Creation for quicksort
       obQ2.quickSort(arr2Q);
       System.out.println("\nQuick Sorted Array: ");
       // grabbing end time
       endTime2Q = System.currentTimeMillis();
       elapsed2Q = endTime2Q - startTime2Q;
       // Message with Details 
       System.out.print("Took " + elapsed2Q * 0.001 + " Seconds to run and sort through the Array\n");
       System.out.println("Medium Array: 50,000 Elements, Randomly Assorted, and Randomly Generated Values");
      break;
      // Large Array
      case 3:
        // having the start time start within the actual case, for most accurate timing.
        long endTime3, elapsed3, endTime3Q, elapsed3Q;
        long startTime3 = System.currentTimeMillis();

        // val to apply to the array size 
        int val3 = 100000;
        Comparable arr3Random[] = new Comparable[val3];
        for (int i = 0; i < arr3Random.length; i++)
       {
          // running the random values into the array. 
          arr3Random[i] = rd.nextInt();
       }

       // applying the random full array here, so the mergesort does not have an immediate advantage.
       Comparable arr3[] = arr3Random;

       // array for the Quick Sort
       Comparable arr3Q[] = new Comparable[arr3.length];
       // copying array
       for (int k = 0; k < arr3.length; k++)
       {
        arr3Q[k] = arr3[k];
       }
        // object creation for the object 
       mergeSort ob3 = new mergeSort(); 
        // function call for the sort 
        ob3.sort(arr3, 0, arr3.length - 1); 
        System.out.println("\nMerge Sorted Array: ");
        // calculation for time it takes to run.
        endTime3 = System.currentTimeMillis();
        elapsed3 = endTime3- startTime3;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed3 * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Large Array: 100,000 Elements, Randomly Assorted, and Randomly Generated Values");
        
       // QuickSort Portion
      // object creation for quicksort.
       quickSort obQ3 = new quickSort();
       // Startime being defined with Q to differentiate and be as accurate as possible
       long startTime3Q = System.currentTimeMillis();
       // Object Creation for quicksort
       obQ3.quickSort(arr3Q);
       System.out.println("\nQuick Sorted Array: ");
       // grabbing end time
       endTime3Q = System.currentTimeMillis();
       elapsed3Q = endTime3Q - startTime3Q;
       // Message with Details 
       System.out.print("Took " + elapsed3Q * 0.001 + " Seconds to run and sort through the Array\n");
       System.out.println("Large Array: 100,000 Elements, Randomly Assorted, and Randomly Generated Values");
      break;
      // Extra large 
      case 4: 
              // having the start time start within the actual case, for most accurate timing.
        long endTime4, elapsed4, endTime4Q, elapsed4Q;
        long startTime4 = System.currentTimeMillis();

        // val to apply to the array size 
        int val4 = 1000000;
        Comparable arr4Random[] = new Comparable[val4];
        for (int i = 0; i < arr4Random.length; i++)
       {
          // running the random values into the array. 
          arr4Random[i] = rd.nextInt();
       }

       // applying the random full array here, so the mergesort does not have an immediate advantage.
       Comparable arr4[] = arr4Random;

       // array for the Quick Sort
       Comparable arr4Q[] = new Comparable[arr4.length];
       // copying array
       for (int k = 0; k < arr4.length; k++)
       {
        arr4Q[k] = arr4[k];
       }
        // object creation for the object 
       mergeSort ob4 = new mergeSort(); 
        // function call for the sort 
        ob4.sort(arr4, 0, arr4.length - 1); 
        System.out.println("\nMerge Sorted Array: ");
        // calculation for time it takes to run.
        endTime4 = System.currentTimeMillis();
        elapsed4 = endTime4 - startTime4;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed4 * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Extra Large Array: 1,000,000 Elements, Randomly Assorted, and Randomly Generated Values");
        
       // QuickSort Portion
      // object creation for quicksort.
       quickSort obQ4 = new quickSort();
       // Startime being defined with Q to differentiate and be as accurate as possible
       long startTime4Q = System.currentTimeMillis();
       // Object Creation for quicksort
       obQ4.quickSort(arr4Q);
       System.out.println("\nQuick Sorted Array: ");
       // grabbing end time
       endTime4Q = System.currentTimeMillis();
       elapsed4Q = endTime4Q - startTime4Q;
       // Message with Details 
       System.out.print("Took " + elapsed4Q * 0.001 + " Seconds to run and sort through the Array\n");
       System.out.println("Extra Large Array: 1,000,000 Elements, Randomly Assorted, and Randomly Generated Values");
      break;

    
  }
}

// print function for printing out the arrays - not used often.
  private static void print(Comparable[] arr1) {
    int n = arr1.length;
    for (int i = 0; i < n; ++i)
    {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
  }

}
