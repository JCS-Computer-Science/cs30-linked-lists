public class LinkedListTester{

    public static void main(String[] args) {
    
    MyLinkedList list = new MyLinkedList();
    list.append(6); // 6-->null
    list.push(7); // 7-->6-->null
    list.push(1); // 1-->7-->6-->null
    list.append(4); // 1-->7-->6-->4-->null
    list.insertAfter(list.head.next, 8); // 1-->7-->8-->6-->4-->null
    
    System.out.println("Created Linked List is:");
    list.print();
    //expected "1 7 8 6 4 "
    
    System.out.println("Length of the Linked List is:");
    System.out.println(list.length());
    //expected "5"
    
    list.deleteAtPosition(2); // 1-->7-->6-->4-->null
    list.deleteFirstAppearance(7); // 1-->6-->4-->null
    
    list.print();
    //expected "1 6 4 "
    
    list.deleteAtPosition(3); //should do nothing as there is no Node at position 3
    list.deleteFirstAppearance(16); //should do nothing as there are no Nodes with data=16
    
    
    }
}