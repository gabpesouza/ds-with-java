package sorting.selectionsort;

public class Main {

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort(10);
        selectionSort.insert(15);
        selectionSort.insert(9);
        selectionSort.insert(11);
        selectionSort.insert(16);
        selectionSort.insert(10);
        selectionSort.insert(18);
        selectionSort.insert(14);
        selectionSort.insert(20);
        selectionSort.insert(17);
        selectionSort.insert(19);

        selectionSort.display();

        System.out.println();
        System.out.println("******** SORTING ********");

        selectionSort.sort();

        selectionSort.display();

    }
}
