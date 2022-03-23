/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleksi;

/**
 *
 * @author Mochammad Ali Ridho Fathoni
 */
import java.util.Scanner;
public class Seleksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    int angka;
    do{
        System.out.println("Tulis 00 untuk mengakhiri program");
        System.out.println("Masukkan angka :");
        angka = input.nextInt();
        if (angka > 0 && angka %2==0 ){
            System.out.println(+angka+ " Adalah bilangan positif genap");
            System.out.println();
        }
        else if (angka < 0 && angka %2==0){
            System.out.println(+angka+ " Adalah bilangan negatif genap");
            System.out.println();
        }
        else if (angka > 0 && angka %2==1){
            System.out.println(+angka+ " Adalah bilangan positif ganjil");
            System.out.println();
        }
        else if (angka < 0 && angka %2 == -1 ){
            System.out.println(+angka+ " Adalah bilangan negatif ganjil");
            System.out.println();
        }
        else if (angka == 00){
            break;
        }
        else{
            System.out.println("Yang anda masukkan bukan angka");
            System.out.println();
        }
        
    }
     while (angka!=0);   
    }
    
}
