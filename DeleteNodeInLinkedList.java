package LeetCodeJune;
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        if(node.next==null){
            node = null;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
}
