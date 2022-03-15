/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bintang;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Bintang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String pilihan;
    Scanner scan = new Scanner(System.in);
    
        System.out.println("Masukkan Pilihan a/b : ");
        pilihan = scan.nextLine();
        
        switch(pilihan){
            case "a":
                int i, j, k;
                for (i=1; i<=5; i++){
                    for(j=5-1; j>=i; j--){
                        System.out.print(" ");
                    }
                    for (k=1; k<=i; k++){
                    System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "b":
                int p,q,r,s;
                for (p=1; p<=5; p++){
                    for (q=4; q>=p; q--){
                        System.out.print(" ");
                    }
                    for (r=1; r<=p; r++){
                        System.out.print("*");
                    }
                    
                    for (s=1; s<=p-1; s++){
                 System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "c":
                int a, b;
                for (a=1; a<=9; a++){
                    for(b=1; b<=a; b++){
                        System.out.print("*");
                    }
                    System.out.println();
                
                }
                break;
            default:
    }
    
    }
}
