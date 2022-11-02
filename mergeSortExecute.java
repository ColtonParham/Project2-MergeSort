// actual code for the mergesort that will be used. 

// scanner for input tests...
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
      // merging the sorted halves
      merge(arr, left, m , right);
    }
  }

  // print out the array 
  static void printArray(int arr[])
  {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
    {
      // individual element printing //
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[])
  {
    // List of Values to be tested
    Scanner input = new Scanner(System.in);
    // input prompt 
    System.out.print("Please select a test to run: ");
    // add input list here with specifications for partially sorted, completely unsorted, small array, medium array, and LARGE array 5k+ elements
    int choice = input.nextInt();
    // closing input 
    input.close();
    
    // timing variables.
    long startTime = System.currentTimeMillis();
    long endTime, elapsed;
    switch(choice)
    {
      case 1: 
      // small array 
      int arr1[] = {1, 11, 16, 5, 6, 4};
      System.out.println("Initial Array: ");
      printArray(arr1);
  
      mergeSortExecute ob1 = new mergeSortExecute(); 
      // object creation to apply data to 
      ob1.sort(arr1, 0, arr1.length - 1); 
      System.out.println("\nMerge Sorted Array: ");
      printArray(arr1);
      endTime = System.currentTimeMillis();
      elapsed = endTime - startTime;
      System.out.println(elapsed * 0.001 + " Seconds\n");
      break;

      case 2:
      // medium array 
      int arr2[] = {1, 5, 3, 2, 12, 15, 8, 6, 1, 9, 29, 21, 17, 5, 14, 1, 8, 17, 6, 22, 25};
      System.out.println("Initial Array: ");
      printArray(arr2);
    
      mergeSortExecute ob2 = new mergeSortExecute(); 
      // object creation to apply data to 
      ob2.sort(arr2, 0, arr2.length - 1); 
      System.out.println("\nMerge Sorted Array: ");
      printArray(arr2);
      // calculation for time it takes to run.
      endTime = System.currentTimeMillis();
      elapsed = endTime - startTime;
      System.out.println(elapsed * 0.001 + " Seconds\n");
    }

    
  }
}
