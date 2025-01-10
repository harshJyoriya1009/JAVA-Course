import java.util.*;
public class ListNode {
    ListNode next;

    class Solution{
        public ListNode removeNthTerm(ListNode head, int n){
            if(head.next==null){
                return null;
            }

            int size=0; 
            ListNode curr=head;
            while(curr !=head){
                curr=curr.next;
                    size++;
                    
            }
            if(n==size){
                return head.next;
            }
            int indexToSearch=size-n;
            ListNode prev=head;
            int i=1; while(i<indexToSearch){
                prev= prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return head;
        }
    }
    
}
