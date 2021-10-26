package tienda.models;

/**
 * ImpuestoVentaExtranjero
 */
public class ImpuestoVentaExtranjero extends ImpuestoVenta{

    public ImpuestoVentaExtranjero(){

    }
    
   public Double calcularImpuesto(Double total){
        
        Double impuesto;
        impuesto = 0.25 * total; 
    
    return impuesto;
   }
}
 
