package trees.btree;

public class main {
    public static void main(String[] args) {
        tree bt=new tree();
        bt.insertRoot(0);
        bt.insertLeft(new node(0),1);
        bt.insertRight(new node(0),2);
        bt.insertLeft(new node(1),3);
        bt.insertRight(new node(1),4);
        bt.insertLeft(new node(2),5);
        bt.insertRight(new node(2),6);
        bt.insertLeft(new node(3),7);
        bt.insertRight(new node(3),8);
        bt.inorder(bt.root);
    }
}
