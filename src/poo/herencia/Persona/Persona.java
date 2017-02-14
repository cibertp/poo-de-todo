package poo.herencia.Persona;

/**
 *
 * @author Cibert_Poet
 */
public class Persona {

    //esta es la super clase
    private String nombre, apellido, tipo, documento;

    public Persona() {

    }
    
     public Persona(String nombre, String apellido, String tipo,String documento) {
         this.apellido= apellido;
         this.nombre= nombre;
         this.tipo= tipo;
         this.documento= documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

  
    public void setDocumentos(String documento){
        this.documento= documento;
    }
     
     
}
