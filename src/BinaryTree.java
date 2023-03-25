/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silvi
 * @param <E>
 */
public class BinaryTree<E>
{
 
    protected E val; 
   
    private BinaryTree<E> parent; 
   
    private BinaryTree<E> left, right; 
   
    private Association<String,String> word;
    

    public BinaryTree(E value)
    {
        
        val = value;
        right = left = new BinaryTree<>();
        setLeft(left);
        setRight(right);
    }

 
    public BinaryTree(BinaryTree right, BinaryTree left,String wordIng, String wordEsp)
    {
       super();   //
       this.right=right;
       this.left=left;
       word = new Association<>(wordIng,wordEsp);
       
    }

    private BinaryTree() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public BinaryTree<E> getLeft()
    {
        return left;
    }

   
    public BinaryTree<E> getRight()
    {
        return right;
    }

 
    public BinaryTree<E> parent()
    {
        return parent;
    }
    
   
    void setLeft(BinaryTree newLeft)
    {     
        left = newLeft;    
    }

    void setRight(BinaryTree<E> newRight)
    {
        right = newRight;
    }

  
    protected void setParent(BinaryTree<E> newParent)
    {
        if (!isEmpty()) {
            parent = newParent;
        }
    }
    
    public void setWordIng(String newWordIng){
        word.setKey(newWordIng);
    }
    
    public void setWordEsp(String newWordEsp){
        word.setValue(newWordEsp);
    }
    
    public String getWordIng(){
        return word.getKey();
    }
    
    public String getWordEsp(){
        return word.getValue();
    }
    /**
     *
     * @post 
     * @return
     */
    public int size()
    {
        if (isEmpty()) return 0;
        return getLeft().size() + getRight().size() + 1;
    }

    /**
     *
     * @post 
     * @return
     */
    public BinaryTree<E> root()
    {
        if (parent() == null) return this;
        else return parent().root();
    }

   
    public int height()
    {
        if (isEmpty()) return -1;
        return 1 + Math.max(left.height(),right.height());
    }

    
    public int depth()
    {
        if (parent() == null) return 0;
        return 1 + parent.depth();
    }


    /**
     * Returns true if tree is empty.
     * @post 
     * @return 
     */
    public boolean isEmpty()
    {
        return val == null;
    }
    

    public boolean isComplete()
    {
        int leftHeight, rightHeight;
        boolean leftIsFull, rightIsFull;
        boolean leftIsComplete, rightIsComplete;
        
        if (isEmpty()) return true;
        leftHeight = getLeft().height();
        rightHeight = getRight().height();
        leftIsComplete = getLeft().isComplete();
        rightIsComplete = getRight().isComplete();
        return false;
    }


    /**
     * @post 
     * 
     * @return
     */
    public boolean isLeftChild()
    {
        if (parent() == null) return false;
        return this == parent().getLeft();
    }


    public boolean isRightChild()
    {
        if (parent() == null) return false;
        return this == parent().getRight();
    }

   
    public E getValue()
    {
        return val;
    }

   
   
    public void setValue(E value)
    {
        val = value;
    }
    
   
    public String treeString(){
        String s = "";
        for (int i=0; i < this.depth(); i++){
            s += "\t|";
        }
        
        s += ("<" + val + " : " + getHand() + ">\n");
        
        if (!left.isEmpty()) s += left.treeString();
        if (!right.isEmpty()) s += right.treeString();

        return s;
    }
    


    private String getHand(){
        if (isRightChild()) return "R";
        if (isLeftChild()) return "L";
        return "Root";  
    }
    
}



