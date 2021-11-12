package array.BubleSort;

public class ArrayBub {

    private long[] a;
    private int nElems;

    public ArrayBub(int maxSize) {
        a = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display(int type) {

        String message = "";

        if (type == 1) {
            message = "Data Yang Belum Terurut => ";
        } else {
            message = "Data Yang Sudah Terurut => ";
        }

        System.out.print("\n" + message);

        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");

        }

    }

    public void bubbleSort() {
        int out, in;

        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
