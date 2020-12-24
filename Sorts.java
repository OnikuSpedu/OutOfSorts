public class Sorts{
    /**Bubble sort of an int array. 
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data){ 
        boolean sorted = false;
        if (data.length > 1) {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < data.length - 1; i++) {
                    if (data[i] > data[i+1]) {
                        sorted = false;
                        int temp = data[i];
                        data[i] = data[i+1];
                        data[i+1] = temp;
                    }
                }
            }
        }
    }
    public static void selectionSort(int[] data){
        if (data.length > 1) {
            for (int i = 0; i < data.length; i++) {
                int minIndex = i;
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] < data[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = data[i];
                    data[i] = data[minIndex];
                    data[minIndex] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] data){
        if (data.length > 1) {
            for (int i = 1; i < data.length; i++) {
                int value = data[i];
                int j = i - 1;
                while (j >= 0 && data[j] > value) {
                    data[j+1] = data[j]; 
                    j--;
                }
                data[j + 1] = value;
            }
        }
    }
}