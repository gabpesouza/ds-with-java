package sorting.insertionsort;

import unorderedArray.ArrayImplementation;

public class InsertionSort extends ArrayImplementation {

    public InsertionSort(int maxSize) {
        super(maxSize);
    }

    public void sort() {

        for(int out = 1; out < this.size; out++) {
            Long temp = this.array[out];
            int in = out;

            while(in > 0 && this.array[in - 1] >= temp) {
                this.array[in] = this.array[in - 1];
                in--;
            }

            this.array[in] = temp;
        }
    }
}
