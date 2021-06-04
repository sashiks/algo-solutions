package geeksForgeeks;

import java.util.Stack;

public class ReverseLinkedList {

    public static void main(String... main) {
        ReverseLinkedList obj = new ReverseLinkedList();
        // System.out.println(obj.reverseList(obj.prepareData(5)));
        System.out.println(obj.reverseList2(obj.prepareData(5)));
    }
    private Node prepareData(int limit) {
        Node head = new Node(1);
        Node temp = head;
        for(int i = 2; i <= limit ; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        return head;
    }
    Node reverseList(Node head)
    {
        Node prevNode = null;
        Node currNode = head;
        Node nextNode = head.next;
        while(nextNode != null) {
            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
            currNode.next = prevNode;
        }

        return currNode;
    }
    Node reverseList2(Node head)
    {
        Stack<Node> stack = new Stack<>();
        Node t = head;
        while(t != null) {
            stack.push(t);
            t = t.next;
        }
        Node n = null;
        if(!stack.isEmpty()) {
            n = stack.pop();
            head = n;
            while (!stack.isEmpty()) {
                n.next = stack.pop();
                n = n.next;
            }
        }
        return head;
    }

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
}
