package Scanner.clases.array;

import java.util.Arrays;

/**
 *
 * @author Cibert_Poet
 */
public class copyArray {

    public static void main(String[] args) {
        int num[] = new int[35];
        Arrays.fill(num, 10);
        int num2[];
        
        System.out.println("copia solo sin rango");
        num2 = Arrays.copyOf(num, 12);
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
        System.out.println("copia de un rango orinal para delante");
        int num3[] = Arrays.copyOfRange(num, 2, 6);
        for (int i = 0; i < num3.length; i++) {
            System.out.println(num3[i]);
        }
    }
}
