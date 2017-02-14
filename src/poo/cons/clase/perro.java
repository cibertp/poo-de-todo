
package poo.cons.clase;

/**
 *
 * @author Cibert_Poet
 */
public class perro {
    
    //propiedad de la clase
    
    public String nombre,raza;
    public Double altura;
    
    //metodo
    //estos son procedimientos
    public void comer(){
        
    }
    
    public void dormir(){
        
    }
    public void ladrar(){
        
    }
    
    //estos son funciones
    public String comer(String carne){
        return nombre+"mide"+altura+"y comera "+ carne;
    }
    
   // ahora de manera de ejemplo crearemos constructor
   public  perro(){
       
   }
   public perro(String nombre, String raza, Double altura){
       this.nombre=nombre;
       this.raza=raza;
       this.altura=altura;
   }
    
    
}
