package LinkedList.Singly;

public class LL {
    Node head;

    public void insertAtEnd(int value){
        Node node=new Node(value);
        if(head==null){
          head=node;
        }
        Node temp=head;
        while (temp.next!=null){
          temp=temp.next;
        }
        temp.next=node;
    }
}
