package leetcode;

public class SumLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = null;
        ListNode temp = null;
        ListNode running = null;
        int carry = 0;
        int sum = 0;
        while(true) {
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            if(sum > 9) {
                carry = 1;
                sum = sum-10;
            }  else {
                carry = 0;
            }
            temp = new ListNode(sum);
            if(resultHead == null) {
                resultHead = temp;
                running = resultHead;
            } else {
                running.next = temp;
                running = running.next;
            }

            if(l1 != null)
                l1 = l1.next;

            if(l2!=null)
                l2 = l2.next;
            if(l1 == null && l2 == null && carry == 0) {
                break;
            }

        }
        return resultHead;

    }
    public static void main(String... args) {
       ListNode l1 = prepareData(new int[] {9,9,9,9,9,9,9});
       ListNode l2 = prepareData(new int[] {9,9,9,9});
      System.out.println(new SumLinkedList().addTwoNumbers(l1, l2));
    }
    public static ListNode prepareData(int[] arr) {
        ListNode head = null;
        ListNode running = null;
        ListNode temp;
        for(int i: arr) {
            if(head == null) {
                head = new ListNode(i);
                running = head;
            } else {
                temp = new ListNode(i);
                running.next = temp;
                running = temp;
            }
        }
        return head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }