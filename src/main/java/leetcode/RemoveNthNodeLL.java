package leetcode;

public class RemoveNthNodeLL {
    public static void main(String... args) {
        RemoveNthNodeLL obj = new RemoveNthNodeLL();
        ListNode res = (obj.removeNthFromEnd(obj.prepareData(5), 10));
      //  ListNode res = (obj.removeNthFromEnd(obj.prepareData(1), 1));
        while(res != null) {
            System.out.print(" "+res.val);
            res = res.next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int counter = 0;
        ListNode f = head;
        ListNode b = head;
        ListNode p = null;
        while(f.next != null) {
            f = f.next;
            if(++counter >= n) {
                p = b;
                b = b.next;
            }
        }

        if(n > counter+1) {
            return null;
        }
        if(b!= null) {
            if(p==null) {
                return b.next;
            } else {
                p.next = b.next;
            }
        }
        return head;
    }
    private ListNode prepareData(int limit) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for(int i = 2; i <= limit ; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return head;
    }
}


