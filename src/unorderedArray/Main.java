package unorderedArray;

class Main {

    public static void main(String[] args) {

        ArrayImplementation arrayImpl = new ArrayImplementation(10);

        arrayImpl.insert(10);
        arrayImpl.insert(15);
        arrayImpl.insert(20);
        arrayImpl.insert(32);
        arrayImpl.insert(22);
        arrayImpl.insert(24);
        arrayImpl.insert(44);

        System.out.println(arrayImpl.find(44));

        System.out.println(arrayImpl.delete(44));

        arrayImpl.display();
    }
}
