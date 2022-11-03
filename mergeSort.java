// Colton Parham: CDP210001 - Project 2, mergeSort.java
// CS 3345.505, Dr. Zhao

// scanner for input tests, as well as the random, for the random values to be produced inside of the arrays.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

class mergeSort {
   // merge the first two subarr's
  // Subarray (or first array connected) = arr[l->m]
  // Subarray (or second array connected) = arr[m+1->r]
  void merge(int arr[], int left,int m, int right)
  {
    // size of subarr
    int n1 = m - left + 1;
    int n2 = right - m;

    // setting up the left and right of the arr.
    int L[] = new int[n1];
    int R[] = new int[n2];

    // copying data 
    for (int i = 0; i < n1; ++i)
    {
      L[i] = arr[left + i];
    }
    for (int j = 0; j < n2; ++j)
    {
      R[j] = arr[m + 1 + j];
    }

    // merging temp arrs 
    // setting initial index of merged sub arr
    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2)
    {
      if (L[i] <= R[j])
      {
        arr[k] = L[i];
        i++;
      }
      else 
      {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    // copying remaining items from L list
    while (i < n1)
    {
      arr[k] = L[i];
      i++;
      k++;
    }
    // copying remaining items from R list
    while (j < n2)
    {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  // actually sorting 
  void sort(int arr[], int left, int right)
  {
    if (left < right)
    {
      // middle point calculation
      int m = left + (right - left) / 2;
      // sorting the first and second halves. - recurs on self.
      sort(arr, left, m);
      sort(arr, m + 1, right);
      // merging the sorted halves at the end of the function
      merge(arr, left, m , right);
    }
  }

  public static void main(String args[]) throws FileNotFoundException
  {
    // List of Values to be tested
    Scanner input = new Scanner(System.in);
    // input prompt 
    System.out.print("Please select a test to run: ");
    // add input list here with specifications for partially sorted, completely unsorted, small array, medium array, and LARGE array 5k+ elements
    int choice = input.nextInt();
    // closing input 
    input.close();
    
    // random object to be used.
    Random rd = new Random();
    long endTime, elapsed;
    switch(choice)
    {

      // Case 1: Extra Small Array: Randomly Generated Values - Completely Unsorted (25k units)
      case 1: 
        // very small array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long startTime1 = System.currentTimeMillis();
        // generating array of 25k random elements
        
        int arr1[] = new int[25000];
        for (int i = 0; i < arr1.length; i++)
       {
          // running the random values into the array. 
          arr1[i] = rd.nextInt();
       }
    
        // object creation for the object 
       mergeSort ob1 = new mergeSort(); 
      
        // function call for the sort 
        ob1.sort(arr1, 0, arr1.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime1;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Extra Small Array: 25,000 Elements(In range from 1-25,000), Randomly Assorted, and Randomly Generated Values");
      break;

      // Case 2: Small Array: Randomly Generated Values - Completely Unsorted (50k units)
      case 2:
       // small array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long startTime2 = System.currentTimeMillis();
        // generating array of 50k random elements
        int arr2[] = new int[50000];
        for (int i = 0; i < arr2.length; i++)
       {
          // running the random values into the array. 
          arr2[i] = rd.nextInt();
       }
    
        // object creation for the object 
       mergeSort ob2 = new mergeSort(); 
      
        // function call for the sort 
        ob2.sort(arr2, 0, arr2.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime2;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Small Array: 50,000 Elements(In range from 1-50,000), Randomly Assorted, and Randomly Generated Values");
      break;

      // Case 3: Medium Small Array: Randomly Generated Values - Completely Unsorted (100k units)
      case 3:
        // medium small array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long startTime3 = System.currentTimeMillis();
        // generating array of 100k random elements
        int arr3[] = new int[100000];
        for (int i = 0; i < arr3.length; i++)
       {
          // running the random values into the array. 
          arr3[i] = rd.nextInt();
       }
    
        // object creation for the object 
       mergeSort ob3 = new mergeSort(); 
      
        // function call for the sort 
        ob3.sort(arr3, 0, arr3.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime3;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Medium Small Array: 100,000 Elements(In range from 1-100,000), Randomly Assorted, and Randomly Generated Values");
      break;

      // Case 4: Medium Array: Randomly Generated Values - Completely Unsorted (200k units)
      case 4:
        // medium array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long startTime4 = System.currentTimeMillis();
        // generating array of 200k random elements
        int arr4[] = new int[200000];
        for (int i = 0; i < arr4.length; i++)
       {
          // running the random values into the array. 
          arr4[i] = rd.nextInt();
       }
    
        // object creation for the object 
       mergeSort ob4 = new mergeSort(); 
      
        // function call for the sort 
        ob4.sort(arr4, 0, arr4.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime4;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Medium Array: 200,000 Elements(In range from 1-200,000), Randomly Assorted, and Randomly Generated Values");
      break;
      
      // Case 5: Large Array: Randomly Generated Values - Completely Unsorted (500k units)
      case 5:
       // Large array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long startTime5 = System.currentTimeMillis();
        // generating array of 500k random elements
        int arr5[] = new int[500000];
        for (int i = 0; i < arr5.length; i++)
       {
          // running the random values into the array. 
          arr5[i] = rd.nextInt();
       }
    
        // object creation for the object 
       mergeSort ob5 = new mergeSort(); 
      
        // function call for the sort 
        ob5.sort(arr5, 0, arr5.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime5;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Large Array: 500,000 Elements(In range from 1-500,000), Randomly Assorted, and Randomly Generated Values");
      break;
      
      //Case 6: Extra Large Array: Randomly Generated Values - Completely Unsorted (1M units)
      case 6:
             // Large array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long startTime6 = System.currentTimeMillis();
        // generating array of 1M random elements
        int arr6[] = new int[1000000];
        for (int i = 0; i < arr6.length; i++)
       {
          // running the random values into the array. 
          arr6[i] = rd.nextInt();
       }
    
        // object creation for the object 
       mergeSort ob6 = new mergeSort(); 
      
        // function call for the sort 
        ob6.sort(arr6, 0, arr6.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime6;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Extra Large Array: 1,000,000 Elements(In range from 1-1,000,000), Randomly Assorted, and Randomly Generated Values");
      break;
      // Case 7: <FILE>Extra Extra Large Array: Hard-Code Defined Values - Completely Unsorted, and values generated from website, and will be the same across (10M Units)
      case 7:
      // Large array - random assortion
      // having the start time start within the actual case, for most accurate timing.
      long startTime7 = System.currentTimeMillis();
      // generating array of 100k random elements
      Scanner scanner = new Scanner(new File("arr1alt.txt"));
      int arr7[] = new int[10000000];
      int j = 0;
      while(scanner.hasNextInt())
      {
        arr7[j++] = scanner.nextInt();
      }

      // object creation for the object 
      mergeSort ob7 = new mergeSort(); 

      // function call for the sort 
      ob7.sort(arr7, 0, arr7.length - 1); 
      System.out.println("\nMerge Sorted Array: ");

      // calculation for time it takes to run.
      endTime = System.currentTimeMillis();
      elapsed = endTime - startTime7;
      // Displays the Time it took to run/sort the array
      System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
      System.out.println("Extra Extra Large Array: 10,000,000 Elements(In range from 1-10,000,000), Randomly Assorted, and Randomly Generated Values, from txt file");
      break;

      // Case 8: Super Extra Large Array: Randomly Generated Values - Completely Unsorted (200M units)
      case 8:
      // Super Extra Large Array - 200 M elements
        // having the start time start within the actual case, for most accurate timing.
        long startTime8 = System.currentTimeMillis();
       
        int arr8[] = new int[200000000];
        for (int i = 0; i < arr8.length; i++)
       {
          // running the random values into the array. 
          arr8[i] = rd.nextInt();
       }
    
        // object creation for the object 
       mergeSort ob8 = new mergeSort(); 
      
        // function call for the sort 
        ob8.sort(arr8, 0, arr8.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime8;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Super Extra Large Array: 200,000,000 Elements(In range from 1-200,000,000), Randomly Assorted, and Randomly Generated Values");
        break;
    
    // Case 9 : Almost Sorted Large Array: Array is predefined, presorted (500k units)
    case 9:
    // Randomly Defined Array
      // having the start time start within the actual case, for most accurate timing.
      long startTime9 = System.currentTimeMillis();
     
      // defining array size
      int arr9[] = new int[500000];
      arr9[0] = (int)(Math.random()*10) + 1;
      for (int a = 1; a < arr9.length;a++)
      {
        arr9[a] = arr9[a-1] + (int)(Math.random() * 12) - 2;
      }

      // object creation for the object 
     mergeSort ob9 = new mergeSort(); 
    
      // function call for the sort 
      ob9.sort(arr9, 0, arr9.length - 1); 
      System.out.println("\nMerge Sorted Array: ");

      // calculation for time it takes to run.
      endTime = System.currentTimeMillis();
      elapsed = endTime - startTime9;
      // Displays the Time it took to run/sort the array
      System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
      System.out.println("Almost Sorted Large Array: 500,000 Elements(In range from 1-500,000), Randomly Assorted, and Randomly Generated Values");
      break;
  }

    
  }
}
