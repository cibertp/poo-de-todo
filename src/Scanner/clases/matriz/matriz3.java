package Scanner.clases.matriz;

import java.util.Scanner;

/**
 *
 * @author Cibert_Poet
 */
public class matriz3 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("escriba el tamaño");
        int temario = sn.nextInt();
        int matriz1[][] = new int[temario][temario];
        int matriz2[][] = new int[temario][temario];

        //esta matriz es para capturar sresultado
        int resultaos[][] = new int[temario][temario];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("escriba el valor para la fila " + i + " y columna 1" + j+ " :");

                matriz1[i][j] = sn.nextInt();

                System.out.print("escriba el valor para la fila " + i + " y columna 2 " + j+ " :");
                matriz1[i][j] = sn.nextInt();

                resultaos[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("matriz uno");
        mostrarMatriz(matriz1);
        System.out.println("matriz dos");
        mostrarMatriz(matriz2);
        System.out.print("resultado");
        mostrarMatriz(resultaos);
        
    }
    
    public static void mostrarMatriz(int[][] matriz){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j]+" "); 
            }
            System.out.println(" ");
        }
        
    }

}
