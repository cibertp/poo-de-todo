package Scanner.clases.usoScanner;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cibert_Poet
 */
public class charNum {

    public static void main(String[] args) {
        try {
            //declaracion de las varibles
            Scanner sn = new Scanner(System.in);
            
            System.out.println("escribe una frase");
            String frase = sn.next();
            char caracter[] = new char[frase.length()];
            

            for (int i = 0; i < frase.length(); i++) {
                caracter[i] = frase.charAt(i);
                //cada carater de la fras= con charat decimos dame la posicion de i
                 System.out.println(caracter[i]);

               
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }
}
