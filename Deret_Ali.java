/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deret;

/**
 *
 * @author Mochammad Ali Ridho Fathoni
 */
import java.util.Scanner;
public class Deret_Ali {
    public static void main(String[] args) {
        // TODO Menampilkan deret dan menghitung nilai rata-ratanya
    
    Scanner scan = new Scanner(System.in);
    
    int nilai_awal, beda ,jumlah_deret, i;
    System.out.print("Masukkan nilai awal : ");
    nilai_awal = scan.nextInt();
    
    System.out.print("Masukkan nilai beda : ");
    beda = scan.nextInt();
    
    System.out.print("Masukkan jumlah deret : ");
    jumlah_deret = scan.nextInt();
    
    float a, b, n;
    a = nilai_awal;
    b = beda;
    n = jumlah_deret;
    
    float sn, un, rata;
    un = a + (n-1)*b;
    sn = (n/2)*(a + un);
    rata = sn/n;
        
    for(i=nilai_awal; i<=un; i=i+beda){
        System.out.print(i + " ");
    }
    System.out.println();
    
    System.out.print("Rata-rata = ");
    System.out.printf("%.2f" ,rata);
    System.out.println();
    }
   
}
