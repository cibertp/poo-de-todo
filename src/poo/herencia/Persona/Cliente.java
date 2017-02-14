
package poo.herencia.Persona;

/**
 *
 * @author Cibert_Poet
 */
public class Cliente  extends Persona{
//    Persona pe= new Persona();
    
    //estos son sus propios metodos
    private String categoria, codigo;
    
    public Cliente(){
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    //utilizando su propieos metodos
    
    public void generarCodigo(){
        this.setCodigo("c"+this.getNombre().substring(0,3));
    }
}
