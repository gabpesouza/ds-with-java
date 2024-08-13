package binarySearch;

import orderedArray.OrderedArrayImplementation;

public class BinarySearch extends OrderedArrayImplementation {

    public BinarySearch(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean find(long searchedValue) {

        int lowerBound = 0;
        int upperBound = this.size - 1;

        while(true) {
            int currIndex = (lowerBound + upperBound) / 2;
            if (this.array[currIndex] == searchedValue) {
                System.out.println(currIndex);
                return true;
            } else if (lowerBound > upperBound) {
                System.out.println(currIndex);
                return false;
            } else {
                if (this.array[currIndex] > searchedValue) {
                    upperBound = currIndex - 1;
                } else {
                    lowerBound = currIndex + 1;
                }
            }
        }
    }
}
