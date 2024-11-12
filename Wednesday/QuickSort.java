//Step 1: Start
//Step 2: Declare the class with the class name as Quicksort
public class QuickSort{
    //Step 3: Declare the array
    static int[] arra = {12,9,4,99,120,1,3,10,13}
    //Step 4: Input the elements into the array and display them
    public static void display(int[] arra){
        System.out.println("The elements before sorting are:")
        //for every element in arr, per turn: assign it to var number and print the number
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //S5: Declare a method with the name quick_srt and call the procedure
        public static void quick_sort_func(int[] arr, int low, int high){
            if(low<high){
                int part = partition(arr,low,high);
/*Sort left*/   quick_sort_func(arr, low, part-1);
/*Sort right*/  quick_sort_func(arr, part+1, high);
        }   }
/*{12,9,4,99,120,1,3,10,13}index 8*/
/*{12,9,4,1,3,10,13,99,120}index 5*/
/*{9,4,1,3,10,12,13,99,120}index 3*/
/*{1,3,9,4,10,12,13,99,120}index 3*/

    //Partition the array to find the pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swap the pivot with arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    // Step 6: Display the elements using a for loop after sorting
    public static void main(String[] args) {
        // Step 5: Call quick_srt
        display(arr);  // Before sorting
        quick_srt(arr, 0, arr.length - 1);

        System.out.println("The elements after sorting are:");
        display(arr);  // After sorting
}   }   }// Step 7: Stop procedure