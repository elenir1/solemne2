package Clases;

public class ofertas extends claseparaproductos {
    private String comparacion = "opcion razonable!", razon = "Semana de inauguracion"; //ofertas

    public ofertas(String tipo, String descripcion, int codigo, int precio, int cantidadencarrito) {
        super(tipo, descripcion, codigo, precio, cantidadencarrito);
    }

    public void instrucionescompra() {
        System.out.println("Muchas gracias por preferirnos, su compra fue sujeta a las condiciones de nuestra oferta");
    }
    public String instrucionescompra2() {
        return ("Muchas gracias por preferirnos, su compra fue sujeta a las condiciones de nuestra oferta");
    }

    public String getComparacion() {
        return comparacion;
    }

    public void setComparacion(String comparacion) {
        this.comparacion = comparacion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
}
