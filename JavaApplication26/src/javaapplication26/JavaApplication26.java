/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 int birinciDikKenar,ikinciDikKenar;
 double hipotenüs;
 Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci dik kenarı giriniz: ");
 birinciDikKenar = scanner.nextInt();
        System.out.println("İkinci dik kenarı giriniz: ");
ikinciDikKenar = scanner.nextInt();
hipotenüs =  Math.sqrt((birinciDikKenar*birinciDikKenar) + (ikinciDikKenar*ikinciDikKenar));
        System.out.println("Hipotenüs : " + hipotenüs);
    }
    
}
