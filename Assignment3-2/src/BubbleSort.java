import java.util.Date;

public class BubbleSort {
    private int[] array;
    private int counter;
    private long dateTimeStart;
    private long dateTimeEnd;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        dateTimeStart = new Date().getTime();
        boolean swapped = true;
        for(int i = this.array.length - 1; i > 0 && swapped; i--) {
            swapped = false;
            counter++;
            for(int j = this.array.length - 1; j >= this.array.length - i; j--){
                if(this.array[j] < this.array[j - 1]) {
                    swap(j, j - 1);
                    swapped = true;
                    counter++;
                }
            }
        }
        dateTimeEnd = new Date().getTime();
    }

    private void swap(int firstPosition, int secondPosition) {
        int tempPositionHold = this.array[firstPosition];
        this.array[firstPosition] = this.array[secondPosition];
        this.array[secondPosition] = tempPositionHold;
    }

    public int getCounter() {
        return counter;
    }

    public void resetCounter() {
        this.counter = 0;
    }

    public double getTimeToExecute() {
        return ((this.dateTimeEnd - this.dateTimeStart) / 1000.0);
    }
}
