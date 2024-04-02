package keesun._05_tree._03;

import java.util.ArrayList;
import java.util.List;

public class FindLCA1 {
    private static class Node {
        int value;

        Node left, right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        FindLCA1 findLCA = new FindLCA1();
        System.out.println(findLCA.solution(root, 4, 5));

    }

    public Node solution(Node node, int n1, int n2) {
        if (node == null) {
            return null;
        }

        if (node.value == n1 || node.value == n2) {
            return node;
        }

        Node leftCLA = solution(node.left, n1, n2);
        Node rightCLA = solution(node.right, n1, n2);

        if (leftCLA != null && rightCLA != null) {
            return node;
        }

        return leftCLA != null ? leftCLA : rightCLA;
    }

    private boolean findPath(Node node, int number, List<Node> path) {
        if (node == null) {
            return false;
        }

        path.add(node);

        if (node.value == number) {
            return true;
        }

        if (findPath(node.left, number, path)) {
            return true;
        }

        if (findPath(node.right, number, path)) {
            return true;
        }

        path.remove(node);
        return false;
    }
}
