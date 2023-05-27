import java.awt.Toolkit;                              // Importa la clase Toolkit del paquete awt, que proporciona métodos para acceder a características específicas del sistema
import java.awt.datatransfer.Clipboard;                // Importa la clase Clipboard del paquete awt.datatransfer, que representa el portapapeles del sistema
import java.awt.datatransfer.StringSelection;          // Importa la clase StringSelection del paquete awt.datatransfer, que es una implementación de Transferable para texto simple
import java.text.SimpleDateFormat;                    // Importa la clase SimpleDateFormat del paquete text, que permite formatear y analizar fechas y horas según un patrón
import java.util.Calendar;                            // Importa la clase Calendar del paquete util, que proporciona operaciones para trabajar con fechas y horas
import java.util.Date;                                // Importa la clase Date del paquete util, que representa una fecha y hora específica

public class ImprimirFechaHora {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("M-dd-yyyy HH:mm:ss");  // Crea un objeto SimpleDateFormat con el patrón "M-dd-yyyy HH:mm:ss" para formatear las fechas y horas

        Calendar calendar = Calendar.getInstance();     // Obtiene una instancia del objeto Calendar, que representa la fecha y hora actual del sistema
        calendar.set(2023, Calendar.MAY, 24, 12, 0, 0);   // Establece la fecha y hora de partida en el 24 de mayo de 2023 a las 12:00:00

        StringBuilder texto = new StringBuilder();       // Crea un objeto StringBuilder para almacenar las fechas y horas generadas

        for (int i = 0; i < 5000; i++) {                  // Itera 5000 veces
            Date fechaHora = calendar.getTime();          // Obtiene la fecha y hora actual del objeto Calendar en un objeto Date
            String fechaHoraString = sdf.format(fechaHora);  // Formatea la fecha y hora en un formato legible utilizando el objeto SimpleDateFormat
            System.out.println(fechaHoraString);          // Imprime la fecha y hora formateada en la consola

            texto.append(fechaHoraString).append("\n");   // Agrega la fecha y hora al objeto StringBuilder, con un salto de línea al final

            calendar.add(Calendar.SECOND, 6);            // Aumenta 10 segundos a la fecha y hora actual del objeto Calendar
        }

        StringSelection seleccion = new StringSelection(texto.toString());  // Crea una instancia de StringSelection con el contenido del objeto StringBuilder
        Clipboard portapapeles = Toolkit.getDefaultToolkit().getSystemClipboard();  // Obtiene el portapapeles del sistema utilizando la clase Toolkit
        portapapeles.setContents(seleccion, seleccion);  // Establece el contenido en el portapapeles utilizando la clase Clipboard

        System.out.println("El texto se ha copiado al portapapeles.");  
        // Imprime un mensaje indicando que el texto se ha copiado al portapapeles y esto es muy impresionante
    }
}
