/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author Alexander
 */

public class Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ProductosCongelados c1=new ProductosCongelados("12/05/2014","12/04/2015",45,"Ecuador");
       System.out.print("********PRODUCTOS CONGELADOS*********** \n "+"Fecha de Envasado \n"+c1.getFechadeEnvasado()+
               "\n Fecha de Caducidad \n"+c1.getFechaCaducidad()+"\n Numero de Lote \n"
               +c1.getNLote()+"\n Pais de Origen \n"+c1.getPaisOrigen()+"\n");
        ProductosCongelados c2=new ProductosCongelados(4);
       System.out.print("Temperatura de mantenimiento "+c2.getTemperatura()+"°C\n");
      
       
       c2.separador();
       
       
       ProductosFrescos f=new  ProductosFrescos("6/05/2015","12/12/2015",3,"Colombia");
       c2.separador();
        System.out.print("********PRODUCTOS FRESCOS *********** \n "+"Fecha de Envasado \n"+f.getFechadeEnvasado()+
               "\n Fecha de Caducidad \n"+f.getFechaCaducidad()+"\n Numero de Lote \n"
               +f.getNLote()+"\n Pais de Origen \n"+f.getPaisOrigen()+"\n");
       
        
        c2.separador();
      
       
       ProductosRefrigerados r=new ProductosRefrigerados (85,10,"10/02/2014","10/02/2015",12,"Perú\n");
       c2.separador();
        System.out.print("********PRODUCTOS REFRIGERADOS *********** \n Codigo de Organismo \n "+r.getCodigoAlimento()+
                "\nTemperatura de Mantenimiento Encomendada\n"+r.getTemperaturaEn()+"°C \n"+"\n Fecha de Envasado \n"
                +r.getFechadeEnvasado()+
               "\n Fecha de Caducidad \n"+f.getFechaCaducidad()+"\n Numero de Lote \n"
               +r.getNLote()+"\n Pais de Origen \n"+r.getPaisOrigen()+"\n");
       
       c2.separador();
    }
    
}
