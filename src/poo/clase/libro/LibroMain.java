package poo.clase.libro;

/**
 *
 * @author Cibert_Poet
 */
public class LibroMain {

    public LibroMain() {
    }

    public static void main(String[] args) {
        poo.clase.libro.Libro L = new poo.clase.libro.Libro("poeta", "los versos", 120, 10);
        poo.clase.libro.Libro Li = new poo.clase.libro.Libro("huama", "tus besos", 150, 100);

        System.out.println("" + L);
        System.out.println("" + Li);

        //comprovaremos quien tiene mas paginas
        if (L.getNumPaginas() > Li.getNumPaginas()) {
            System.out.println("EL LIBRO " + L.getTitulo() + "tiene mas paginas" + L.getNumPaginas());
        } else {
            System.out.println("EL LIBRO " + Li.getTitulo() + "tiene mas paginas" + Li.getNumPaginas());
        }
    }
}
