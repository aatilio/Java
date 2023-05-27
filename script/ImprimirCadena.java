import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ImprimirCadena {
    public static void main(String[] args) {
        StringBuilder texto = new StringBuilder();
        
        for (int variable = 1; variable <= 5000; variable++) {
            String linea = "27/05/2023";
            System.out.println(linea);
            texto.append(linea).append("\n");
        }
        
        StringSelection seleccion = new StringSelection(texto.toString());
        Clipboard portapapeles = Toolkit.getDefaultToolkit().getSystemClipboard();
        portapapeles.setContents(seleccion, seleccion);
        
        System.out.println("El texto se ha copiado al portapapeles.");
    }
}
