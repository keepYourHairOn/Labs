import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] A = new int[1000000];
        int max = 100000;
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(max);
        }
        long startTime = System.nanoTime();
        CountingSort.sort(A, max);
        long endTime = System.nanoTime();
        System.out.println("Time for performing: " + (endTime - startTime));

        //Time for performing: 1008732 for max 10000 size 100
        //Time for performing: 3569170 for max 100000 size 100

        //Time for performing: 1121139 for max 10000 size 1000
        //Time for performing: 3640035 for max 100000 size 1000

        //Time for performing: 1792649 for max 10000 size 10000
        //Time for performing: 3919587 for max 100000 size 10000

        //Time for performing: 5058319 for max 10000 size 100000
        //Time for performing: 6957022 for max 100000 size 100000

        //Time for performing: 25135695 for max 10000 size 100000
        //Time for performing: 47511063 for max 100000 size 100000
    }
}
