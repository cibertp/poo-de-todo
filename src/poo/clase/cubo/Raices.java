package poo.clase.cubo;

/**
 *
 * @author Cibert_Poet
 */
public class Raices {

    //declaremo los atrivoutos
    private Double a, b, c;

    
    public Raices(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void obteberRaices() {

        double x1 = (-b + Math.sqrt(getDiscriminante()) / (2 * a));
        double x2 = (-b + Math.sqrt(getDiscriminante()) / (2 * a));

        System.out.println("solucion x1");
        System.out.println(x1);
        System.out.println("solucion x2");
        System.out.println(x2);
    }

    private void obtenerRaiz() {
        double x = (-b)/(2 * a);

        System.out.println("unica solucion");
        System.out.println(x);
    }

    private double getDiscriminante() {
        return Math.pow(b, 2) - (4 * a * b);
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    private boolean tienerRaiz() {
        return getDiscriminante() == 0;
    }

    public void Calcular() {
        if(tieneRaices()){
            obteberRaices();
        }else if(tienerRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("no tiene solucion");
        }
    }
}
