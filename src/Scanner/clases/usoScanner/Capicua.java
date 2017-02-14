
package Scanner.clases.usoScanner;

import java.util.Arrays;

/**
 *
 * @author Cibert_Poet
 */
public class Capicua {
   
    public static void main(String[] args) {
        try {
                 //101 es igual 101
        //pero 102 no es igual 201 son diferentes
        
        int numero[] = {1,0,0,1};
        int aux[]= new int[numero.length];
        
        for (int i =numero.length-1,j=0; i>=0; i++,j--) {
            aux[j] = numero[i];
            System.out.println(aux[j]);
        }
        
        //arrayl equals compara si son iguales
        if(Arrays.equals(numero, aux)){
            System.out.println("Es capicua");
        }else{
            System.out.println("no es capicua");
        }
//        
//        if (numero==aux){
//            System.out.println("es capicua");
//        }else{
//            System.out.println("mo es capicua");
//        }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
//        
    }
}
