package array.quicksort;

public class QuickSort {

    public static void main(String[] args) {
        int maxSize = 16;
        ArrayIns arrayIns;

        arrayIns = new ArrayIns(maxSize);

        for (int j=0; j<maxSize;j++){
            long n = (int) (Math.random()*99);
            arrayIns.insert(n);
        }

        arrayIns.display();
        arrayIns.quickSort();
        arrayIns.display();
    }
}
