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

  }
}