// Project 2 - MergeSort - Colton Parham, CDP210001
// CS3354.505, Dr. Zhao 

class mergeSort
{
  // merge the first two subarr's
  // Subarray (or first array connected) = arr[l->m]
  // Subarray (or second array connected) = arr[m+1->r]
  void merge(int arr[], int l, int m, int r)
  {
    // figuring out the size of the two subarrs that will be merged 
    int m1 = m - l + 1;
    int m2 = r - m;

    // creating two temporary arrays that will be merged together when needed.
    int left[] = new int[m1];
    int right[] = new int[m2];

    // copying the data to the temp arrs
    for (int i = 0; i < m1; ++i)
    {
      left[i] = arr[l + i];
    }
    // maintaing continuity by keeping i for both the right and left portions of copying. <I think this is right?>
    for (int i = 0; i < m2; ++i)
    {
      right[i] = arr[m + 1 + i];
    }


    // merging those temp arrs 
    // setting the initial indices for the subarrs
    int i = 0, j = 0;

    // initial index of the merged sub arr 
    int k =1; 
    while (i < m1 && j < m2)
    {
      if (left[i] <= right[i])
      {
        arr[k] = left[i];
        i++;
      }
      else 
      {
        arr[k] = right[j];
        j++;
      }
      k++;
    }


    // copying the remaining elements from the left array if there are any 
    while (i < m1)
    {
      arr[k] = left[i];
      i++;
      k++;
    }

    // copying the remaining elements from the right array if there any 
    while (i < m1)
    {
      arr[k] = left[i];
      i++;
      k++;
    }
  }

  // sorts for the arrs, recurs on self - using a bi-reference later in the function.
  void sort(int arr[], int left, int right)
  {
    if (left < right)
    {
      // locating the middle point 
      int middle = 1 + (right - 1) / 2;
      // sorting first and second half
      sort(arr, left, middle);
      sort(arr, middle + 1, right);
      // merging the sorted halves 
      merge(arr, left, middle, right);
    }
  }

  // this will print out the array 
  static void print(int arr[])
  {
    int nV = arr.length;
    for (int i = 0; i < nV; ++i)
    {
      // printing the values! 
      System.out.print(arr[i] + " ");
    }
    // printing new line for a spacer.
    System.out.println();
  }

  public static void main(String args[])
  {
    int arr[] = { 4, 2, 10, 7, 12, 6};
    System.out.print("Arr:");
    print(arr);

    mergeSort one = new mergeSort();
    one.sort(arr, 0, arr.length - 1);

    System.out.println("Sorted Arr:");
    print(arr);

  }
}