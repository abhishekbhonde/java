package BinarySearch;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is considered balanced
        }

        // Check the height difference between the left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false; // Height difference is more than 1, tree is not balanced
        }

        // Recursively check if both subtrees are balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0; // An empty subtree has height 0
        }

        // Calculate the height as the maximum height between the left and right subtrees
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes in the binary tree: ");
        int n = scanner.nextInt();

        System.out.println("Enter the values of the nodes in level order (enter -1 for null nodes):");
        TreeNode root = buildTree(scanner, n);

        // Create an instance of BinaryTree
        BinaryTree binaryTree = new BinaryTree();

        // Check if the tree is height balanced
        if (binaryTree.isBalanced(root)) {
            System.out.println("The binary tree is height balanced.");
        } else {
            System.out.println("The binary tree is not height balanced.");
        }
    }

    private static TreeNode buildTree(Scanner scanner, int n) {
        TreeNode[] nodes = new TreeNode[n];
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val != -1) {
                nodes[i] = new TreeNode(val);
            }
        }

        TreeNode root = nodes[0];
        for (int i = 0; i < n; i++) {
            TreeNode currNode = nodes[i];
            if (currNode != null) {
                int leftIndex = 2 * i + 1;
                int rightIndex = 2 * i + 2;
                if (leftIndex < n) {
                    currNode.left = nodes[leftIndex];
                }
                if (rightIndex < n) {
                    currNode.right = nodes[rightIndex];
                }
            }
        }

        return root;
    }
}
