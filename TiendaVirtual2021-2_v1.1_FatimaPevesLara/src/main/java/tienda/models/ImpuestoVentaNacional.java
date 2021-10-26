package tienda.models;

/**
 * ImpuestoVentaNacional
 */
public class ImpuestoVentaNacional extends ImpuestoVenta{

    public ImpuestoVentaNacional(){

    }
    
   public Double calcularImpuesto(Double total){
        
        Double impuesto;
        impuesto = 0.18 * total; 
    
    return impuesto;
   }
}