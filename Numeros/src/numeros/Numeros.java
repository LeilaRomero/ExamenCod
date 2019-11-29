package numeros;

/**
 *
 * @author lromerofajar
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    
    public static boolean parametro = false;
    
    public static void main(String[] arg) {
        int numeroDigitos = 0;
        int numerosdigitos1 = 0;
        numeroDigitos = Integer.parseInt(arg[0]);
        if (numeroDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int inicio = 1; inicio <= 99999; inicio++) {
            int division = inicio;
            int contador = 0;

            while (division != 0) {
                division = division / 10;
                contador++;
            }
            numerosdigitos1 = contador;

            if (numerosdigitos1 == numeroDigitos) {
                if (inicio < 4) {
                    parametro = true;
                } else {
                    if (inicio % 2 == 0) {
                        parametro = false;
                    } else {
                        int contador1 = 0;
                        int inicio1 = 1;
                        
                        //l=  lugar ya que no entiendo a que se refiere.
                        
                        int lugar = (inicio - 1) / 2;
                        if (lugar % 2 == 0) {
                            lugar--;
                        }
                        while (inicio1 <= lugar) {
                            if (inicio % inicio1 == 0) {
                                contador1++;
                            }
                            inicio1 += 2;
                            if (contador1 == 2) {
                                inicio1 = lugar + 1;
                            }
                        }

                        if (contador1 == 1) {
                            parametro = true;
                        }
                    }
                }

                if (parametro == true) {
                    System.out.println(inicio);
                }
            }
        }
    }
}
