/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner.clases.array;

import java.util.Arrays;

/**
 *
 * @author Cibert_Poet
 */
public class ComparacionArrary {

    public static void main(String[] args) {
        //para esto solo aique cambiar el dato 10
        int n1[] = new int[10];
        int n2[] = new int[10];
        
        for (int i=0; i < n2.length; i++) {
            System.out.println(""+n2+i);
        }
        

        if (Arrays.equals(n1, n2)) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferente");
        }

    }

}
