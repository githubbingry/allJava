package PASD.ADT.MyTree;

public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode right;
    private BinaryTreeNode left;
    
    public BinaryTreeNode(){
        this.value = 0;
        this.right = null;
        this.left= null;
    }
    
    public BinaryTreeNode(int value){
        this.value = value;
        this.right = null;
        this.left= null;
    }
    
    public BinaryTreeNode(int value, int right, int left){
        this.value = value;
        this.right = new BinaryTreeNode(right);
        this.left = new BinaryTreeNode(left);
    }

    public BinaryTreeNode(int value, BinaryTreeNode right, BinaryTreeNode left){
        this.value = value;
        this.right = right;
        this.left = left;
    }
    
    public BinaryTreeNode(int value, int right, BinaryTreeNode left){
        this.value = value;
        this.right = new BinaryTreeNode(right);
        this.left = left;
    }

    public BinaryTreeNode(int value, BinaryTreeNode right, int left){
        this.value = value;
        this.right = right;
        this.left = new BinaryTreeNode(left);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getRight() {
        return this.right;
    }

    public void setRight(int right) {
        BinaryTreeNode newRight = new BinaryTreeNode(right);
        this.right = newRight;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode getLeft() {
        return this.left;
    }

    public void setLeft(int left) {
        BinaryTreeNode newLeft = new BinaryTreeNode(left);
        this.left = newLeft;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public String toString(){
        return String.format("[value=%d, right=%s, left=%s]"
            , this.value
            , this.right == null ? "null" : this.right.getValue()
            , this.left == null ? "null" : this.left.getValue()
        );
    }

    public String toStringRecursive(){
        return String.format("""
                [rootValue=%d,
                right=%s,
                left= %s
                ]"""
            , this.value
            , this.right == null ? "null" : this.right.toStringRecursive(1)
            , this.left == null ? "null" : this.left.toStringRecursive(1)
        );
    }

    private String toStringRecursive(int n){
        String space = countSpace(n);
        return String.format("""
                [value=%d,
                %sright=%s,
                %sleft= %s
                %s]"""
            , this.value
            , space, this.right == null ? "null" : this.right.toStringRecursive(n+1)
            , space, this.left == null ? "null" : this.left.toStringRecursive(n+1)
            , space
        );
    }

    private String countSpace(int n){
        String s = "";
        for(int i = 0; i < n; i++){
            s += "      "; //6 whitespace
        }
        return s;
    }
}
