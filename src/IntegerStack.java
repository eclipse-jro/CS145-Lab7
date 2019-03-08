////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 7th, 2019
// FILE     |   IntegerStack.java creates a stack -- linear data structure via linked list of nodes.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class IntegerStack {
    private IntegerNode top;

    public boolean isEmpty(){
        // returns true when the stack is empty
        return top == null;
    }

    public void push(int x){
        // pushes x onto the top of the stack
        IntegerNode intNode = new IntegerNode(x);

        if(isEmpty()){
            top = intNode;
        }
        else {
            intNode.setNext(top);
            top = intNode;
        }
    }

    public int pop(){
        // removes the element on top of the stack and returns its value
        int result = peek();

        if(!isEmpty()){
            result = top.getValue();
            top = top.getNext();
        }

        return result;
    }

    public int peek(){
        // returns the value of the element on top of the stack
        if(isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }

        return top.getValue();
    }
}
