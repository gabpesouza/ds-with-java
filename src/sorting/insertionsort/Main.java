package sorting.insertionsort;

public class Main {

    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort(10);

        insertionSort.insert(10);
        insertionSort.insert(2);
        insertionSort.insert(4);
        insertionSort.insert(1);
        insertionSort.insert(6);
        insertionSort.insert(15);
        insertionSort.insert(3);
        insertionSort.insert(5);
        insertionSort.insert(8);
        insertionSort.insert(7);

        insertionSort.display();

        System.out.println();
        System.out.println("******** SORTING ********");
        insertionSort.sort();

        insertionSort.display();
    }
}
