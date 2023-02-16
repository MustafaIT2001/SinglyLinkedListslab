package singly.linked.lists;

public class Node {

    protected int data;
    protected Node next;
    /**
     * Constructor takes an element and initializes a node with it.
     * @param e an integer
     */
    public Node(int e){
        data = e;
        next = null;
    }

    public String toString() {
        return String.format("%d", data);
    }

}
