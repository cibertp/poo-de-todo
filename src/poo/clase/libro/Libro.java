
package poo.clase.libro;

/**
 *
 * @author Cibert_Poet
 */
public class Libro {
  
    private String autor;
    private String titulo;
    private int numPaginas;
    private int ISBN;

    //uso de 
   public Libro(String autor, String titulo,int numPaginas, int isbn){
       this.ISBN= isbn;
       this.autor= autor;
       this.numPaginas= numPaginas;
       this.titulo= titulo;
   }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    
    //toda clase ereda dela clase object
    @Override
    public String toString(){
        return "el libro "+titulo+"con isbs "+"autor :"+autor+" paginas :"+numPaginas;
    }
   
}
