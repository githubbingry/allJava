package coba;
 
public class BinarySearchTree {
 
    // Class containing left
    // and right child of current node
    // and key value
    class Node {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    BinarySearchTree() { root = null; }
 
    BinarySearchTree(int value) { root = new Node(value); }
 
    // This method mainly calls insertRec()
    void insert(int key) { root = insertRec(root, key); }
 
    // A recursive function to
    // insert a new key in BST
    Node insertRec(Node root, int key)
    {
        // If the tree is empty,
        // return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        // Otherwise, recur down the tree
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        // Return the (unchanged) node pointer
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder() { inorderRec(root); }
 
    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // This method mainly calls InorderRec()
    void preOrder() { preOrderRec(root); }
 
    // A utility function to
    // do inorder traversal of BST
    void preOrderRec(Node root)
    {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    void postOrder() { postOrderRec(root); }
 
    // A utility function to
    // do inorder traversal of BST
    void postOrderRec(Node root)
    {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(45);
        tree.insert(55);
        tree.insert(60);
        tree.insert(70);
        tree.insert(40);
        tree.insert(35);
        tree.insert(30);
        tree.insert(20);
        tree.insert(80);
        tree.insert(75);
 
        // Print inorder traversal of the BST
        System.out.print("preorder ");
        tree.preOrder();
        System.out.print("\ninorder ");
        tree.inorder();
        System.out.print("\npostorder ");
        tree.postOrder();
    }
}
 
// This code is contributed by Ankur Narain Verma