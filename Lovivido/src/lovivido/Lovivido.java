package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author lromerofajar
 */
public class Lovivido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombre;
        String edad;

        int mes;
        int dia;
        int horas;
        int ano;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        ano = Integer.parseInt(edad);

        mes = (ano * 12);
        dia = (ano * 365);
        horas = (dia * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
