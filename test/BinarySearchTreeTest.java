/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author silvi
 */


public class BinarySearchTreeTest {

	BinarySearchTree bt = new BinarySearchTree();
	Association<String,String> asociacion1 = new Association<>("Hi", "Hola");
	Association<String,String> asociacion2 = new Association<>("Bye", "Adi�s");
	
	
	public void testLocate(){
		BinaryTree<Association<String,String>> root = new BinaryTree<>();	
		
		root.setValue(asociacion1);
		BinaryTree<Association<String, String>> encontrar = bt.locate(root, "Hi");
		
		int valor = 0;
		if(encontrar != root){
			valor = 1;
		} else {
			valor = 2;
		}
		assertEquals(2, valor,0);
			
	}
	
	public void testAdd(){
		
		bt.add(asociacion1);
		bt.add(asociacion2);
		assertEquals(2, bt.getWordsQuantity(),0);
		
	}
	
	

}
