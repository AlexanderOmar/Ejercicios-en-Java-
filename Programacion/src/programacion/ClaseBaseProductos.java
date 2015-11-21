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
import java.time.Clock;
import java.util.Date;

public class ClaseBaseProductos {
  
    private String FechadeEnvasado;
     private  String FechaCaducidad;
      private int NLote;
       private String PaisOrigen;

    public ClaseBaseProductos() {
    }

    public ClaseBaseProductos(String FechadeEnvasado, String FechaCaducidad, int NLote, String PaisOrigen) {
        this.FechadeEnvasado = FechadeEnvasado;
        this.FechaCaducidad = FechaCaducidad;
        this.NLote = NLote;
        this.PaisOrigen = PaisOrigen;
    }

    public String getFechadeEnvasado() {
        return FechadeEnvasado;
    }

    public void setFechadeEnvasado(String FechadeEnvasado) {
        this.FechadeEnvasado = FechadeEnvasado;
    }

    public String getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(String FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    public int getNLote() {
        return NLote;
    }

    public void setNLote(int NLote) {
        this.NLote = NLote;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    

    

}