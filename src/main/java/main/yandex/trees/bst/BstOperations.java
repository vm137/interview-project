package main.yandex.trees.bst;


import main.yandex.trees.Node;

public class BstOperations {
  public static void main(String[] args) {
    BstOperations ms = new BstOperations();
    Node root = ms.createBST();
//    System.out.println(root.getValue());

    ms.traverse1(root);

  }

  public void traverse1(Node node) {
    System.out.println(node.getValue());
    if (node.getLeft() != null) {
      traverse1(node.getLeft());
    }
    if (node.getRight() != null) {
      traverse1(node.getRight());
    }
  }

  public Node createBST() {
    Node node3 = new Node(3);
    Node node5 = new Node(5);
    Node node4 = new Node(4, node3, node5);

    Node node7 = new Node(7);
    Node node9 = new Node(9);
    Node node8 = new Node(8, node7, node9);

    Node root = new Node(6, node4, node8);
    return root;
  }
}
