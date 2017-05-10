/**
 * Created by ggaddam on 8/21/2016.
 */
public class StackUsingQueue {
    class MyStack {
        LinkedList< Integer > ls;

        public MyStack() {
            ls = new LinkedList< Integer >();
        }
        // Push element x onto stack.
        public void push(int x) {
            ls.push(x);
            for(int i = 0; i < ls.size() - 1; i++) {
                ls.push(ls.peek());
                ls.pop();
            }
        }

        // Removes the element on top of the stack.
        public void pop() {
            ls.pop();
        }

        // Get the top element.
        public int top() {
            return ls.peek();
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return ls.isEmpty();
        }
    }
}
