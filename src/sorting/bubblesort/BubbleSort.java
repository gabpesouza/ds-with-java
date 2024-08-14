package sorting.bubblesort;

import unorderedArray.ArrayImplementation;

//O(n^2)
public class BubbleSort extends ArrayImplementation {

    public BubbleSort(int maxSize) {
        super(maxSize);
    }

    public void sort() {
        int start, end;

        for (end = this.size - 1; end > 1; end--) {
            for (start = 0; start < end; start++) {
                if (this.array[start] > this.array[start + 1]) {
                    this.swap(start, start + 1);
                }
            }
        }
    }

    private void swap(int left, int right) {

        Long temp = this.array[left];
        this.array[left] = this.array[right];
        this.array[right]  = temp;
    }


}
