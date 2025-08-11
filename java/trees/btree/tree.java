package trees.btree;

public class tree {
    node root;

    public void insertRoot(int data){
        root=new node(data);
    }
    public void insertLeft(node parent,int data){
        node newNode=new node(data);
        newNode.left=parent.left;
        if(newNode.left!=null){
            newNode.left.parent=newNode;
        }
        parent.left=newNode;
        newNode.parent=parent;
    }
    public void insertRight(node parent,int data){
        node newNode=new node(data);
        newNode.right=parent.right;
        if(newNode.right!=null){
            newNode.right.parent=newNode;
        }
        parent.right=newNode;
        newNode.parent=parent;
    }

    public void inorder(node node){
        if(node==null){
          return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

}
