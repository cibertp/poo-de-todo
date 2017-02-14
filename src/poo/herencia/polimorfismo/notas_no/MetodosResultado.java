package poo.herencia.polimorfismo.notas_no;

/**
 *
 * @author Cibert_Poet
 */
public class MetodosResultado {
//    public static void main(String[] args) {
//        int n;
//        n=aleatorioRandon(2, 3);
//        System.out.println(""+n);
//    }

    public static int aleatorioRandon(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)));
        return num;

    }
}
