package trees.btree;

public class node {
    int data;
    node left;
    node right;
    node parent;

    node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        this.parent=null;
    }
}
