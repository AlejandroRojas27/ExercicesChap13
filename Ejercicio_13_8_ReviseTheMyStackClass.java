import java.util.ArrayList;

public class Ejercicio_13_8_ReviseTheMyStackClass {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.push(11);
        myStack.push(27);
        myStack.push(12);
        myStack.push(96);
        System.out.println(myStack.toString());

        MyStack myStack1 = (MyStack) myStack.clone();

        myStack.pop();
        System.out.println(myStack.toString());

        System.out.println(myStack1);

    }
}

class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public Object clone() {
        try {
            MyStack stack = (MyStack) super.clone();
            stack.list = (ArrayList<Object>) this.list.clone(); /** Deep copy*/
            return stack;
        } catch (CloneNotSupportedException ex) {
            return null;
        }

    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object ans = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return ans;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
