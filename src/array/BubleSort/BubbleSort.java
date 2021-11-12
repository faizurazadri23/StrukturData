package array.BubleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arrayBub;
        arrayBub = new ArrayBub(maxSize);

        arrayBub.insert(77);
        arrayBub.insert(99);
        arrayBub.insert(44);
        arrayBub.insert(55);
        arrayBub.insert(22);
        arrayBub.insert(88);
        arrayBub.insert(11);
        arrayBub.insert(00);
        arrayBub.insert(66);
        arrayBub.insert(333);

        arrayBub.display(1);

        arrayBub.bubbleSort();

        arrayBub.display(0);

    }
}
