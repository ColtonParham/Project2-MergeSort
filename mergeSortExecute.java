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
      // small array - random assortion
      int arr1[] = {1, 11, 16, 5, 6, 4};
      System.out.println("Initial Array: ");
      printArray(arr1);
  
      mergeSortExecute ob1 = new mergeSortExecute(); 
      // object creation to apply data to 
      ob1.sort(arr1, 0, arr1.length - 1); 
      System.out.println("\nMerge Sorted Array: ");
      printArray(arr1);
      // takes into account the system time 
      endTime = System.currentTimeMillis();
      elapsed = endTime - startTime;
      // Print statements for the results, gives the element count and such
      System.out.println(elapsed * 0.001 + " Seconds\n");
      System.out.println("Extra Small Array: 6 Elements, Randomly Assorted");
      break;

      case 2:
      // small array - random assortion
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
      System.out.println("Small Array: 21 Elements, Randomly Assorted");
      break;

      case 3: 
      // medium array - random assortion - might need to just create a function or something to generate X amount of random values.
      int arr3[] = {631, 699, 867, 950, 329, 846, 951, 83, 291, 85, 591, 93, 644, 78, 938, 541, 141, 415, 247, 914, 775, 173, 2, 445, 
        519, 465, 913, 418, 842, 836, 639, 307, 157, 235, 106, 183, 356, 385, 760, 449, 920, 507, 56, 669, 528, 269, 164, 
        129, 894, 20, 454, 160, 74, 417, 923, 493, 625, 822, 795, 455, 205, 824, 900, 388, 122, 843, 924, 818, 979, 980, 16, 
        256, 710, 788, 282, 92, 453, 402, 268, 241, 617, 902, 66, 105, 635, 632, 821, 683, 557, 838, 694, 116, 468, 653, 859, 
        138, 13, 463, 64, 794, 119, 740, 687, 24, 353, 244, 321, 452, 879, 739, 614, 725, 501, 131, 566, 948, 864, 435, 553, 15, 
        634, 524, 909, 97, 326, 807, 698, 43, 621, 782, 371, 615, 57, 689, 99, 384, 605, 45, 574, 579, 258, 331, 386, 550, 779, 752,
         461, 188, 702, 734, 242, 512, 364, 5, 764, 41, 320, 988, 464, 239, 86, 831, 626, 478, 798, 223, 793, 531, 611, 401, 132, 743, 
         361, 266, 71, 607, 195, 397, 762, 809, 971, 568, 958, 189, 877, 422, 594, 447, 940, 858, 854, 406, 515, 460, 738, 36, 933, 372,
          448, 593, 709, 547, 230, 393, 170, 427, 18, 823, 763, 178, 941, 103, 987, 984, 810, 777, 344, 735, 962, 12, 744, 546, 520, 832};
      System.out.println("Initial Array: "); // might need to get rid of that 
      printArray(arr3); // same with this
    
      mergeSortExecute ob3 = new mergeSortExecute(); 
      // object creation to apply data to 
      ob3.sort(arr3, 0, arr3.length - 1); 
      System.out.println("\nMerge Sorted Array: ");
      printArray(arr3);
      // calculation for time it takes to run.
      endTime = System.currentTimeMillis();
      elapsed = endTime - startTime;
      System.out.println(elapsed * 0.001 + " Seconds\n");
      System.out.println("Medium Array: 222 Elements, Randomly Assorted");
      break;
    }

    
  }
}
