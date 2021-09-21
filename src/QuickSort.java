import java.util.Arrays;

public class QuickSort {

    public static void main ( String[] args ) {
        int[] A;
        A = new int[]{1,4,6,34,45};
        quickSort ( A, 10,20 );

        //print the original array
        System.out.println ( "Original Array: " + Arrays.toString ( A ) );

        //print the sorted array
        System.out.println ( "\nSorted Array: " + Arrays.toString ( A ) );
    }

    public static void quickSort(int[]A, int low, int high){
        if (low < high){
            int pivotLoc = partition (A, low, high);
            quickSort ( A, low, pivotLoc - 1 );
            quickSort ( A, pivotLoc +1, high );
        }
    }
    public static int partition(int[]A, int low, int high){
        int pivot = A[high];
        int leftWall = low;
        for(int i = low; i < high; i++){
            if(A[i]< pivot){
                int temp = A[leftWall];
                A[leftWall] = A[i];
                A[i] = temp;
                leftWall = leftWall ++;
            }
        }
        int temp2 = A[leftWall];
        A[leftWall] = pivot;
        A[high]= temp2;

        return leftWall;
    }
}


