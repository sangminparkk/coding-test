package keesun._02_list._02;

import java.util.HashMap;
import java.util.Map;

public class LinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(5));
        list.add(new LinkedNode(6));

        list.print();
        System.out.println("=====");
//        System.out.println(list.findFromLast(2).number);
        System.out.println(list.findFromLast3(2).number);
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
     * TODO 단일 연결 리스트의 끝에서 n번재 위치한 노드를 찾는 함수
     */

    private LinkedNode findFromLast(int n) {

        Map<Integer, LinkedNode> nodeMap = new HashMap<>();
        int index = 0; // index 필요
        LinkedNode current = this.head;
        while (current != null) {
            nodeMap.put(index++, current);
            current = current.next; // 포인터
        }

        int indexToFind = nodeMap.size() - n;
        return nodeMap.get(indexToFind);
    }

    private LinkedNode findFromLast2(int n) {
        LinkedNode current = this.head;

        // 순회 -> size를 찍어야하므로 Map or List를 사용해야하지 않는 방법이 있구나..
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }

        // length -2 에 해당되는 value
        int targetIndex = length - n;

        // 실제로 가면 됨
        LinkedNode target = this.head;
        while (targetIndex > 0) {
            targetIndex--;
            target = target.next;
        }
        return target;
    }

    private LinkedNode findFromLast3(int n) {
        LinkedNode left = this.head, right = this.head;
        int count = 0; // 집게 사이

        while (right.next != null) {
            if (count == n - 1) { // 우리가 원하는 간격에서는 같이 움직임
                left = left.next;
                right = right.next;
            } else if(count < n) { // 일단 right만 가다가
                count++;
                right = right.next;
            }
        }

        return left;
    }


}
