// Colton Parham: CDP210001 - Project 2, driver.java
// CS 3345.505, Dr. Zhao
// Driver file to run all of the tests against each other 
// Quick Note: Opted to go with Comparable for both, for ease of construction, as well as went with the switch/case to give the options of a starting point.

// Importing Scanner and Random to take input, and get those random values
import java.util.Random;
import java.util.Scanner;

// driver function/class to run everything for the test cases
public class driver{
  public static void main(String args[])
  {
    // List of Values to be tested
    Scanner input = new Scanner(System.in);
    // input prompt 
    System.out.print("Please select a test to start from: \n 1. 25k Randomly Sorted Elements\n 2. 50k Randomly Sorted Elements\n 3. 100k Randomly Sorted Elements\n 4. 1 Million Randomly Sorted Elements\n 5. Almost Sorted Array 750 elements\n Enter Choice here: ");
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
      System.out.println("\nTest 1(Small): 25k Elements");
        // having the start time start within the actual case, for most accurate timing.
        long endTime1, elapsed1, endTime1Q, elapsed1Q;
        long startTime1 = System.currentTimeMillis();
        // generating array of 25k random elements
        // val to apply to the array size 
        int val = 25000;
        // generates random values to be put in the sortable arrays.
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
      // break;

      // medium
      case 2:
        System.out.println("\nTest 2(Medium): 50k Elements");
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
      // break;
      // Large Array
      case 3:
        // having the start time start within the actual case, for most accurate timing.
        System.out.println("\nTest 3(Large): 100k Elements");
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
      // break;
      // Extra large 
      case 4: 
        System.out.println("\nTest 4(Extra Large): 1,000,000 Elements");
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
       System.out.println("Extra Large Array: 1,000,000 Elements, Randomly Assorted, and Randomly Generated Values\n");
      // break;
      // Almost Sorted Array
      case 5:
      System.out.println("\nTest 5(Almost Sorted): 750 Elements");
      // having the start time start within the actual case, for most accurate timing.
      long endTime5, elapsed5, endTime5Q, elapsed5Q;
      long startTime5 = System.currentTimeMillis();

      // val to apply to the array size 
    
    // The almost sorted array is hardcoded in, 450/500 are in order
     Comparable arr5[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 621, 744, 629, 618, 729, 681, 709, 660, 670, 651, 697, 660, 700, 721, 613, 631, 601, 635, 744, 633, 639, 674, 673, 670, 601, 694, 615, 602, 653, 640, 650, 707, 625, 686, 712, 652, 652, 610, 657, 609, 630, 723, 745, 693, 709, 723, 619, 703, 673, 731};

     // array for the Quick Sort
     Comparable arr5Q[] = new Comparable[arr5.length];
     // copying array
     for (int k = 0; k < arr5.length; k++)
     {
      arr5Q[k] = arr5[k];
     }
      // object creation for the object 
     mergeSort ob5 = new mergeSort(); 
     print(arr5);
      // function call for the sort 
      ob5.sort(arr5, 0, arr5.length - 1); 
      System.out.println("\nMerge Sorted Array: ");
      // calculation for time it takes to run.
      endTime5 = System.currentTimeMillis();
      elapsed5 = endTime5 - startTime5;
      // Displays the Time it took to run/sort the array
      System.out.print("Took " + elapsed5 * 0.001 + " Seconds to run and sort through the Array\n");
      System.out.println("Almost Sorted Array, 750 Total Elements, 600 Pre-Sorted Elements, 150 Unsorted Elements");
      
     // QuickSort Portion
    // object creation for quicksort.
     quickSort obQ5 = new quickSort();
     // Startime being defined with Q to differentiate and be as accurate as possible
     long startTime5Q = System.currentTimeMillis();
     // Object Creation for quicksort
     obQ5.quickSort(arr5Q);
     System.out.println("\nQuick Sorted Array: ");
     // grabbing end time
     endTime5Q = System.currentTimeMillis();
     elapsed5Q = endTime5Q - startTime5Q;
     // Message with Details 
     System.out.print("Took " + elapsed5Q * 0.001 + " Seconds to run and sort through the Array\n");
     System.out.println("Almost Sorted Array, 750 Total Elements, 600 Pre-Sorted Elements, 150 Unsorted Elements");
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
