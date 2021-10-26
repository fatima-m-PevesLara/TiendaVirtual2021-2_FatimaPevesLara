package tienda.models;

public class YapeMetodoPago extends MetodoPago {

    private String cuentaYape;
    private Double comision;

    
    @Override
    public  void pagarPedido(Pedido order){
        yapePayOrder(order);
    }

    public void yapePayOrder(Pedido order){
        
        comision = order.getMontoTotal() * 0.05;
        
        System.out.println("Procesando el pago con Yape: "+ getCuentaYape()+" | total: "+order.getMontoTotal() + " comision: " +comision);
    }

    public String getCuentaYape() {
        if(this.cuentaYape == null){
            setCuentaYape("999888123");
        }
        return cuentaYape;
    }

    public void setCuentaYape(String ctaYape){
        cuentaYape= ctaYape;
    }

    public Double devolverComision(){
        return comision;
    }
}