package Scanner.clases.matriz;

import java.util.Scanner;

/**
 *
 * @author Cibert_Poet
 */
public class matriz5xn {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("escriba un numero");
        int columnos = sn.nextInt();
        int matriz[][] = new int[5][columnos];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (randon(0,10));
                System.out.print (matriz[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static int randon(int minimo, int maximo) {
        return  (int) Math.floor(Math.random()*((minimo-(maximo+1))+(maximo+1)));
    //return (int) Math.random()*(minimo-(maximo+1)+(maximo+1));
    }

}
