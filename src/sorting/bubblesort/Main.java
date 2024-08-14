package sorting.bubblesort;

public class Main {

    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort(10);
        bs.insert(10);
        bs.insert(2);
        bs.insert(4);
        bs.insert(1);
        bs.insert(6);
        bs.insert(15);
        bs.insert(3);
        bs.insert(5);
        bs.insert(8);
        bs.insert(7);

        bs.display();

        System.out.println();
        System.out.println("****** BUBBLE SORTING ******");

        bs.sort();

        bs.display();
    }
}
