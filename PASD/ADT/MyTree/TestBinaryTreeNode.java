package PASD.ADT.MyTree;

public class TestBinaryTreeNode {
    public static void main(String[] args) {
        BinaryTreeNode b = new BinaryTreeNode();
        b.setValue(100);
        System.out.println(b.toString());
        System.out.println(b.toStringRecursive());
        System.out.println();
        
        b.setLeft(200);
        b.setRight(300);
        System.out.println(b.toString());
        System.out.println(b.toStringRecursive());
        System.out.println();

        BinaryTreeNode b2 = new BinaryTreeNode(420, b, new BinaryTreeNode(999));
        BinaryTreeNode b3 = new BinaryTreeNode(0, 7, null);
        b2.getLeft().setLeft(b3);
        System.out.println(b2.toString());
        System.out.println(b2.toStringRecursive());
    }
}
