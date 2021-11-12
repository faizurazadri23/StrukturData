package array.higharray;

public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;

        HighArray higharray = new HighArray(maxSize);

        higharray.insert(77);
        higharray.insert(99);
        higharray.insert(44);
        higharray.insert(55);
        higharray.insert(22);
        higharray.insert(88);
        higharray.insert(11);
        higharray.insert(89);
        higharray.insert(66);
        higharray.insert(33);

        higharray.display();

        int searchKey = 99;

        if (higharray.find(searchKey)) {
            System.out.println("\n"+searchKey + " Ditemukan");
        } else {
            System.out.println("\n"+searchKey + " Tidak Ditemukan");
        }

        higharray.delete(89);
        higharray.display();
    }
}
