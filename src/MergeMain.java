

public class MergeMain {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            int intArrayLength = 10000 * i;
            int[] a = ArrayUtils.randomIntArray(intArrayLength, intArrayLength);
            MergeSorter.resetCounter();
            MergeSorter.sort(a);
            System.out.println("Array size: " + intArrayLength + "; comparisons: " + MergeSorter.getCounter());
        }
    }
}
