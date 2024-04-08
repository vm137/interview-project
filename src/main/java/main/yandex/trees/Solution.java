package main.yandex.trees;

/**
 * Implementing a Binary Tree
 * <a href="https://www.baeldung.com/java-binary-tree">[link]</a>
 */
public class Solution {
  public static void main(String[] args) {
    createBinaryTree();
  }

  private static BinaryTree createBinaryTree() {
    BinaryTree bt = new BinaryTree();

    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    return bt;
  }
}
