////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 7th, 2019
// FILE     |   Main.java Runs 3 test methods for both StackTest && QueueTest.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
    public static void main(String[] args){

        StackTest StackTest = new StackTest();
        StackTest.testCase1();
        StackTest.testCase2();
        StackTest.testCase3();

        QueueTest queueTest = new QueueTest();
        queueTest.testcase1();
        queueTest.testcase2();
        queueTest.testcase3();
    }
}
