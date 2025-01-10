import java.util.*;
public class trial{
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data){     
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    static class BinaryTress{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
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
        return leftNodes + rightNodes + 1;
    }

    public static int SumOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftSum= SumOfNodes(root.left);
        int rightSum= SumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int HeightOfTree(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight= HeightOfTree(root.left);
        int rightHeight= HeightOfTree(root.right);

        int maxHeight= Math.max(leftHeight, rightHeight)+1;
        return maxHeight;
    }

    public static void main(String arg[]){
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTress tree= new BinaryTress();
        
        Node root= tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(HeightOfTree(root));


    }
}