package keesun._05_tree._01;

class Node {

    int value;
    Node left, right, root;

    public Node(int value) {
        this.value = value;
    }

}

public class PostOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        PostOrder postOrder = new PostOrder();
        postOrder.print(root, 4);
    }

    private int count = 0; // count > find an index

    public void print(Node root, int index) {
        if (root != null) {
            // 후위탐색
            print(root.left, index);
            print(root.right, index);
            if (count++ == 4) {
                System.out.println(root.value);
            }
        }
    }


    public int solution(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = solution(root.left);
        int rightDepth = solution(root.right);

        if (leftDepth > rightDepth) {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;
        }

    }

}
