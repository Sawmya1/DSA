/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//  class ListNode{
//     public int data;
//     public ListNode next;
//     public ListNode(int data, ListNode next){
//         this.data = data;
//         this.next = next;
//     }
//     public ListNode(int data){
//         this.data = data;
//         this.next = null;
//     }
//  }
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        Map<ListNode,Integer> np = new HashMap<>();
        while(temp != null){
            if(np.containsKey(temp))
            return true;

            np.put(temp,1);
            temp = temp.next;
        }

        return false;
    }
}