package keesun._05_tree;

import java.util.Stack;

class Node {
    int value;
    Node root;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}

public class TreeIntro {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        TreeIntro treeIntro = new TreeIntro();
        treeIntro.ldr2(root);
    }

    // 재귀는 이게 끝
    private void ldr1(Node root) {
        if (root != null) {
            ldr1(root.left);
            System.out.println(root.value); // 본인 돌아오고
            ldr1((root.right));
        }
    }

    // iterative 할때 > 와 stack으로 충분히 표현가능
    private void ldr2(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();

        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            if (stack.isEmpty()) {
                break;
            }

            root = stack.pop();
            System.out.println(root.value);
            root = root.right;
        }


    }




}
