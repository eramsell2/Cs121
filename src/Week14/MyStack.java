package Week14;
import java.util.ArrayList;
public class MyStack {
    private ArrayList<Integer> elements;
    public MyStack() {
        elements = new ArrayList<>();
    }
    public void push(int element) {
        elements.add(element);
    }
    public int pop() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return elements.remove(elements.size() - 1);
    }
    public int peek() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return elements.get(elements.size() - 1);
    }
    public boolean isEmpty() {
        return elements.isEmpty();
    }


}
