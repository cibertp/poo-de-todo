package poo.Herencia.polimorfismo.notas;
/**
 *
 * @author Cibert_Poet
 */
public class Ejercicio_POO_DDR_03 {

    public static void main(String[] args) {
       
        //Creamos el objeto
        Aula aula=new Aula();
        
        //Indicamos si se puede dar la clase
        if(aula.darClase()){
            aula.notas();
        }
        
    }
    
}
