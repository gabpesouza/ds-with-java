package unorderedArray;

public class ArrayImplementation {

    protected Long[] array;
    protected int size;

    public ArrayImplementation(int maxSize) {
        array = new Long[maxSize];
        size = 0;
    }

    public void insert(long value) {
        this.array[size] = value;
        size++;
    }

    public boolean find(long searchedValue) {

        for (long currentValue : array) {
            if (currentValue == searchedValue) {
                return true;
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
