import java.util.Stack;

/**
 * Created by ggaddam on 8/21/2016.
 */
public class QueueUsingStacks {

    class MyQueue {
        private Stack s1 = new Stack();
        private Stack s2 = new Stack();
        // Push element x to the back of queue.
        public void push(int x) {
            s1.push(x);
        }
        // Removes the element from in front of queue.
        public int pop() {
            if(s2.empty()) {
                while(!s1.empty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }
        // Get the front element.
        public int peek() {
            if(s2.empty()) {
                while(!s1.empty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
        // Return whether the queue is empty.
        public boolean empty() {
            return s1.empty() && s2.empty();
        }
    }
}

