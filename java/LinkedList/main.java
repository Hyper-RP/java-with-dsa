package LinkedList;

public class main {
    public static void main(String[] args) {
        LL linkedList=new LL();

        linkedList.insertAtBegining(1);
        linkedList.insertAtBegining(2);
        linkedList.insertAtBegining(3);
        linkedList.insertAtEnding(4);
        linkedList.deleteByposition(0);
        linkedList.count();
        linkedList.searchByValue(3);
        linkedList.display();


    }
}
