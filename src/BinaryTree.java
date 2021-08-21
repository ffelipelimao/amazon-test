import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

     public int height(Node root) {
        if(root == null){
            return 0;
        }
        else{
            int left = height(root.left);
            int right = height(root.right);
            if(left > right){
                return 1 + left;
            }
            else{
                return 1 + right;
            }
        }
    }

    public void printLevelOrder(Node root) {
        if(root == null){
            return ;
        }
        LinkedList<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println(current.data+ "");
            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
        }
    }

    public void swapNods(Node root){
        if (root== null ||
                (root.left==null && root.right==null) ){
            return ;
        }

        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        swapNods(root.left);
        swapNods(root.right);
    }

    public void inorder(Node root)
    {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

}