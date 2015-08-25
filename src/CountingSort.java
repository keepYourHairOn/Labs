/**
 * Created by Admin on 25.08.2015.
 */
public class CountingSort {
    /**
     * method for implementation counting sort
     * @param A is an array to sort
     * @param max is the maximum value in the array
     * @return already sorted array
     */
    public static int[] sort(int[] A, int max){
        int[] C = new int[max];
        //count number of repeating of each number in the array
        for (int i = 0; i < A.length; i++) {
            C[A[i]]++;
        }

        //calculate range of positions for each number
        for (int i = 1; i < max; i++) {
            C[i] += C[i-1];
        }

        //create new array to store sorted array
        int[] B = new int[A.length];

        //put elements from A array to the right(sorted) order in B array
        for (int i = A.length - 1; i >= 0; i--) {
            B[--C[A[i]]] = A[i];
        }

        return A;
    }
}
