package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortedList {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList();

        listNumber.addAll(Arrays.asList(4, 6, 8, 10, 12));
        System.out.println(listNumber); //Akan menampilkan data number dalam bentuk array

        listNumber.addAll(1, Arrays.asList(5, 9)); // akan menambahkan data arrray number sebanyak 2 buah pada index ke 1
        Collections.sort(listNumber); // akan melakukan pengurutan data yang ada dalam array
        System.out.println(listNumber); //akan menampilkan hasil pengurutan
    }
}
