/*
 * Visit current node
   Traverse left subtree
   Traverse right subtree
 */

public void traversePreOrder(Node node) {
    if (node != null) {
        visit(node.value);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}