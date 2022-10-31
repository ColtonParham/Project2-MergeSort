// actual code for the mergesort that will be used.

class mergeSortExecute {
   // merge the first two subarr's
  // Subarray (or first array connected) = arr[l->m]
  // Subarray (or second array connected) = arr[m+1->r]
  void merge(int arr[], int l,int m, int r)
  {
    // size of subarr
    int n1 = m - l + 1;
    int n2 = r - m;

    int L[] = new int[n1];
    int R[] = new int[n2];

    // copying data 
    for (int i = 0; i < n1; ++i)
    {
      L[i] = arr[l + i];
    }
    for (int j = 0; j < n2; ++j)
    {
      R[j] = arr[m + 1 + j];
    }

    // merging temp arrs 
    // setting initial index of merged sub arr
    int i = 0, j = 0;
    int k = l;
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
  void sort(int arr[], int l, int r)
  {
    if (l < r)
    {
      // middle point calculation
      int m = l + (r - l) / 2;
      // sorting the first and second halves. - recurs on self.
      sort(arr, l, m);
      sort(arr, m + 1, r);
      // merging the sorted halves
      merge(arr, l, m , r);
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
    int arr[] = {12, 11, 13, 5, 6, 7};
    System.out.println("Initial Array: ");
    printArray(arr);

    mergeSortExecute ob = new mergeSortExecute(); 
    ob.sort(arr, 0, arr.length - 1); // this seems to be the issue
    System.out.println("\nMerge Sorted Array: ");
    printArray(arr);
  }
}
