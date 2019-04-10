public class BubbleSortMain {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {

            int intArrayLength = 10000 * i;
            int[] a = ArrayUtils.randomIntArray(intArrayLength, intArrayLength);

            BubbleSort bubbleSort = new BubbleSort(a);
            bubbleSort.resetCounter();
            bubbleSort.sort();
            System.out.println("Array size: " + intArrayLength + "; comparisons: " + bubbleSort.getCounter() + "; time: " + bubbleSort.getTimeToExecute() + " seconds");
        }
    }
}
