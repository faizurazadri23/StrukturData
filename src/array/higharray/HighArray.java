package array.higharray;

public class HighArray {

    private long[] a;
    private int nELems;

    public HighArray(int maxSize) {

        a = new long[maxSize];
        nELems = 0;
    }

    public void insert(long value) {
        a[nELems] = value;
        nELems++;
    }

    public boolean find(long searchKey) {
        int i;

        for (i = 0; i <nELems; i++)
            if (a[i] == searchKey)
                break;

        if (i == nELems)
            return false;
        else
            return true;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j <nELems; j++)
            if (value == a[j])
                break;

        if (j == nELems) {
            return false;
        }else {
            for (int i = j; i < nELems; i++) {
                a[i] = a[i + 1];

                nELems--;


            }
        }
        return true;
    }

    public void display() {
        for (int i = 0; i < nELems; i++) {
            System.out.print(a[i] + " ");
            System.out.print("");

        }
    }
}
