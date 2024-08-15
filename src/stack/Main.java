package stack;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(10);

        stack.push(5);
        stack.push(10);
        stack.push(7);
        stack.push(15);
        stack.push(18);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
