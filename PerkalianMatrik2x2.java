/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perkalianmatrik2x2;

/**
 *
 * @Mochammad Ali Ridho Fathoni
 */
import java.util.Scanner;
public class PerkalianMatrik2x2 {


    public static void main(String[] args) {
        // TODO Mengalikan matriks 2x2
        Scanner input = new Scanner(System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];
      
        
        System.out.print("Masukkan Matriks A : ");
       
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print("["+(i+1)+"]["+(j+1)+"]:");
                A[i][j]=input.nextInt();
            }
    }
        System.out.println("Masukkan Matriks B : ");
       
        for (int k=0; k<2; k++){
            for (int l=0; l<2; l++){
                System.out.print("["+(l+1)+"]["+(l+1)+"]:");
                B[k][l]=input.nextInt();
            }
                }
        System.out.println("Matriks A");
        for (int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Matriks B");
        for(int k=0; k<2; k++){
            for(int l= 0; l<2; l++){
            System.out.print(B[k][l]+ " ");
        }
        System.out.println("");
        }
        C[0][0]=A[0][0]*B[0][0] + A[0][1]*B[1][0];
        C[0][1]=A[0][0]*B[0][1] + A[0][1]*B[1][1];
        C[1][0]=A[1][0]*B[0][0] + A[1][1]*B[1][0];
        C[1][1]=A[1][0]*B[0][1] + A[1][1]*B[1][1];
        System.out.println("Hasil perkalian matriks A dan matriks B");
        
        
        for (int x=0; x<2; x++){
            for(int y=0; y<2; y++){
                System.out.print(+(C[x][y])+" ");
                        }
            System.out.println("");
        }
      
        
    }
    
    
}

