/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silvi
 */
public class Comparator {
    public int equal(String word1, String word2){
        char[] Array1 = word1.toCharArray();
        char[] Array2 = word2.toCharArray();

        int Lenght;
        if(word1.length()<word2.length()){
                Lenght = word1.length();
        } else {
                Lenght = word2.length();
        }
        
        for(int i=0; i<Lenght; i++){
                if(Array1[i]<Array2[i]){
                        return 1;              
                }

                if(Array1[i]>Array2[i]){
                        return -1;             
                }
        }		
        return 2;
    }
}