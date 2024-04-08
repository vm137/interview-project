package main.yandex.trees;

public class BinaryTree {

  public static void main(String[] args) {

  }
  Node root;

  public void add(int value) {
    root = addRecursive(root, value);
  }

  /**
   * if the new node’s value is lower than the current node’s, we go to the left child
   * if the new node’s value is greater than the current node’s, we go to the right child
   * when the current node is null, we’ve reached a leaf node and we can insert the new node in that position
   */
  private Node addRecursive(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.value) {
      current.left = addRecursive(current.left, value);
    } else if (value > current.value) {
      current.right = addRecursive(current.right, value);
    } else {
      // value already exists
      return current;
    }

    return current;
  }
}
