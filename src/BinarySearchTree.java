/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silvi
 * @param <E>
 */
public class BinarySearchTree<E>{
	private BinaryTree root;
        private String translation;
	
        Comparator cmp = new Comparator();	
        int counter = 0;
	
	
	
	public void add(BinaryTree parent, String wordIng, String wordEsp){
		
		if(root==null){	
                    counter++;
                        System.out.println("Agregando RAIZ "+wordIng+", "+wordEsp);
                    root= new BinaryTree(null,null, wordIng, wordEsp);
		} else {
                    if (cmp.equal(parent.getWordEsp(), wordEsp)==1 ){
                                    if(parent.getLeft()==null){
			System.out.println("Agregando "+wordIng+ " a la izquierda de "+parent.getWordIng());
                                        parent.setLeft(new BinaryTree(null,null, wordIng, wordEsp));
                        counter++;
                                    }else{
                                        add(parent.getLeft(), wordIng, wordEsp);
                                    }
                                }else {
                            if(parent.getRight()==null){
                                System.out.println("Agregando "+wordIng +" a la derecha de "+parent.getWordIng());
                                parent.setRight(new BinaryTree(null,null, wordIng, wordEsp));
			counter++;                            
                                     }else{
                                          add(parent.getRight(), wordIng, wordEsp);
                            }
                        }
		}
	}

        public BinaryTree getRoot(){
            return root;
        }
        public void setRoot(BinaryTree newRoot){
            root = newRoot;
        }
        
        public void search(BinaryTree parent, String wordIng){
            if(parent == null)return;
            search(parent.getLeft(), wordIng);
            if(parent.getWordIng().equalsIgnoreCase(wordIng)){
                translation=parent.getWordEsp();
            }
            search(parent.getRight(), wordIng);
        }
       
	
        public E getTraduccion() {
	return (E) translation;
	}
public void setTraduccion(String newTraduccion) {
	translation = newTraduccion;
	}
	
public int getWordsQuantity(){
    return counter;
	}	

    void addTranslation(String ingles, String espanol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTranslation(String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void add(Association<String, String> asociacion1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    BinaryTree<Association<String, String>> locate(BinaryTree<Association<String, String>> root, String hi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
