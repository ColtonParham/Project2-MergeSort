

// scanner for input tests, as well as the random, for the random values to be produced inside of the arrays.
import java.util.Random;
import java.util.Scanner;

class mergeSortExecute {
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

  public static void main(String args[])
  {
    // still need to add a lis of options for what to choose, like 2M from file, hardcoded, as well as randomly generated values 
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
    
        // object creation for the first object 
       mergeSortExecute ob1 = new mergeSortExecute(); 
      
        // function call for the sort 
        ob1.sort(arr1, 0, arr1.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime1;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Extra Small Array: 25,000 Elements, Randomly Assorted, and Randomly Generated Values");
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
    
        // object creation for the second object 
       mergeSortExecute ob2 = new mergeSortExecute(); 
      
        // function call for the sort 
        ob2.sort(arr2, 0, arr2.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime2;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Small Array: 50,000 Elements, Randomly Assorted, and Randomly Generated Values");
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
    
        // object creation for the second object 
       mergeSortExecute ob3 = new mergeSortExecute(); 
      
        // function call for the sort 
        ob3.sort(arr3, 0, arr3.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime3;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Medium Small Array: 100,000 Elements, Randomly Assorted, and Randomly Generated Values");
      break;

      // Case 4: Medium Array: Randomly Generated Values - Completely Unsorted (200k units)
      case 4:
        // medium array - random assortion
        // having the start time start within the actual case, for most accurate timing.
        long startTime4 = System.currentTimeMillis();
        // generating array of 100k random elements
        int arr4[] = new int[200000];
        for (int i = 0; i < arr4.length; i++)
       {
          // running the random values into the array. 
          arr4[i] = rd.nextInt();
       }
    
        // object creation for the second object 
       mergeSortExecute ob4 = new mergeSortExecute(); 
      
        // function call for the sort 
        ob4.sort(arr4, 0, arr4.length - 1); 
        System.out.println("\nMerge Sorted Array: ");

        // calculation for time it takes to run.
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime4;
        // Displays the Time it took to run/sort the array
        System.out.print("Took " + elapsed * 0.001 + " Seconds to run and sort through the Array\n");
        System.out.println("Medium Array: 200,000 Elements, Randomly Assorted, and Randomly Generated Values");
      break;

      
    }

    
  }
}
