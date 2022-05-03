public abstract class AbstractMyLinkedList {
    public Node head;

    //creates a new Node with the given int as data and inserts it at the front of the list
    //returns nothing
    public abstract void push(int data);

    //creates a new Node with the given int as data and inserts it after the given Node. If the given Node is null, do nothing
    //returns nothing
    public abstract void insertAfter(Node node, int data);

    //creates a new Node with the given int as data and inserts it at the end of the list
    //returns nothing
    public abstract void append(int data);

    //prints to System.out the data in each Node, separated by spaces (eg "3 24 -2 0")
    //returns nothing
    public abstract void print();

    //removes the Node at the given position (0-indexed) by changing the previous Node's "next" to the to-be-deleted Node's "next".
    //If the given position doesn't exist, do nothing
    //returns nothing
    public abstract void deleteAtPosition(int index);

    //removes the first Node whose "data" matches the given int. 
    //If there are no matches, nothing should happen
    //returns nothing
    public abstract void deleteFirstAppearance(int value);

    //returns the number of nodes in the list
    public abstract int length();
}