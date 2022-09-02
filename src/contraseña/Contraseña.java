package contraseña;
import javax.swing.JOptionPane;
/**
 *
 * @author julian jimenez
 */
public class Contraseña {
    
    public static void main(String[] args) {
        String letras;
        String contraseña = "LENOVO", intento = "";
        int cont = 0, aviso = 0;
        do {
            letras = JOptionPane.showInputDialog("Ingrese la contraseña");
            if (contraseña.equals(intento)) {
                intento = JOptionPane.showInputDialog("Acceso Permitido");
                aviso = 1;
            } else {
                intento = JOptionPane.showInputDialog("Contraseña incorrecta");
                cont++;
                if (cont == 3) {
                    intento = JOptionPane.showInputDialog("Acceso denegado ");
                    }
                }

        }while ((cont!=3)&& aviso==0);

    }
}
