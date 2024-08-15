package stack;

import java.util.Scanner;

public class BracketChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Stack stack = new Stack(input.length());

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()) {
                        char removed = (char) stack.pop();

                        if(removed == '{' && ch != '}' ||
                           removed == '(' && ch != ')' ||
                           removed == '[' && ch != ']') {

                            throw new IllegalArgumentException("Bracket dont match.");

                        } else {
                            System.out.println(removed + " " + ch);
                        }
                    } else {
                        throw new IllegalStateException("Stack is empty.");
                    }

            }
        }
    }
}
