package poo.herencia.Persona;

/**
 *
 * @author Cibert_Poet
 */
public class Empleado extends Persona {

    private String tipoContrato;
    private Double sueldo;
//USO DE CONSTRUCTORES 
    //constructor propios de esta clase

     public Empleado() {
       
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
   

    //uso de procedimiento propios
    public void CalcularSueldo(Double sueldoBase) {
        if (this.getTipoContrato() == "c") {
            this.setSueldo(sueldo + 350);
        } else {
            this.setSueldo(sueldo + 850);//año de servicio
        }
    }
}
