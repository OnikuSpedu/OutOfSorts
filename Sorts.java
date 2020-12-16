public class Sorts{
    /**Bubble sort of an int array. 
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data){ 
        int pointer = 0;
        boolean isSorted = false;
        if (data.length < 2) {
            while(!isSorted) {
                int swaps = 0;
                for (int i = 0; i < data.length - 1; i++) {
                    if(data[i] > data[i+i]) {
                        int temp = data[i+i];
                        data[i+1] = data[i];
                        data[i] = temp;
                        swaps++;
                    }
                }
                DebugPrint.dprint(swaps);
                if (swaps == 0) { isSorted = true;}
            }
        }
    }
}