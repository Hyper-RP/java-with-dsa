package LinkedList.doubly;

public class main {
    public static void main(String[] args) {
        LL linkedList=new LL();
        linkedList.insertingAtStart(1);
        linkedList.insertingAtStart(2);
        linkedList.insertingAtStart(3);
        linkedList.insertingAtStart(4);
        linkedList.insertingAtStart(5);
        linkedList.display();
        System.out.println();
        linkedList.deleteByPosition(5);
        linkedList.display();
    }

}
