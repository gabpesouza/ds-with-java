package orderedArray;

public class OrderedArrayImplementation {

    protected Long[] array;
    protected int size;

    public OrderedArrayImplementation(int maxSize) {
        array = new Long[maxSize];
        size = 0;
    }

    public void insert(long value) {

        int j;

        for (j = 0; j < size; j++) {
            if (array[j] >= value) {
               break;
            }
        }

        for (int k = j; k < size; k++) {
            array[k + 1] = array[k];
        }

        array[j] = value;
        size++;
    }

    public boolean find(long searchedValue) {

        int j;

        for (j = 0; j < size; j++) {
            if (array[j] == searchedValue) {
                return true;
            }
            if (array[j] > searchedValue) {
                return false;
            }
        }

        return false;
    }

    public boolean delete(long value) {

        int j;
        boolean found = false;

        for (j = 0; j < size; j++) {
            if(value == array[j]) {
                found = true;
                break;
            }
        }

        if (!found) {
            return false;
        } else {
            for (int k = j; k < size; k++) {
                array[k] = array[k + 1];
            }
            size--;
            return true;
        }
    }

    public void display() {

        for (Long value : array) {
            System.out.print(value + " ");
        }
    }
}
