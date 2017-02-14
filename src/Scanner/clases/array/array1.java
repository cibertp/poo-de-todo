
package Scanner.clases.array;

import java.util.Arrays;

/**
 *
 * @author Cibert_Poet
 */
public class array1 {
    public static void main(String[] args) {
        int num[]= new int [10];
        
        Arrays.fill(num, -2);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("------------");
        Arrays.fill(num, 3, 4, -1);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]+"");
        }
    }
 
}
