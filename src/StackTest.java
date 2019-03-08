////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 7th, 2019
// FILE     |   StackTest.java tests functionality of the IntegerStack class and its methods.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class StackTest {
    // Case 1 passes if (top == 2 && top is printed).
    public void testCase1(){
        IntegerStack test1 = new IntegerStack();
        test1.push(1);
        test1.push(2);
        test1.push(3);
        test1.push(4);
        test1.push(5);
        test1.pop();
        test1.pop();
        test1.pop();

        System.out.println(test1.peek());
    }
    // Case 2 passes if (top == 2 && nothing is printed) -- implying a non-empty stack.
    public void testCase2(){
        IntegerStack test2 = new IntegerStack();
        test2.push(2);
        test2.push(4);
        test2.push(8);
        test2.pop();
        test2.pop();

        if (test2.isEmpty()){
            System.out.println("Stack is empty.");
        }
    }
    // Case 3 passes if (top == 6 && top is printed).
    public void testCase3(){
        IntegerStack test3 = new IntegerStack();
        test3.push(3);
        test3.push(6);
        test3.push(9);
        test3.pop();

        System.out.println(test3.peek());

        if(test3.isEmpty()){
            System.out.println("Stack is empty.");
        }
    }
}
