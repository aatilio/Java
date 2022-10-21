
package practice;
//package metodos;
public class metodos
{
    public static void main(String[] args)
    {
        String c = "Rojo";
        String t = "Voley";
        Pelota p1 = new Pelota();
        p1.Rebotar();
        Pelota p2 = new Pelota(c,t);
        p2.Rebotar();
    }
    class Pelota 
    {
        private String Color;
        private String Tipo;
        Pelota(){}
        Pelota(String c, String t ) {
            this.Color = "c";
            this.Tipo = "t";
        }
        public void Rebotar(){
            System.out.print("Pelota: "+ this.Color + " Esta rebotando");
        }
    }
}
