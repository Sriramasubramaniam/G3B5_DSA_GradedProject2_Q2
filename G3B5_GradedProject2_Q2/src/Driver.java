import RemoveLeftNodes.RemoveLeftNodes;

import Tree.Tree;

public class Driver {
    public static void main(String[] args) {
        RemoveLeftNodes removeLeftNodes = new RemoveLeftNodes();
        Tree root = new Tree(50);
        root.leftNode = new Tree(30);
        root.rightNode = new Tree(60);
        root.leftNode.leftNode = new Tree(10);
        root.rightNode.leftNode = new Tree(55);

        Tree leastNode = removeLeftNodes.modifyToRemoveLeftNodes(root);
        removeLeftNodes.printRightSkewedTree(leastNode);
    }
}
