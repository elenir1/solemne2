package Clases;

public class congelados extends claseparaproductos {
    private String temperaturadeconegalado = "congelado", animalovegetal = "vegetariano"; //congelados

    public congelados(String tipo, String descripcion, int codigo, int precio, int cantidadencarrito) {
        super(tipo, descripcion, codigo, precio, cantidadencarrito);
    }

    public void instrucionescompra() {
        System.out.println("La compra contiene congelados, refrigerar");
    }
    public String instrucionescompra2() {
        return ("La compra contiene congelados, refrigerar");
    }

    public String getTemperaturadeconegalado() {
        return temperaturadeconegalado;
    }

    public void setTemperaturadeconegalado(String temperaturadeconegalado) {
        this.temperaturadeconegalado = temperaturadeconegalado;
    }

    public String getAnimalovegetal() {
        return animalovegetal;
    }

    public void setAnimalovegetal(String animalovegetal) {
        this.animalovegetal = animalovegetal;
    }
}
