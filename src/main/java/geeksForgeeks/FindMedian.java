package geeksForgeeks;

public class FindMedian {
    private static Node head;
    private static Node tail;
    private static int size;
    public static void main(String... args) {
        insertHeap(9384);
        System.out.println(getMedian());
        insertHeap(887);
        System.out.println(getMedian());
        insertHeap(2778);
        System.out.println(getMedian());
        insertHeap(6916);
        System.out.println(getMedian());
        insertHeap(7794);
        System.out.println(getMedian());
        insertHeap(8336);
        System.out.println(getMedian());
        insertHeap(5387);
        System.out.println(getMedian());
        /*insertHeap(493);
        System.out.println(getMedian());
        insertHeap(6650);
        System.out.println(getMedian());
        insertHeap(1422);
        System.out.println(getMedian());
        insertHeap(2363);
        System.out.println(getMedian());
        insertHeap(28);
        System.out.println(getMedian());
        insertHeap(8691);
        System.out.println(getMedian());
        insertHeap(60);
        System.out.println(getMedian());
        insertHeap(7764);
        System.out.println(getMedian());
        insertHeap(3927);
        System.out.println(getMedian());
        insertHeap(541);
        System.out.println(getMedian());
        insertHeap(3427);
        System.out.println(getMedian());
        insertHeap(9173);
        System.out.println(getMedian());
        insertHeap(5737);
        System.out.println(getMedian());
        insertHeap(5212);
        System.out.println(getMedian());
        insertHeap(5369);
        System.out.println(getMedian());
        insertHeap(2568);
        System.out.println(getMedian());
        insertHeap(6430);
        System.out.println(getMedian());
        insertHeap(5783);
        System.out.println(getMedian());
        insertHeap(1531);
        System.out.println(getMedian());
        insertHeap(2863);
        System.out.println(getMedian());
        insertHeap(5124);
        System.out.println(getMedian());
        insertHeap(4068);
        System.out.println(getMedian());
        insertHeap(3136);
        System.out.println(getMedian());
        insertHeap(3930);
        System.out.println(getMedian());
        insertHeap(9803);
        System.out.println(getMedian());
        insertHeap(4023);
        System.out.println(getMedian());
        insertHeap(3059);
        System.out.println(getMedian());
        insertHeap(3070);
        System.out.println(getMedian());
        insertHeap(8168);
        System.out.println(getMedian());
        insertHeap(1394);
        System.out.println(getMedian());
        insertHeap(8457);
        System.out.println(getMedian());
        insertHeap(5012);
        System.out.println(getMedian());
        insertHeap(8043);
        System.out.println(getMedian());
        insertHeap(6230);
        System.out.println(getMedian());
        insertHeap(7374);
        System.out.println(getMedian());
        insertHeap(4422);
        System.out.println(getMedian());
        insertHeap(4920);
        System.out.println(getMedian());
        insertHeap(3785);
        System.out.println(getMedian());
        insertHeap(8538);
        System.out.println(getMedian());
        insertHeap(5199);
        System.out.println(getMedian());
        insertHeap(4325);
        System.out.println(getMedian());
        insertHeap(8316);
        System.out.println(getMedian());
        insertHeap(4371);
        System.out.println(getMedian());
        insertHeap(6414);
        System.out.println(getMedian());
        insertHeap(3527);
        System.out.println(getMedian());
        insertHeap(6092);
        System.out.println(getMedian());
        insertHeap(8981);
        System.out.println(getMedian());
        insertHeap(9957);
        System.out.println(getMedian());
        insertHeap(1874);
        System.out.println(getMedian());
        insertHeap(6863);
        System.out.println(getMedian());
        insertHeap(9171);
        System.out.println(getMedian());
        insertHeap(6997);
        System.out.println(getMedian());
        insertHeap(7282);
        System.out.println(getMedian());
        insertHeap(2306);
        System.out.println(getMedian());
        insertHeap(926);
        System.out.println(getMedian());
        insertHeap(7085);
        System.out.println(getMedian());
        insertHeap(6328);
        System.out.println(getMedian());
        insertHeap(337);
        System.out.println(getMedian());
        insertHeap(6506);
        System.out.println(getMedian());
        insertHeap(847);
        System.out.println(getMedian());
        insertHeap(1730);
        System.out.println(getMedian());
        insertHeap(1314);
        System.out.println(getMedian());
        insertHeap(5858);
        System.out.println(getMedian());
        insertHeap(6125);
        System.out.println(getMedian());
        insertHeap(3896);
        System.out.println(getMedian());
        insertHeap(9583);
        System.out.println(getMedian());
        insertHeap(546);
        System.out.println(getMedian());
        insertHeap(8815);
        System.out.println(getMedian());
        insertHeap(3368);
        System.out.println(getMedian());
        insertHeap(5435);
        System.out.println(getMedian());
        insertHeap(365);
        System.out.println(getMedian());
        insertHeap(4044);
        System.out.println(getMedian());
        insertHeap(3751);
        System.out.println(getMedian());
        insertHeap(1088);
        System.out.println(getMedian());
        insertHeap(6809);
        System.out.println(getMedian());
        insertHeap(7277);
        System.out.println(getMedian());
        insertHeap(7179);
        System.out.println(getMedian());
        insertHeap(5789);
        System.out.println(getMedian());
        insertHeap(3585);
        System.out.println(getMedian());
        insertHeap(5404);
        System.out.println(getMedian());
        insertHeap(2652);
        System.out.println(getMedian());
        insertHeap(2755);
        System.out.println(getMedian());
        insertHeap(2400);
        System.out.println(getMedian());
        insertHeap(9933);
        System.out.println(getMedian());
        insertHeap(5061);
        System.out.println(getMedian());
        insertHeap(9677);
        System.out.println(getMedian());
        insertHeap(3369);
        System.out.println(getMedian());
        insertHeap(7740);
        System.out.println(getMedian());
        insertHeap(13);
        System.out.println(getMedian());
        insertHeap(6227);
        System.out.println(getMedian());
        insertHeap(8587);
        System.out.println(getMedian());
        insertHeap(8095);
        System.out.println(getMedian());
        insertHeap(7540);
        System.out.println(getMedian());
        insertHeap(796);
        System.out.println(getMedian());
        insertHeap(571);
        System.out.println(getMedian());*/
    }
    public static void insertHeap(int x) {
       if(head == null) {
           head = new Node(x);
           tail = head;
           size = 1;
       } else {
           size++;
           if(x >= tail.val) {
               tail.next = new Node(x);
               tail = tail.next;
           } else if (x < head.val) {
               Node n = new Node(x);
               n.next = head;
               head = n;
           } else {
               Node prev = head;
               Node next = prev.next;
               while(next != null) {
                   if(x < next.val) {
                       Node n = new Node(x);
                       n.next = prev.next;
                       prev.next = n;
                       break;
                   }
                   prev = prev.next;
                   next = next.next;
               }
           }
       }
    }

    public static double getMedian() {
      if(size % 2 == 1) {
          int m = size/2 +1;
          int i = 0;
          Node n = head;
          while(n != null) {
              if(++i == m) {
                  return n.val;
              }
              n = n.next;
          }
      } else {
          int m = size/2;
          int i = 0;
          Node n = head;
          while(n != null) {
              if(++i == m) {
                  return (n.val + n.next.val)/2;
              }
              n = n.next;
          }
      }
      return 0;
    }
    static class Node {
        Node next;
        int val;
        Node(int val) {
            this.val = val;
        }
    }
}
