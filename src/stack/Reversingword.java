package stack;

import java.util.Scanner;
import java.util.Stack;

public class Reversingword {
    public static void main(String[] args) {

        String input = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("===Selamat data di program \n membalikkan kata menggunakan konsep stack===");

        System.out.print("Silahkan masukkan kata => ");
        input = keyboard.nextLine();

        reverseData(input);
    }

    public static void reverseData(String data) {

        Stack<String> stringStack = new Stack<>();

        String temp = "";

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ') {
                stringStack.add(temp);

                temp = "";
            } else {
                temp = temp + data.charAt(i);
            }
        }

        stringStack.add(temp);

        while (!stringStack.isEmpty()) {
            temp = stringStack.peek();
            System.out.print(temp + " \t");
            stringStack.pop();
        }
    }
}
