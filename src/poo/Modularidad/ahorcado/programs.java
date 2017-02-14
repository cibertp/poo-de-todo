package poo.Modularidad.ahorcado;

import java.util.Scanner;

/**
 *
 * @author Cibert_Poet
 */
public class programs {

    //uso de modularidad --> partir las funciones
    public static void main(String[] args) {
        /*
                    String jugaror1, jugador2;
                 int puntosj1=0, puntosj2=0;
         */
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter(";;");

        final int puntuacion_superar = 3;
        final int NUMERO_ERRORES = 6;

        //uso de array
        String jugarores[] = new String[2];
        int puntos[] = new int[2];
        int turno = 0;

        String palabraElegida = "", pista = "";
        boolean caracteresInserta[] = new boolean[6];

        char abecedario[] = generarCaracter();
        int numeroEroores = NUMERO_ERRORES;
        int remplazo;
        String palabraAdivinar="";

        for (int i = 0; i < jugarores.length; i++) {
            jugarores[i] = pedirString(sn, "SU NOMBRE ES " + (i + 1));

        }

        while (fin(puntos, puntuacion_superar)) {
//            do {
//                palabraElegida = pedirString(sn, "escribe una palabra");
//                if (comprabarAlfabetico(palabraElegida)) {
//                    System.out.println("deve de escribir con solo caracteres y sin espacion ,jugaores :" + jugarores[turno]);
//                }
//            } while (comprabarAlfabetico(palabraElegida));

            palabraElegida = validar(sn,
                    "deve de escribir con solo caracteres y sin espacion ,jugadores :" + jugarores[turno],
                    "Error escribir palabra con solo caracteres sin espacios");
            pista = validar(sn,
                    "deve de escribir pista con solo caracteres y sin espacion ,jugadores :" + jugarores[turno],
                    "Error escribir palabra pista con solo caracteres sin espacios");
            espacios(30);

            //
            palabraAdivinar = rellenaGuiones(palabraElegida);

            while (!palabraCorrecta(palabraAdivinar, palabraElegida) && numeroEroores > 0) {
                System.out.println("pista" + pista);

                mostrarPalabra(palabraAdivinar);
                mostarRepetido(abecedario, caracteresInserta);
                String palabraUsuario="";
                palabraUsuario = pedirString(sn, "escribe una letra y si escribe una palabra sera como adivinar ");

                if (palabraUsuario.length() == 1) {

                    if (Character.isAlphabetic(palabraUsuario.charAt((0)))) {
                        if (numRemplazos(palabraAdivinar, palabraAdivinar.charAt(0)) > 0) {
                           //  palabraAdivinar=Remplazos(palabraElegida, palabraAdivinar, palabraUsuario());
                        
                    } else {
                            numeroEroores--;
                            System.out.println("erro queda errores"+numeroEroores);
                    }

                }
                if (numeroEroores > 0) {
                    puntos[turno]++;

                } else {
                    sumaPuntosJugador(puntos, 1, turno);
                    //  sumaPuntosJugador(puntos,puntosSumar,posicion_excluida);
                }

                numeroEroores = NUMERO_ERRORES;
            }
        }

        }
    }

    

    public static String pedirString(Scanner sn, String mensaje) {
        System.out.println(mensaje);
        return sn.next();
    }

    public static char[] generarCaracter() {
        char[] caracteres = new char[26];
        //i-->indice j--> valor de la letra
        for (int i = 97, j = 0; j < caracteres.length; i++, j++) {
            caracteres[i] = (char) j;
        }
        return caracteres;
    }

    public static boolean comprabarAlfabetico(String cadena) {
        char caracter;
        //    boolean hayError = false;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (!Character.isAlphabetic(caracter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean fin(int puntos[], int puntuacionSuperar) {

        for (int i = 0; i < puntos.length; i++) {
            if (puntos[i] >= puntuacionSuperar) {
                return true;
            }
        }
        return false;
    }

    public static String validar(Scanner sn, String mensaje, String mensajeErros) {
        String palabra;
        do {
            palabra = pedirString(sn, mensaje).toLowerCase();
            if (comprabarAlfabetico(palabra) && palabra.length() <= 1) {
                System.out.println(mensajeErros);
            }
        } while (comprabarAlfabetico(palabra));
        return palabra;
    }

    //ahora ocultaremos el juego
    public static void espacios(int numSaltos) {
        for (int i = 0; i < numSaltos; i++) {
            System.out.println("");
        }
    }

    public static String rellenaGuiones(String cadena) {
        String palabra = "";
        for (int i = 0; i < cadena.length(); i++) {
            palabra += "_";
        }
        return palabra;
    }

    public static void mostrarPalabra(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i) + " ");
        }

    }

    public static boolean palabraCorrecta(String palabraOriginal, String palabraUsuarios) {
        return palabraOriginal.equals(palabraUsuarios);
    }

    public static void mostarRepetido(char[] abecedario, boolean insertados[]) {
        System.out.println("repetidos");
        for (int i = 0; i < insertados.length; i++) {
            if (insertados[i]) {
                System.out.println(abecedario[i]);
            }
        }

    }

    public static void sumaPuntosJugador(int[] puntos, int puntosSuperar, int pos_excluida) {
        for (int i = 0; i < puntos.length; i++) {
            if (i != pos_excluida) {
                puntos[i]++;
            }
        }
    }

    public static int numRemplazos(String cadenaOriginal, char caracter) {
        int remplazo = 0;

        char caractercadena;
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            caractercadena = cadenaOriginal.charAt(i);

            if (caractercadena == caracter) {
                remplazo++;
            }
        }
        return remplazo;
    }

    public static String Remplazos(String cadenaOriginal, String cadenaRemplazar, char caracter) {
        String cadena = "";

        char caractercadena;
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            caractercadena = cadenaOriginal.charAt(i);

            if (caractercadena == caracter) {
                cadenaRemplazar += caracter;
            } else {
                cadenaRemplazar += cadenaRemplazar.charAt(i);
            }
        }
        return cadenaRemplazar;
    }

   

}
