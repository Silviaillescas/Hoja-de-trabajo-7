/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 *
 * @author silvi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        //Atributos
        int numMenu;
        File doc = new File("diccionario.txt");
        File traducir = new File("texto.txt");
        Visibility mivista = new Visibility();
        Scanner obj1 = new Scanner(doc);
        Scanner obj2 = new Scanner(traducir);
        Scanner scan = new Scanner(System.in);
        Binaryresearchtree treeFrench = new Binaryresearchtree();
        Binaryresearchtree treeEnglish = new Binaryresearchtree();
        String palabras = new String();
        String palabrasTraducir = new String();
        String palabrasImprimir = new String();
        String  palabrasTraducidaIngles;
        String  palabrasTraducidaFrances;
        String[] array;
        String[] ArrayPalabras;
        Partnership<String, String> palabra1;
        Partership<String, String> palabra2;

        while (obj1.hasNextLine()){
            array = new String[3];
            palabras = obj1.nextLine();
            array = palabras.split(",");
            palabra = new Partership<String, String>(array[2].trim(),array[1].trim());
            palabra2 = new Partership<String, String>(array[0].trim(),array[1].trim());
            treeFrench.insert(palabra1);
            treeEnglish.insert(palabra2);

}
