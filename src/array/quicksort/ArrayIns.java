package array.quicksort;

public class ArrayIns {

    private long[] theArray;
    private int nElems;

    public ArrayIns(int maxSize) {
        theArray = new long[maxSize];
        nElems = 0;
    }

    public void insert(long n) {
        theArray[nElems] = n;
        nElems++;
    }

    public void display() {
        System.out.println("A=");

        for (int j = 0; j < nElems; j++) {
            System.out.println(theArray[j] + " ");
            System.out.println("");
        }
    }

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }

    public void recQuickSort(int left, int rigth) {
        if (rigth - left <= 0) {
            return;
        } else {
            long pivot = theArray[rigth];

            int partition = partitionIt(left, rigth, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, rigth);
        }
    }

    private int partitionIt(int left, int rigth, long pivot) {
        int leftPtr = left - 1;
        int rigthPtr = rigth;

        while (true) {
            while (theArray[++leftPtr] < pivot)
                ;
            while (rigthPtr > 0 && theArray[--rigthPtr] > pivot)
                ;

            if (leftPtr >= rigthPtr) {
                break;
            } else {
                swap(leftPtr, rigthPtr);
            }
            swap(leftPtr, rigth);


        }
        return leftPtr;
    }

    public void swap(int dex1, int dex2) {
        long temp = theArray[dex2];
        theArray[dex1] = theArray[dex2];

        theArray[dex2] = temp;
    }
}
