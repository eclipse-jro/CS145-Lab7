////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 7th, 2019
// FILE     |   IntegerNode.java create a node with a integer value; has accessor and mutator characteristics.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class IntegerNode {
    private int value;
    private IntegerNode next;

    public IntegerNode(){}

    public IntegerNode(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public IntegerNode getNext(){
        return next;
    }

    public void setNext(IntegerNode next){
        this.next = next;
    }
}
