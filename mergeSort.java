// Colton Parham: CDP210001 - Project 2, mergeSort.java
// CS 3345.505, Dr. Zhao
// converting to comparable instead.
// scanner for input tests, as well as the random, for the random values to be produced inside of the arrays.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

class mergeSort {
   // merge the first two subarr's
  // Subarray (or first array connected) = arr[l->m]
  // Subarray (or second array connected) = arr[m+1->r]
  void merge(Comparable arr[], int left,int m, int right)
  {
    // size of subarr
    int n1 = m - left + 1;
    int n2 = right - m;

    // setting up the left and right of the arr.
    Comparable L[] = new Comparable[n1];
    Comparable R[] = new Comparable[n2];

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
      if (L[i].compareTo(R[j]) <= 0)
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
  void sort(Comparable arr[], int left, int right)
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
}
