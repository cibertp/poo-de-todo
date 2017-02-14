package poo.herencia.polimorfismo.notas_no;

//import static poo.Nota.alumno.MetodosResultado.aleatorioRandon;
/**
 *
 * @author Cibert_Poet
 */
//vamos a aser abstracto q no devolceremos dana pero si dar
public abstract class persona_madre {

    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;

    //esto utilixarremo como constante
    private final String[] nombre_chicos = {"poeta", "carlos", "diomedes", "manuel"};
    private final String[] nombre_chicas = {"maricarmen", "patricia", "diana", "Roxana"};
    private final int chico = 0;

    public persona_madre() {
        try {
            //con estodeterminaresmo si es varon 0 y mujer es 1
            int determinarSexo = MetodosResultado.aleatorioRandon(0, 1);

            if (determinarSexo == chico) {
                nombre = nombre_chicos[MetodosResultado.aleatorioRandon(0, 3)];
                sexo = 'H';

            } else {
                nombre = nombre_chicas[MetodosResultado.aleatorioRandon(0, 3)];
                sexo = 'M';
            }
            disponiblidad();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //AHORA AREMOS EL USO DE POLIMORFISMO
    public abstract void disponiblidad();

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

}
