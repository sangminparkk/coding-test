package keesun._05_tree._02;

import java.util.HashMap;
import java.util.Map;

public class BuildTree {

    private static class Node {
        int value;

        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        BuildTree buildTree = new BuildTree();
        Node root = buildTree.build(new int[]{4, 2, 5, 1, 6, 3}, new int[]{1, 2, 4, 5, 3, 6});// InOrder, PreOrder
        printInOrder(root);
    }

    private static void printInOrder(Node root) {
        // LDR
        if (root != null) {
            printInOrder(root.left);
            System.out.println(root.value);
            printInOrder(root.right);
        }
    }

    private Node build(int[] inOrder, int[] preOrder) {
        for (int i = 0; i < inOrder.length; i++) {
            indexMap.put(inOrder[i], i);
        }

        // 재귀는 항상 종료조건 > 재귀 만드려면 index를 따져봐야함
        return buildRecurse(inOrder, preOrder, 0, inOrder.length - 1);
    }

    int preIndex = 0; // 재귀돌때마다 인덱스를 하나씩 만들어감

    Map<Integer, Integer> indexMap = new HashMap<>();

    private Node buildRecurse(int[] inOrder, int[] preOrder, int startIndex, int endIndex) {
        if (startIndex > endIndex) { // 6~5
            return null;
        }

        Node node = new Node(preOrder[preIndex++]);

        if (startIndex == endIndex) { // 얘는 leaf인 경우
            return node;
        }

//        int inIndex = searchIndex(inOrder, node.value);
        int inIndex = indexMap.get(node.value);
        node.left = buildRecurse(inOrder, preOrder, startIndex, inIndex - 1); // 3보다 하나 작은거
        node.right = buildRecurse(inOrder, preOrder, inIndex + 1, endIndex);

        return node;
    }

//    private int searchIndex(int[] inOrder, int value) { // 재귀하면서 또 순회 >> O(n^2)
//        for (int i = 0; i < inOrder.length; i++) {
//            if (inOrder[i] == value) {
//                return i;
//            }
//        }
//
//        return 0;
//    }
}
