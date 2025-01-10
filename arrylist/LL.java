public class LL {
    Node head;
    private int size;

    LL(){
      this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add--first----------------------------------------------------------------
     public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;  
        head=newNode;
     }

     //add--last--------------------------------------------------------------
     public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next !=null){
            currNode= currNode.next;
        }
        currNode.next=newNode;

     }

     //Delete first---------------------------------------------------------------
     public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
     }

     //Delete last------------------------------------------------------------------
     public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;

        }
        secondLast.next=null;
     
     }

     //print-----------------------------------------------------------------------
     public void printList(){
        
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode= currNode.next;
        }
        System.out.print("NULL");
      
     }
     public int size(){
        return size;
     }

     //Reverse LL by recursion and Ilteration-----------------------------------------
     public Node recursionLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead= recursionLL(head.next);
        head.next.next=head;
        head.next= null;


        return newHead;
     }
     public void reverseIlteration(){
        if(head==null || head.next==null){
            return ;
        }
        Node perNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=perNode;
    
            perNode= currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=perNode;
     }

    public static void main(String arg[]){
        LL list =new LL();
        
        list.addLast("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.reverseIlteration();
        list.printList();
        
        
        System.out.println(list.size);
    }
    
}