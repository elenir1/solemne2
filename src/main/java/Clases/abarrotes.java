package Clases;

public class abarrotes extends claseparaproductos{
    private String Empaquetado = "caja", refrigerado = "No requiere"; //abarrotes

    public abarrotes(String tipo, String descripcion, int codigo, int precio, int cantidadencarrito) {
        super(tipo, descripcion, codigo, precio, cantidadencarrito);
    }

    public void instrucionescompra() {
        System.out.println("La compra contiene abarrotes, traer cajas");
    }
    public String instrucionescompra2() {
        return ("La compra contiene abarrotes, traer cajas");
    }

    public String getEmpaquetado() {
        return Empaquetado;
    }

    public void setEmpaquetado(String empaquetado) {
        Empaquetado = empaquetado;
    }

    public String getRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(String refrigerado) {
        this.refrigerado = refrigerado;
    }
}
