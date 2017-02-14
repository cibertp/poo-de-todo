package poo.herencia.polimorfismo.notas_no;

import javax.swing.JOptionPane;

/**
 *
 * @author Cibert_Poet
 */
public class Aula {

    private String materia;
    private Profesor_hijo profesor;
    private alumno_hijo[] alumnos;
    //nos dice q el aula deve de tenr un id

    private int id;

    //uso de constantes
    private final int max_alumnos = 20;
//    private final int n[]= new int[10]; 

    public Aula() {
        try {
            id = 1;
            profesor = new Profesor_hijo();

            alumnos = new alumno_hijo[max_alumnos];

            materia = Constantes.materias[MetodosResultado.aleatorioRandon(0, 2)];
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }

    }

    private void creaAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new alumno_hijo();
        }
    }

    public boolean darClase() {
        try {
            if (profesor.isAsistencia()) {
                System.out.println("el profe no esta,x lo tanto no hay clase");
                return false;
            } else if (!profesor.getMateria().equals(materia)) {
                System.out.println("el profesor no puede enseñar otro curso mas q de el mismo");
                return false;

                //creare un metodo de asistencia
            } else if (!asistenciaAlumno()) {
                System.out.println("ña asistencia no es suficiente");
                return false;
            }

        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        System.out.println("se puede dar clase");
        return true;
    }

    private boolean asistenciaAlumno() {
        int cuentaAsistencia = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].isAsistencia()) {
                cuentaAsistencia++;
            }
        }System.out.println("hay "+cuentaAsistencia+"alumnos");
        if (cuentaAsistencia >= ((int) max_alumnos / 2)) {
            return true;
        } else {
            return false;
        }
        //o puede ser aso
        //return (cuentaAsistencia >= ((int) max_alumnos / 2)) {

    }

    public void notas() {
        try {
            int chicosApro = 0;
            int chicasApro = 0;
            for (int i = 0; i < alumnos.length; i++) {
                if (alumnos[i].getSexo() == 'H') {
                    chicosApro++;

                } else {
                    chicasApro++;
                }
                System.out.println(alumnos[i].toString());;
            }
            System.out.println("hay " + chicosApro + " y chicas" + chicasApro + "aprbados");
        }
    
    catch (Exception e) {
        System.out.println(""+e.getMessage());
        }
    }
}
