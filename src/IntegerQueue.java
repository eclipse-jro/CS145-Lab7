////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 7th, 2019
// FILE     |   IntegerQueue.java creates a queue -- linear data structure via linked list of nodes.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class IntegerQueue {
    private IntegerNode front;
    private IntegerNode back;

    public boolean isEmpty(){
        // returns true when the queue is empty
        return front == null;
    }

    public void enqueue(int x){
        // adds x onto the back of the queue
        IntegerNode prevBack = back;
        back = new IntegerNode();
        back.setValue(x);

        if(isEmpty()){
            front = back;
        }
        else {
            prevBack.setNext(back);
        }
    }

    public int dequeue(){
        // removes the element at the front of the queue and returns its value
        int result = peek();

        if(!isEmpty()){
            result = front.getValue();
            front = front.getNext();
        }

        return result;
    }

    public int peek(){
        // returns the value of the element at the front of the queue
        if(isEmpty()){
            throw new RuntimeException("Queue is empty.");
        }

        return front.getValue();
    }
}
