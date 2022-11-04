// Colton Parham: CDP210001 - Project 2, quickSort.java
// CS 3345.505, Dr. Zhao

// QuickSort - Median of 3, with a cutoff of 15

public class quickSort {
  // this will actually be used inside of the driver 
  public static void quickSort(Comparable[] arr)
  {
    quickSort(arr, 0, arr.length - 1 );
  }

  static void quickSort(Comparable[] arr, int low, int high)
  {
    // setting the cutoff point to 15 as required by the instructions 
    int cutOffPoint = 15;
    if (low + cutOffPoint > high)
    {
      // setting condition to switch to the insertion sort if the condition of size is met
      insertionSort(arr, low, high);
    }
    // else condition to run the quickSort with the median of 3 rule.
    else 
    {
      // median of 3 conditions 
      int mid = (low + high) / 2;
      if (arr[mid].compareTo(arr[low]) < 0)
      {
        swapRefIndex(arr, low, mid);
      }
      if (arr[high].compareTo(arr[low]) < 0)
      {
        swapRefIndex(arr, low, high);
      }
      if (arr[high].compareTo(arr[mid]) < 0)
      {
        swapRefIndex(arr, mid, high);
      }

      swapRefIndex(arr, mid, high-1);
      
      // setting a pivot point 
      Comparable pivotPoint = arr[high - 1];

      // index increment store points 
      int i, j;
      for (i = low, j = high -1;;)
      {
        while (arr[++i].compareTo(pivotPoint) < 0);
        while (pivotPoint.compareTo(arr[--j]) < 0);
        if (i >= j)
        {
          break;
        }
        // swapping the reference points
        swapRefIndex(arr, i, j);
      }
      swapRefIndex(arr, i, high - 1);

      quickSort(arr, low, i - 1);
      quickSort(arr, i + 1, high);
    }
  }

  // swapping the reference index 
  public static final void swapRefIndex(Object[] arr, int ind1, int ind2)
  {
    // temp to apply to the first index applicable
    Object temp = arr[ind1];
    arr[ind1] = arr[ind2];
    arr[ind2] = temp;
  }

  // this insertion sort function will be called, or utilized whenever cutoff meets 15. 
  private static void insertionSort(Comparable[] arr, int low, int high)
  {
    for (int i = low + 1; i <= high; i++)
    {
      // setting up a temp var/arr
      Comparable temp = arr[i];
      int j;
      for (j = i; j > low && temp.compareTo(arr[j - 1]) < 0; j--)
      {
        arr[j] = arr[j -1];
      }
      arr[j] = temp;
    }
  }

}
