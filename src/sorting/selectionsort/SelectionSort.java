package sorting.selectionsort;

import unorderedArray.ArrayImplementation;

//O(n^2)
public class SelectionSort extends ArrayImplementation {

    public SelectionSort(int maxSize) {
        super(maxSize);
    }

    public void sort() {

        int min;
        int outer, inner;

        for(outer = 0; outer < this.size - 1; outer++) {
            min = outer;
            for(inner = outer + 1; inner < this.size; inner++) {
                if(this.array[inner] < this.array[min]) {
                    min = inner;
                }
            }
            Long temp = this.array[min];
            this.array[min] = this.array[outer];
            this.array[outer] = temp;
        }
    }
}
