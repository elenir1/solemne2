// private String grado, instrucionesrepisa; //líquidos
// private String cocinaocasa, vidrioono; //aseo

//
// private String Empaquetado, refrigerado; //abarrotes
package Clases;

public class claseparaproductos {

    protected String tipo, descripcion;
    protected int codigo, precio, cantidadencarrito;

    public claseparaproductos(String tipo, String descripcion, int codigo, int precio, int cantidadencarrito) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadencarrito = cantidadencarrito;
    }

    public claseparaproductos(String tipo, String descripcion, int codigo, int precio, int cantidadencarrito, double j) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio*(int)j;
        this.cantidadencarrito = cantidadencarrito;
    }  //Sobrecarga para aplicar descuentos

    public void instrucionescompra() {
        System.out.println("test");
    }
    public String instrucionescompra2() {
        return ("test");
    }
    public claseparaproductos(claseparaproductos obj) {
        tipo = obj.tipo;
        descripcion = obj.descripcion;
        codigo = obj.codigo;
        precio = obj.precio;
        cantidadencarrito = obj.cantidadencarrito;
    }  //Sobrecarga nos permite facilmente clonar objetos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadencarrito() {
        return cantidadencarrito;
    }

    public void setCantidadencarrito(int cantidadencarrito) {
        this.cantidadencarrito = cantidadencarrito;
    }

    public void revisarproductos() {
        int errorproductos = 1;
        int length = String.valueOf(codigo).length();

        if (this.precio <= 0){
            System.out.println("Error el precio no puede ser igual o menor que 0. Encontrado en: " + this.descripcion);
            errorproductos = 0;
        }
        if (length == 4){
            //no hacer nada
        } else {
            System.out.println("Error, el codigo debe tener una longitud de 4 caracteres. Encontrado en: " + this.descripcion);
            errorproductos = 0;
        }
        if (errorproductos == 1){
            System.out.println("No se encontraron errores en el producto: " + this.descripcion);
        }
    }
}
