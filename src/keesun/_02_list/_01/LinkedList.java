package keesun._02_list._01;

public class LinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));

//        list.print();
        list.reverse1();
        list.print();
    }

    private void print() {
        LinkedNode nodeToPrint = this.head; // 변수명명법도 중요!
        while (nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node; // tail.next = 빈공간
            tail = tail.next;
        }
    }

    /**
     * TODO 단일 연결 리스트를 뒤집는 함수를 구현하라.
     */

    private void reverse() {
        LinkedNode current = this.head; // head부터 바꿀거라서
        LinkedNode prev = null;
        LinkedNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next; // 다 끝이 나면 current는 null이 됨
        }

        // 마지막에 클래스가 들고 있는 멤버변수까지 바꿔준다
        this.tail = this.head;
        this.head = prev;
    }

    private void reverse1() { // 일반재귀
        LinkedNode head = this.head;
        this.head = reverseRecursive(head); // 3
        this.tail = head; // 원래 헤드였던 1이 tail이 됨)
    }

    private LinkedNode reverseRecursive(LinkedNode node) {
        // 재귀 중요 포인트 : 종료조건
        if (node == null || node.next == null) {
            return node; //더이상 바꿀게 없으니 그냥 해당 노드를 리턴
        }


        LinkedNode newHead = reverseRecursive(node.next); // newHead는 계속해서 3이 넘어옴
        node.next.next = node;
        node.next = null;

        return newHead;
    }

}
