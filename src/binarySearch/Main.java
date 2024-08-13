package binarySearch;

public class Main {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(10);
        binarySearch.insert(18);
        binarySearch.insert(26);
        binarySearch.insert(32);
        binarySearch.insert(55);
        binarySearch.insert(72);
        binarySearch.insert(88);
        binarySearch.insert(99);
        binarySearch.insert(120);
        binarySearch.insert(124);
        binarySearch.insert(136);

        binarySearch.find(124);

    }
}
