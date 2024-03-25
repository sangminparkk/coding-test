package keesun._02_list._03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(4));

        list.removeDuplicates2();
        list.print();
    }



    /**
     * TODO 단일 연결 리스트의 중복 노드 제거
     */

//    public void removeDuplicates() { // 현재 내가 이해한 수준
//        LinkedNode current = this.head;
//        LinkedNode prev = null;
//
//        while (current != null) {
//            if (current.number != prev.number) {
//                current = current.next;
//                current.next = prev;
//            } else {
//                current = current.next;
//                prev = prev.next;
//            }
//        }
//    }

    public void removeDuplicates() {
        LinkedNode current = this.head;
        while (current != null) {
            LinkedNode next = current;
            while (next != null && next.number == current.number) {
                next = next.next;
            }

            // next가 멈췄으면?
            current.next = next;
            current = current.next;

            /**
             * 그동안 헷갈렸던 자바 포인터 개념. (최종정리)
             * 포인터를 업데이트할 때는 왼쪽에 새 참조를 할당하고,
             * 값을 초기화하거나 설정할 때는 오른쪽에 값이나 참조를 할당합니다.
             */
        }
    }
    public void removeDuplicates1() { // prev를 사용한 방법 >> 이전코드를 더 선호하심
        LinkedNode current = this.head;
        LinkedNode prev = this.head;

        while (current != null) {
            if (current.number != prev.number) {
                prev.next = current; // 변할때만 움직임
                prev = current;
            }

            current = current.next;
        }

        if (prev != current) {
            prev.next = null;
        }
    }

    //재귀사용
    public void removeDuplicates2() {
        removeDuplicatesRecursive(this.head);
    }

    private LinkedNode removeDuplicatesRecursive(LinkedNode node) {
        if (node == null) {
            return null;
        }

        if (node.next != null) {
            if (node.number == node.next.number) {
                node.next = node.next.next; // 한칸씩만 줄이기
                removeDuplicatesRecursive(node);
            }

            removeDuplicatesRecursive(node.next);
        }
        return node;
    }

    private void removeDuplicatesBySet() {
        Set<Integer> numberSet = new HashSet<>();

        LinkedNode current = this.head;
        LinkedNode prev = null;

        while (current != null) {
            int currentNumber = current.number;
            if (numberSet.contains(currentNumber)) {
                prev.next = current.next; // skip
            } else {
                numberSet.add(currentNumber);
                prev = current;
            }

            current = current.next;
        }
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


}
