public class MergeSorter {

    private static int counter;

    private static void merge(int[] first, int[] second, int[] a)
    {
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0; // Next open position in

        // As long as neither iFirst nor iSecond is past the end, move
        // the smaller element into a
        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst] < second[iSecond])
            {
                a[j] = first[iFirst];
                iFirst++;
                counter++;
            }
            else
            {
                a[j] = second[iSecond];
                iSecond++;
                counter++;
            }
            j++;
        }

        // Note that only one of the two loops below copies entries
        // Copy any remaining entries of the first array
        while (iFirst < first.length)
        {
            a[j] = first[iFirst];
            iFirst++; j++;
        }
        // Copy any remaining entries of the second half
        while (iSecond < second.length)
        {
            a[j] = second[iSecond];
            iSecond++; j++;
        }
    }

    public static int getCounter() {
        return MergeSorter.counter;
    }

    public static void resetCounter() {
        MergeSorter.counter = 0;
    }

    public static int[] sort(int[] a) {
        if(a.length <= 1) {
            return a;
        }

        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];
        System.arraycopy(a, 0, first, 0, first.length);
        System.arraycopy(a, first.length, second, 0, second.length);

        sort(first);
        sort(second);

        merge(first, second, a);

        return a;
    }
}
