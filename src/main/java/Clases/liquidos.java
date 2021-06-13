package Clases;

public class liquidos extends claseparaproductos {
    private String grado = "0% alcohol", instrucionesrepisa = "Precaucion fragil"; //líquidos

    public liquidos(String tipo, String descripcion, int codigo, int precio, int cantidadencarrito) {
        super(tipo, descripcion, codigo, precio, cantidadencarrito);
    }


    public void instrucionescompra() {
        System.out.println("La compra contiene liquidos, cuidado contiene objetos fragiles");
    }
    public String instrucionescompra2() {
        return ("La compra contiene liquidos, cuidado contiene objetos fragiles");
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getInstrucionesrepisa() {
        return instrucionesrepisa;
    }

    public void setInstrucionesrepisa(String instrucionesrepisa) {
        this.instrucionesrepisa = instrucionesrepisa;
    }
}
