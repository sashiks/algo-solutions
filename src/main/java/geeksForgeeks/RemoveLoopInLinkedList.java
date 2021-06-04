package geeksForgeeks;

import java.util.HashSet;
import java.util.Set;

public class RemoveLoopInLinkedList {
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Set<Integer> set = new HashSet<>();
        Node runNode = head;
        while(runNode.next != null) {
            if(set.contains(runNode.next.data)) {
                runNode.next = null;
                break;
            }
            set.add(runNode.data);
            runNode = runNode.next;
        }

    }

    public static void main(String... args) {
        RemoveLoopInLinkedList obj = new RemoveLoopInLinkedList();
        Node head = obj.prepareData();
        //36 24 25 30 71 3 61 22 10 67 73 22 43 41 78 24 42 2 70 71 66 37 48 38 75 51 27 45 58 15 49 46 39 73 27 61 27 7 35 37 73 59 10 67 51 8 11 12 41 32 34 58 68 33 47 15 36 73 11 13 40 11 10 30 35 36 42 61 74 28 49 19 7 11 5 57 18 47 21 10 78 6 20 18 39 66 64 74 59 74 38 50 4 48 79 38 35 72 50 61 20 19 79 26 29 35 34 78 2 54 39 31 60 58 80 50 44 63 75 54 8 32 23 43 31 53 32 18 76 2 78 15 52 28 72 32 62 58 61 15 31 19 46 42 77 77 43 72 60 37 45 19 21 19 62 51 23 13 20 18 46 17 65 17 44 8 80 58 65 6
        removeLoop(head);
    }

    public  Node prepareData(){
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        return head;
    }
    public  Node prepareData(int[] arr){
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        return head;
    }

    class Node
    {
        int data;
        Node next;
        public Node(int d) {
            this.data = d;
        }
    }
}
