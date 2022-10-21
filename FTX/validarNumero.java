package FTX;

public class validarNumero {
     public static boolean esNumero(String cadena) {
          try {
               return true;
          } catch (NumberFormatException error) {
               System.out.println(error);
               return false;
          }
     }
}
