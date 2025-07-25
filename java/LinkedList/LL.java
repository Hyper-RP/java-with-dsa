package LinkedList;

import java.util.Arrays;

public class LL {
    Node head;


    public void insertAtBegining(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }


    public void insertAtEnding(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }


    public void deleteFromBegining(){
        if(head==null || head.next==null){
            System.out.println("Linked list is empty...");
        }
        else{
            head=head.next;
        }
    }


    public void deleteFromEnding(){
        if(head==null || head.next==null){
            System.out.println("Linked list is empty...");
        }
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public int count(){
        int count=0;
        if(head==null||head.next==null){
            System.out.println("Zero nodes...Linked list is Empty");
        }

        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("Total nodes : "+count);

        return count;
    }

    public void searchByValue(int value){
        if(head==null || head.next==null){
            System.out.println("Linked list is empty...");
        }

        Node temp=head;
        while (temp.value!=value){
            temp=temp.next;
            if(temp==null){
                System.out.println("value not found");
                return;
            }
        }
        System.out.println("value exist in linked list");
    }


    public void deleteByposition(int position){
        if(head==null || count()<position){
            System.out.println("Invalid Position...");
            return;
        }
        if(position==0){
            deleteFromBegining();
            return;
        }
        Node temp=head;

        for (int i = 1; i <= position; i++) {
            if(i<position-1){
                temp=temp.next;
            }
        }

        if(temp.next!=null){
            temp.next=temp.next.next;
        }
    }


        public void reverse(){
        Node curr=head;
        Node prev=null;

        while (curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
        display();
    }


    public void display(){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.value+" - > ");
            temp=temp.next;
        }
        System.out.print(temp);
    }


}
