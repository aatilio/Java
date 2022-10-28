package practice;

import java.io.PrintStream;

//package FuncionesHerencia ;
public class FuncionesHerencia{
    public static void main (String[] args){
        Cliente c1;
        c1= new Cliente ();
        c1.setNombre ("Juan Perez");
        c1.setDNI (47896325);
        c1.Comprar ();
        Cliente c2;
        c2 = new Cliente();
        c2.setNombre("Maria cardenas");
        c2.setDNI (12589347);
        c2.Comprar ();
        ClienteCredito c3;
        c3 = new ClienteCredito();
        c1.setNombre ("Alverto Salomon");
        c1.setDNI (19735648);
        c3.setLinea(2000);
        c3.Comprar();

    }
    }
        class Cliente{
            /**
             *
             */
            private static final PrintStream OUT = System.out;
            String Nombre;
            int DNI;
            public void Comprar(){
                OUT.println(" El cliente " + this.Nombre + " con DNI numero: "+ this.DNI + " esta haciendo las compras, con su linea de credito de ");
            }
            public void setNombre(String n){
                this.Nombre = n;
            }
            public void setDNI(int d){
                this.DNI = d;
            }
            /*public void Cliente(String n, int d){
                this.Nombre = n;
                this.DNI = d;
            }
            public void Cliente(){}*/
        }
        class ClienteCredito extends Cliente{
            double LineaCredito;
            public void setLinea(double c){
                this.LineaCredito = c ;
            }
        }