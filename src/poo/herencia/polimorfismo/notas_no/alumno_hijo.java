package poo.herencia.polimorfismo.notas_no;

/**
 *
 * @author Cibert_Poet
 */
class alumno_hijo extends persona_madre {
    //notas

    private int notas;

    public alumno_hijo() {
        super();//este es para eredar la clase padre
        notas = MetodosResultado.aleatorioRandon(0, 20);

        super.setEdad(MetodosResultado.aleatorioRandon(12, 15));

    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }
    
    
   @Override
    public void disponiblidad(){
        int prob = MetodosResultado.aleatorioRandon(0, 100);
        if (prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }
    public String toString(){
       // return "Nombre "+nombre+", sexo :"+sexo+" nota :"+notas;
        return "Nombre "+super.getNombre()+", sexo :"+super.getSexo()+" nota :"+notas;
    }

    
}
