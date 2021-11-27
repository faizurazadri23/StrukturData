package stack;

import java.util.Scanner;
import java.util.Stack;

public class OtherStack {
    public static void main(String[] args) {

        int input = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("===Selamat data di program \n cek baju bersih dan kotor kata menggunakan konsep stack===");

        System.out.print("Silahkan masukkan kata => ");
        input = keyboard.nextInt();

        Stack kotor = new Stack();//deklarasi objek stack kotor
        Stack bersih = new Stack();//deklarasi objek stack bersih

        for (int i = 1; i <= input; i++)//akan melakukan perulangan dengan for
        {
            kotor.push("Baju " + i);//proses memasukkan data pada stack
        }
        System.out.println("SEBELUM DICUCI" +
                "\nJumlah baju kotor : " + kotor.size() +
                "\nJumlah baju bersih : " + bersih.size() +
                "\nTumpukan baju kotor :"); //menampilkan jumlah baju kotor

        for (int i = 1; i <= input; i++)//perulangan for
        {
            System.out.println(kotor.peek());
            bersih.push(kotor.pop());//proses pengeluaran data pada stack
        }
        System.out.println("\nSETELAH DICUCI" +
                "\nJumlah baju kotor : " + kotor.size() +
                "\nJumlah baju bersih : " + bersih.size() +
                "\nTumpukan baju bersih :");//menampilkan jumlah baju bersih dan baju yang telah dicuci

        for (int i = input-1; i >= 0; i--) {
            System.out.println(bersih.elementAt(i));
        }
    }
}
