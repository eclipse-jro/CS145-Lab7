////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 7th, 2019
// FILE     |   QueueTest.java tests functionality of the IntegerQueue class and its methods.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class QueueTest {
    // Case 1 passes if (front == 4 && front is printed).
    public void testcase1(){
        IntegerQueue test1 = new IntegerQueue();
        test1.enqueue(1);
        test1.enqueue(2);
        test1.enqueue(3);
        test1.enqueue(4);
        test1.enqueue(5);
        test1.dequeue();
        test1.dequeue();
        test1.dequeue();
        System.out.println(test1.peek());
    }
    // Case 2 passes if (front == 8 && nothing is printed) -- implying a non-empty queue.
    public void testcase2(){
        IntegerQueue test2 = new IntegerQueue();
        test2.enqueue(2);
        test2.enqueue(4);
        test2.enqueue(8);
        test2.dequeue();
        test2.dequeue();

        if(test2.isEmpty()){
            System.out.println("Queue is empty.");
        }
    }
    // Case 3 passes if (top == 6 && top is printed).
    public void testcase3(){
        IntegerQueue test3 = new IntegerQueue();
        test3.enqueue(3);
        test3.enqueue(6);
        test3.enqueue(9);
        test3.dequeue();

        System.out.println(test3.peek());

        if(test3.isEmpty()){
            System.out.println("Queue is empty.");
        }
    }
}
