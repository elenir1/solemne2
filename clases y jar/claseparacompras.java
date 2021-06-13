package Clases;


import java.util.Calendar;

public class claseparacompras {
    private String descripcioncompra, productoscomprados;
    private int dia, mes, anno;

    public claseparacompras(String productoscomprados, int dia, int mes, int anno) {
        this.productoscomprados = productoscomprados;
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public claseparacompras(String productoscomprados, int dia, int mes, int anno, String descripcioncompra) {
        this.descripcioncompra = descripcioncompra;
        this.productoscomprados = productoscomprados;
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public String getDescripcioncompra() {
        return descripcioncompra;
    }

    public void setDescripcioncompra(String descripcioncompra) {
        this.descripcioncompra = descripcioncompra;
    }

    public String getProductoscomprados() {
        return productoscomprados;
    }

    public void setProductoscomprados(String productoscomprados) {
        this.productoscomprados = productoscomprados;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void revisarfechacompra() {
        int errorfechas = 1;
        Calendar calndr = Calendar.getInstance();
        if (this.anno > calndr.get(Calendar.YEAR)){
            errorfechas = 0;
        }
        if (this.mes - 1 > calndr.get(Calendar.MONTH) & this.anno == calndr.get(Calendar.YEAR)){
            errorfechas = 0;
        }
        if (this.dia > calndr.get(Calendar.DAY_OF_MONTH) & this.mes - 1 == calndr.get(Calendar.MONTH) & this.anno == calndr.get(Calendar.YEAR)){
            errorfechas = 0;
        }
        if (errorfechas == 1){
            System.out.println("No se encontro errores en las fechas");
        }
        if (errorfechas == 0){
            System.out.println("Hubo un error en la fecha de la compra, favor revisar");
        }
    }

}
