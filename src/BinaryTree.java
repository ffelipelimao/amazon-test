import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

     public int height(Node root) {
        if(root == null){
            return -1;
        }
        else{
            int left = height(root.left);
            int right = height(root.right);
            if(left > right){
                return  1 + left;
            }
            else{
                return  1 + right;
            }
        }
     }

    public void printLevelOrder(Node root) {
         String result = "";
        if(root == null){
            return ;
        }
        LinkedList<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            result += current.data + " ";
            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
        }
        System.out.println(result);
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