package factorial;

/**
 *
 * @author lromerofajar
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //j= numero ya que imagino que el programa es de numeracion.
        
        int numero;
        int factorial;

        numero = 8;

        int inicio;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (inicio = numero; inicio >= 1; inicio--) {
                factorial = factorial * inicio;
            }
        }

        System.out.println(factorial);

    }

}
