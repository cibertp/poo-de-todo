package poo.herencia.polimorfismo.notas_no;

/**
 *
 * @author Cibert_Poet
 */
class Profesor_hijo extends persona_madre {

    private String materia;

    public Profesor_hijo() {
        super();
        try {
            
        super.setEdad(MetodosResultado.aleatorioRandon(20, 44));

        materia = Constantes.materias[MetodosResultado.aleatorioRandon(0, 2)];
        } catch (Exception e) {
            System.out.println(""+e.getLocalizedMessage());
        }
        
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    @Override
    public void disponiblidad(){
        int prob = MetodosResultado.aleatorioRandon(0, 100);
        if (prob<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }
    
}
