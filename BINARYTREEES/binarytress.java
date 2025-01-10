import java.util.*;
public class binarytress {
    static class Node {
        int data;
        Node left;
        Node right;
 
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
 
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root){
      if(root==null){
        return;
      }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){

        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){

        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode= q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int CountOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes= CountOfNodes(root.left);
        int rightNodes= CountOfNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public static int SumOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftSum= SumOfNodes(root.left);
        int rightSum= SumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight= heightOfTree(root.left);
        int rightHeight= heightOfTree(root.right);

        int maxHeight= Math.max(leftHeight, rightHeight)+1;
        return maxHeight;
    }

    public static int diameterOfTree(Node root){
        if(root==null){
            return 0;
        }
        int diam1= diameterOfTree(root.left);
        int diam2= diameterOfTree(root.right);
        int diam3= heightOfTree(root.left) + heightOfTree(root.right) +1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

     static class TreeInfo{
        int height;
        int diam;

        TreeInfo(int height, int diam){
            this.height= height;
            this.diam= diam;
        }
    }

    public static TreeInfo diameter2(Node root){

        if(root==null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left= diameter2(root.left);
        TreeInfo right= diameter2(root.right);

        int myHeight= Math.max(left.height, right.height)+1;

        int diam1= left.diam;
        int diam2= right.diam;
        int diam3= left.height + right.height+1;

        int myDiam= Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo= new TreeInfo(myHeight, myDiam);
        return myInfo;

    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
       System.out.println(diameterOfTree(root));
       System.out.println(heightOfTree(root));
       System.out.println(diameter2(root).diam);


        
    }
 }