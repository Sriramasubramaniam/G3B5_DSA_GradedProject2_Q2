package RemoveLeftNodes;

import Tree.Tree;

import java.util.ArrayList;

public class RemoveLeftNodes {
    Tree prevNode = null;
    Tree leastNode = null;
    public Tree modifyToRemoveLeftNodes(Tree root){
        if (root == null) {
            return null;
        }
        Tree tempLeft = root.leftNode;
        Tree tempRight = root.rightNode;
        modifyToRemoveLeftNodes(tempLeft);

        if(leastNode == null)
        {
            leastNode = root;
        }
        else
        {
            prevNode.rightNode = root;
        }
        root.leftNode = null;
        prevNode = root;
        modifyToRemoveLeftNodes(tempRight);
        return leastNode;
    }

    public void printRightSkewedTree(Tree root){
        if(root==null){
            return;
        }
        System.out.print(root.data+ " ");
        printRightSkewedTree(root.rightNode);
    }
}
