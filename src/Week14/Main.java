package Week14;

public class Main {
    public static void main(String[] args) {
        MyStack newStack = new MyStack();
        System.out.println("Pushing elements: ");
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        System.out.println("\nPopping:");
        while (!newStack.isEmpty()) {
            int element = newStack.pop();
            System.out.println(element);
        }
    }
}
