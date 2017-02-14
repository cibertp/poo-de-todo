//ordena un array de numeros con sort de Arrays
package Scanner.clases.array;

import java.util.Arrays;

/**
 *
 * @author Cibert_Poet
 */
public class OrdenarArray {

    public static void main(String[] args) {

        int n[] = new int[6];
        n[0] = 4;
        n[1] = 3;
        n[2] = 2;
        n[3] = 6;
        n[4] = 7;
        n[5] = 5;
       
        Arrays.sort(n);
     
        
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        System.out.println("------------");
//         Arrays.binarySearch(args, n);
//        
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(n[i]+1);
//        }
//     
    }
}
