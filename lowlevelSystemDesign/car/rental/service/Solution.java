package car.rental.service;



class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

   public static ListNode reverse(ListNode root){
       if(root == null) return root;
       ListNode curr = root, next = root, prev = null;
       while(curr.next != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }

       return prev;
   }
   
   public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode ptr1 = reverse(l1);
      ListNode ptr2 = reverse(l2);
      ListNode ptr = null;
      ListNode listSum = ptr;
     
      int carry = 0;
      int sum = 0;
      while(ptr1 != null && ptr2 != null){
          sum = sum +  carry + ptr1.val + ptr2.val;
          if(ptr == null){
              ptr = new ListNode(sum % 10);
              listSum = ptr;
          }else{
              ptr.next = new ListNode(sum % 10);
              ptr = ptr.next;
          }
          carry = sum / 10;
          ptr1 = ptr1.next;
          ptr2 = ptr2.next;
      }

      while(ptr1 != null){
           sum+=carry + ptr1.val;
          if(ptr == null){
              ptr = new ListNode(sum % 10);
              listSum = ptr;
          }else{
               ptr.next = new ListNode(sum % 10);
               ptr = ptr.next;
               carry = sum/10;
               ptr1 = ptr1.next;
          }
      }

      while(ptr2 != null){
           if(ptr == null){
              ptr = new ListNode(sum % 10);
              listSum = ptr;
          }else{
               sum+=carry + ptr2.val;
               ptr.next = new ListNode(sum % 10);
               ptr = ptr.next;
               carry = sum/10;
               ptr2 = ptr2.next;
          }
      }
      
      return reverse(listSum);

   }
   
   public static void main(String[] args) {
   	ListNode l1 = new ListNode(2);
   	l1.next = new ListNode(4);
   	l1.next.next = new ListNode(3);
   	
   	ListNode l2 = new ListNode(5);
   	l2.next = new ListNode(6);
   	l2.next.next = new ListNode(4);
   	
   	addTwoNumbers(l1, l2);
   	
   }
}
