package stack;

import java.util.Scanner;
import java.util.Stack;

public class PencocokanKurung {

    public static void main(String[] args) {

        String message = "";
        String input = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("===Selamat data di program \n pencocokan kurung menggunakan konsep stack===");

        System.out.print("Silahkan masukkan data pencocokan => ");
        input = keyboard.nextLine();

        boolean result = isParenthesisMatch(input);

        if (result) {
            message = "Pencocokan Sesuai";
        } else {
            message = "Pencocokan Tidak Sesuai";
        }
        System.out.println(message);
    }

    public static boolean isParenthesisMatch(String str) {
        if (str.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }


            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }

        }

        return stack.isEmpty();
    }

}
