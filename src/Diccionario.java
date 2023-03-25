/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silvi
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Diccionario {
 BinarySearchTree BST = new BinarySearchTree();
    public void leer(){
        try{
			String linea;
            try (BufferedReader doc = new BufferedReader(new FileReader("diccionario.txt"))) {
                while((linea = doc.readLine()) != null ){
                    String ingles=" ";
                    String espanol=" ";
                    
                    System.out.println(linea);
                    int contador = 0;
                    while(contador<linea.length()){
                        if(linea.charAt(contador)=='('){
                            while(true){
                                contador=contador+1;
                                if(linea.charAt(contador)==',')
                                    break;
                                ingles+=linea.charAt(contador);
                                
                            }
                        }
                        if(linea.charAt(contador)==' ')
                            while(true){
                                contador=contador+1;
                                if(linea.charAt(contador)==')')
                                    break;
                                espanol+=linea.charAt(contador);
                                
                            }
                        BST.addTranslation(ingles, espanol);
                        contador=contador+1;
                    }
                    
                    //Association association = new Association(ingles,espanol);
                    System.out.println("Se agregó" + ingles + " y" + espanol);
                    
                }
            }
		}
		catch(IOException io){
			System.out.println("Error, ha ocurrido un problema en lectura del documento u operacion");
	
		}
		
		
	try{
			String linea;
			String texto=" ";
            try (BufferedReader doc2 = new BufferedReader(new FileReader("texto.txt"))) {
                System.out.print("Original: ");
                while((linea = doc2.readLine()) != null ){
                    int contador2=0;
                    String palabra="";
                    System.out.println(linea);
                    
                    while(contador2<linea.length()){
                        
                        
                        if(linea.charAt(contador2)!=' ' & linea.charAt(contador2)!='.'){
                            palabra+=linea.charAt(contador2);
                            
                        }
                        
                        else{
                            
                            System.out.println(palabra + " " + BST.getTranslation(palabra));
                            //System.out.println(palabra);
                            palabra = '*'+palabra+"*";
                            
                            
                            palabra+=linea.charAt(contador2);
                            texto+=palabra;
                            palabra="";
                        }
                        contador2++;
                    }
                }
            }
			System.out.println("Traduccion: "+texto);
	}
		catch(IOException io){
			System.out.println("Error, ha ocurrido un problema en lectura del documento u operacion");
		}
    }
    
    public void creararbol(){}
}

