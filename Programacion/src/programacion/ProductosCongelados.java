/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;
import java.time.Clock;
import java.util.Date;


/**
 *
 * @author Alexander
 */
public class ProductosCongelados extends ClaseBaseProductos{
double temperatura ;

    public ProductosCongelados() {
    }

    public ProductosCongelados(double temperatura) {
        this.temperatura = temperatura;
    }
   

   

    public ProductosCongelados(String FechadeEnvasado, String FechaCaducidad, int NLote, String PaisOrigen) {
        super(FechadeEnvasado, FechaCaducidad, NLote, PaisOrigen);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void CongeladosAire(){
        System.out.print("**********Composicion de Aire********** ");
        System.out.print(" % Nitrogeno \n"+" 78% \n"+"Oxigeno \n"+"21%"+"Dióxido de Carbono \n"+"1% \n");
    }

   public void CongeladosAgua(){
       System.out.println("*****Informacion de salinidad******** \n"+"  (30-40) gramos por litro de agua\n");
        
    }
     public void CongeladosNitrogeno(){
 System.out.println("*****Nitrogeno-Metodo de Congelacion ******* \n");
 System.out.println("Metodo de evaporación 480 SEG\n"+"Metodo de compresion 600 SEG \n");
 
    }
  public void separador(){
    System.out.println("_________________________________________");
   
}
}
