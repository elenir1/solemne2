package Clases;

public class aseo extends claseparaproductos {
    private String cocinaocasa = "cocina", vidrioono = "lava platos"; //aseo

    public aseo(String tipo, String descripcion, int codigo, int precio, int cantidadencarrito) {
        super(tipo, descripcion, codigo, precio, cantidadencarrito);
    }

    public void instrucionescompra() {
        System.out.println("producto de aseo en compra. Traer bolsas");
    }
    public String instrucionescompra2() {
        return ("producto de aseo en compra. Traer bolsas");
    }

    public String getCocinaocasa() {
        return cocinaocasa;
    }

    public void setCocinaocasa(String cocinaocasa) {
        this.cocinaocasa = cocinaocasa;
    }

    public String getVidrioono() {
        return vidrioono;
    }

    public void setVidrioono(String vidrioono) {
        this.vidrioono = vidrioono;
    }

}
