import java.util.Arrays;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {

        handmadeTests("bubbleSort");
        randomTests("bubbleSort");

        handmadeTests("selectionSort");
        randomTests("selectionSort");

    }

    public static void handmadeTests(String sortType) {
        System.out.println();
        System.out.println("--------- Handmade Curated " + sortType + " Tests ---------" );
        int[][] HandmadeTests = {
            {},
            {0},
            {0, 1, 2, 3, 4},
            {0, 1, 3, 2, 4},
            {0, 4, 3, 2, 1}
        };

        for (int i = 0; i < HandmadeTests.length; i++) {
            int[] test = HandmadeTests[i];
            System.out.println("Before:" + Arrays.toString(test));
            if (sortType.equals("bubbleSort")) {
                Sorts.bubbleSort(test);
            }
            else if (sortType.equals("selectionSort")) {
                Sorts.selectionSort(test);
            }
            System.out.println("After:" + Arrays.toString(test));
        }
        System.out.println();
    }

    public static void randomTests(String sortType) {
        System.out.println();
        System.out.println("--------- Random Generated Integer Arrays " + sortType + " Tests ---------" );
        int seed = 324090;
        System.out.println("Seed: " + seed);

        int[][] testCases = new int[1000][];

        int pointer = 0;

        Random rng = new Random(seed);
        boolean failure = false;

        for (int i = 0; i < testCases.length; i++) {
            int[] tempArr = new int[(int)(Math.random() * ((20) + 1))];
            for (int j = 0; j < tempArr.length; j++) {
                tempArr[j] = rng.nextInt() % 1000;
                pointer++;
            }
            
            testCases[i] = tempArr;
            System.out.println("Before:" + Arrays.toString(tempArr));
            if (sortType.equals("bubbleSort")) {
                Sorts.bubbleSort(tempArr);
            }
            else if (sortType.equals("selectionSort")) {
                Sorts.selectionSort(tempArr);
            }
            System.out.println("After:" + Arrays.toString(tempArr));
            if (isSorted(tempArr)) {
                System.out.println("Test Case " + (i + 1) + ": Success");
            }
            else {
                System.out.println("Test Case " + (i + 1) + ": Fail");
                failure = true;
            }
            
            System.out.println();
        }

        System.out.println(pointer + " Integers Used. Generated Using Seed: " + seed +".");
        if (failure) {
            System.out.println("At least one test case failed.");
        } else {
            System.out.println("\nS      u     c    c   e  s s.");
        }
    }
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}
