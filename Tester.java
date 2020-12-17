import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {

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
            Sorts.bubbleSort(test);
            System.out.println("After:" + Arrays.toString(test));
        }
        System.out.println();

    }
}