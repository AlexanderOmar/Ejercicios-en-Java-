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
public class ProductosRefrigerados extends ClaseBaseProductos {
int codigoAlimento;
double temperaturaEn;
    public ProductosRefrigerados() {
    }

    public ProductosRefrigerados(int codigoAlimento, double temperaturaEn, String FechadeEnvasado, String FechaCaducidad, int NLote, String PaisOrigen) {
        super(FechadeEnvasado, FechaCaducidad, NLote, PaisOrigen);
        this.codigoAlimento = codigoAlimento;
        this.temperaturaEn = temperaturaEn;
    }

    public int getCodigoAlimento() {
        return codigoAlimento;
    }

    public void setCodigoAlimento(int codigoAlimento) {
        this.codigoAlimento = codigoAlimento;
    }

    public double getTemperaturaEn() {
        return temperaturaEn;
    }

    public void setTemperaturaEn(double temperaturaEn) {
        this.temperaturaEn = temperaturaEn;
    }

    

   

    
    
}
