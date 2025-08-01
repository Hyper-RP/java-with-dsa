package LinkedList.doubly;

public class LL {
    Node head;

    public void insertingAtStart(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void insertingAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            insertingAtStart(data);
        }

        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    public void insertAtPosition(int index,int data){
        Node newNode=new Node(data);
        if(head==null){
            System.out.println("Linked list is empty...");
            return;
        }
        if(index==0){
           insertingAtStart(data);
           return;
        }
        else if(count()==index){
            insertingAtEnd(data);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next.prev=newNode;
        newNode.prev=temp;
        temp.next=newNode;
    }


    public int count(){
        Node temp=head;
        int count=0;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }


    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
    }


}
