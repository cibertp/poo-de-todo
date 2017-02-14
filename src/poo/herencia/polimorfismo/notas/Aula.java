
package poo.Herencia.polimorfismo.notas;

/**
 *
 * @author Cibert_Poet
 */
public class Aula {
    

    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;
    
   
    private final int MAX_ALUMNOS=20;
    

    public Aula(){
        
        id=1;
        
        profesor=new Profesor();
        alumnos= new Alumno[MAX_ALUMNOS];
        creaAlumnos();
        materia=Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
        
    }
    
   
 
    private void creaAlumnos(){
        
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=new Alumno();
        }
        
    }
    
   
    private boolean asistenciaAlumnos(){
        
        int cuentaAsistencias=0;
        
        //contamos las asistencias
        for(int i=0;i<alumnos.length;i++){
            
            if(alumnos[i].isAsistencia()){
                cuentaAsistencias++;
            }
            
        }
        

        System.out.println("Hay "+cuentaAsistencias+" alumnos");
        
        return cuentaAsistencias>=((int)(alumnos.length/2));
        
    }
  
    public boolean darClase(){
        
      
        
        if(!profesor.isAsistencia()){
            System.out.println("El profesor no esta, no se puede dar clase");
            return false;
        }else if(!profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma, no se puede dar clase");
            return false;
        }else if (!asistenciaAlumnos()){
            System.out.println("La asistencia no es suficiente, no se puede dar clase");
            return false;
        }
        
        System.out.println("Se puede dar clase");
        return true;
        
    }

    public void notas(){
        
        int chicosApro=0;
        int chicasApro=0;
        
         for(int i=0;i<alumnos.length;i++){
           
           //Comprobamos si el alumno esta aprobado
           if(alumnos[i].getNota()>=5){
               //Segun el sexo, aumentara uno o otro
               if(alumnos[i].getSexo()=='H'){
                   chicosApro++;
               }else{
                   chicasApro++;
               }
               
               System.out.println(alumnos[i].toString());
               
           }
            
        }
         
        System.out.println("Hay "+chicosApro+" chicos y "+chicasApro+" chicas aprobados/as");
        
    }
    
}
