
# Tree
is a collection of nodes (vertices) linked by edges (pointers) creating hierarchical connections between nodes.  

Root - node that doesn't have incoming link (i.e. no parent node)  
Leaf - has a parent node, but doesn't have children (endpoint of a tree)  
Depth of a node is number of edges between that node and the root.  
Height is number of edges in the longest path from a node to a leaf node. 
Height of a tree is a height of its root node. 
Degree of a node refers to the number of sub-trees. 

## Balanced tree
A tree where the heights of subtrees for each node doesn't exceed one. (i.e. almost at the same level) 

# Types of Binary Trees
- **Complete Binary Tree** exist when its every level except the last one is filled, and all the nodes on the last level are as far left as they can be. 
- **Full Binary Tree** exists when every node, excluding leaves, has **exactly two children**. Every level must be filled, and the nodes are as far left as possible.
- Perfect Binary Tree should be both full and complete. All interior nodes should have two children, and all leaves must have the same depth.

## Binary Search Tree (BST)
A binary tree where each node has a key and associated value. 
### constraints:
- left subtree should have nodes with fewer keys then node's key, the right ones should be greater. 


## AVL Tree (Adelson-Velsky and Landis, 1962)
- Type of BST that is self-balanced by checking the balance factor of each node (+1, 0, -1).
- The maximum height difference between left and right sub-trees can only be one, otherwise it should be rebalanced with rotation techniques to become valid. 


## Red-Black Tree
Another type of self-balancing BST, plus:
- The root is always black
- Two red nodes cannot be adjacent (i.e. a red parent cannot have a red child)
- A path from the root to a leaf should contain the same number of black nodes
- A null node is black

## 2-3 Trees
is a self-balancing, ordered, multiway search tree.    
It is always perfectly balanced, so every leaf node is equidistant from the root. Every node, other than leaf nodes, can be either a 2-Node (a node with a single data element and two children) or a 3-node (a node with two data elements and three children). A 2-3 tree will remain balanced no matter how many insertions or deletions occur.

---

# Tree Traversal
## Depth-First Search
- **Inorder**. Think of this as moving up the tree, then back down. You traverse the left child and its sub-tree until you reach the root. Then, traverse down the right child and its subtree.
- **Preorder**. You start at the root, traverse the left sub-tree, and then move over to the right sub-tree. This is a depth-first traversal.
- **Postorder**. Begin with the left-sub tree and move over to the right sub-tree. Then, move up to visit the root node. This is a depth-first traversal.

## Breadth-First Search 
- **Level order**. Think of this as a sort of zig-zag pattern. This will traverse the nodes by their levels instead of subtrees. First, we visit the root and visit all children of that root, left to right. We then move down to the next level until we reach a node that has no children. This is the left node. 





