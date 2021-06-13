package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.io.*;

public class clasainterfaz  {

    public static void main(String[] args) throws Exception {
        abarrotes abarrotes1 = new abarrotes("abarrotes", "Azucar lobos 500g", 1000, 1500,0);
        abarrotes abarrotes2 = new abarrotes("abarrotes", "Sal Iansa 50g", 1001, 500,0);

        aseo aseo1 = new aseo("aseo", "Patito limpia todo 5kg", 1002, 10000,0);
        aseo aseo2 = new aseo("aseo", "Limpia platos marca argentina", 1003, 750,0);

        congelados congelados1 = new congelados("congelados", "Heladitos yupiyupi", 1004, 1600,0);
        congelados congelados2 = new congelados("congelados", "Cubos de hielo juanito", 1005, 10,0);

        liquidos liquidos1 = new liquidos("liquidos", "Jack daniels libre de alcohol 1l", 1006, 650,0);
        liquidos liquidos2 = new liquidos("liquidos", "Juguito aloe pera", 1007, 890,0);

        ofertas ofertas1 = new ofertas("ofertas", "2 vinos tintos arturo vidal", 1010, 1020,0);
        ofertas ofertas2 = new ofertas("ofertas", "3 galletas marca josefina", 1011, 590,0);

        claseparacompras compra = new claseparacompras("Javier gonzales martinez", 1, 1, 2020);
        // A comentar, que el string productoscomprados se refiere a los datos del cliente, como seria nombre, rut etc etc


        int menu = 1;
        int chequeodedatostotal = 0;
        String inputuser;
        String inputuserinmenu;
        int inputuserint;
        int inputuserdia;
        int inputusermes;
        int inputuseranno;
        int codigosparacrearnuevosobjetos;
        int objetocreado = 1;
        int preciodelacompra = 1;

        String temporarydatastorage;


        System.out.println("Bienvenido al menu de usuario de la tienda Sebastian");
        while (menu == 1) {
            while (chequeodedatostotal == 0) {
                System.out.println("Realizando chequeo de datos");
                abarrotes1.revisarproductos();
                abarrotes2.revisarproductos();
                aseo1.revisarproductos();
                aseo2.revisarproductos();
                abarrotes1.revisarproductos();
                abarrotes2.revisarproductos();
                ofertas1.revisarproductos();
                ofertas2.revisarproductos();
                System.out.println("Chequeo de datos listo");
                chequeodedatostotal = 1;
            }
            ArrayList<claseparaproductos> objetosenventa = new ArrayList<claseparaproductos>();
            objetosenventa.add(abarrotes1);
            objetosenventa.add(abarrotes2);
            objetosenventa.add(aseo1);
            objetosenventa.add(aseo2);
            objetosenventa.add(congelados1);
            objetosenventa.add(congelados2);
            objetosenventa.add(liquidos1);
            objetosenventa.add(liquidos2);
            objetosenventa.add(ofertas1);
            objetosenventa.add(ofertas2);


            System.out.println("Analizando cantidad de objetos" );
            for (int i = 0; i < objetosenventa.size(); i++) {
                System.out.println("Tipo: " + objetosenventa.get(i).getTipo() + " |Descripcion: " + objetosenventa.get(i).getDescripcion() + " |Codigo: " + objetosenventa.get(i).getCodigo() + " |Precio: " + objetosenventa.get(i).getPrecio() + " |Cantidad en carrito: " + objetosenventa.get(i).getCantidadencarrito());
            }



            System.out.println("");

            System.out.println("Menu Principal");
            System.out.println("Que funcion desea usar, porfavor notese en usar las mayusculas al inicio de la oracion. Notese que debe generar la compra");
            System.out.println("Cambiar productos");
            System.out.println("Generar productos");
            System.out.println("Generar compra");
            System.out.println("Revisar Oferta");
            System.out.println("Modificar cantidades");
            System.out.println("Imprimir compra");
            System.out.println("Salir");
            Scanner scanObject = new Scanner(System.in);
            inputuser = scanObject.nextLine();
            System.out.println("Usted puso: " + inputuser);
            switch (inputuser) {
                case "Cambiar productos":
                    for (int i = 0; i < objetosenventa.size(); i++) {
                        System.out.println(i);
                        System.out.println("Tipo: " + objetosenventa.get(i).getTipo() + " |Descripcion: " + objetosenventa.get(i).getDescripcion() + " |Codigo: " + objetosenventa.get(i).getCodigo() + " |Precio: " + objetosenventa.get(i).getPrecio() + " |Cantidad en carrito: " + objetosenventa.get(i).getCantidadencarrito());
                    }
                    System.out.println("Indique el numero del objeto que desea editar");
                    inputuserint = scanObject.nextInt();
                    System.out.println("Usted coloco" + inputuserint);
                    System.out.println("Ingrese nueva descripcion");
                    inputuserinmenu = scanObject.nextLine();
                    inputuserinmenu = scanObject.nextLine();
                    System.out.println("Ingrese nuevo codigo");
                    inputuserdia = scanObject.nextInt();
                    System.out.println("Ingrese nuevo precio");
                    inputusermes = scanObject.nextInt();
                    System.out.println("Ingrese nueva cantidad en carrito");
                    inputuseranno = scanObject.nextInt();
                    objetosenventa.get(inputuserint).setDescripcion(inputuserinmenu);
                    objetosenventa.get(inputuserint).setCodigo(inputuserdia);
                    objetosenventa.get(inputuserint).setPrecio(inputusermes);
                    objetosenventa.get(inputuserint).setCantidadencarrito(inputuseranno);

                    System.out.println("Cambios hechos:");
                    System.out.println("Descripcion: " + objetosenventa.get(inputuserint).getDescripcion() + " |Codigo: " + objetosenventa.get(inputuserint).getCodigo() + " |Precio: " + objetosenventa.get(inputuserint).getPrecio() + " |Cantidad en carrito: " + objetosenventa.get(inputuserint).getCantidadencarrito());
                    objetosenventa.get(inputuserint).revisarproductos();
                    break;
                case "Generar productos":
                    System.out.println("Bienvenido al genera productos, ingrese tipo de producto abarrotes, aseo, congelados, liquidos o ofertas. (Use minuscula al inicio:");
                    inputuserinmenu = scanObject.nextLine();
                    System.out.println(inputuserinmenu);
                    System.out.println("Ahora ponga una descripcion:");
                    inputuser = scanObject.nextLine();
                    System.out.println("Ingrese codigo");
                    inputuserdia = scanObject.nextInt();
                    System.out.println("Ingrese precio");
                    inputusermes = scanObject.nextInt();
                    System.out.println("Ingrese cantidad en carrito");
                    inputuseranno = scanObject.nextInt();

                    switch (inputuserinmenu) {
                        case "abarrotes":
                            abarrotes abarrotes3 = new abarrotes(inputuserinmenu, inputuser, inputuserdia, inputusermes,inputuseranno);
                            System.out.println(abarrotes3.getCodigo());
                            objetosenventa.add(abarrotes3);
                            abarrotes3.revisarproductos();
                            break;
                        case "aseo":
                            aseo aseo3 = new aseo(inputuserinmenu,inputuser,inputuserdia,inputusermes, inputuseranno);
                            objetosenventa.add(aseo3);
                            aseo3.revisarproductos();
                            break;
                        case "congelados":
                            congelados congelado3 = new congelados(inputuserinmenu,inputuser,inputuserdia,inputusermes, inputuseranno);
                            objetosenventa.add(congelado3);
                            congelado3.revisarproductos();
                            break;
                        case "liquidos":
                            liquidos liquidos3 = new liquidos(inputuserinmenu,inputuser,inputuserdia,inputusermes, inputuseranno);
                            objetosenventa.add(liquidos3);
                            liquidos3.revisarproductos();
                            break;
                        case "ofertas":
                            ofertas oferta3 = new ofertas(inputuserinmenu,inputuser,inputuserdia,inputusermes, inputuseranno);
                            objetosenventa.add(oferta3);
                            oferta3.revisarproductos();
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                case "Generar compra":
                    System.out.println("Bienvenido al editor de compra, para empezar ingrese los datos del cliente y cualquier otra informacion relevante");
                    inputuserinmenu = scanObject.nextLine();
                    System.out.println("Usted coloco" + inputuserinmenu);
                    System.out.println("Indique dia de la compra");
                    inputuserdia = scanObject.nextInt();
                    System.out.println("Indique mes de la compra");
                    inputusermes = scanObject.nextInt();
                    System.out.println("Indique año de la compra");
                    inputuseranno = scanObject.nextInt();
                    System.out.println("agregue comentario, si no desea colocar comentario, indique no");
                    temporarydatastorage = scanObject.nextLine();
                    temporarydatastorage = scanObject.nextLine();
                    System.out.println("Usted coloco" + temporarydatastorage);
                    switch (temporarydatastorage) {
                        case "no":
                            compra.setProductoscomprados(inputuserinmenu);
                            compra.setDia(inputuserdia);
                            compra.setMes(inputusermes);
                            compra.setAnno(inputuseranno);
                            System.out.println("Descripcion :" + compra.getProductoscomprados() + " Dia: " + compra.getDia() + " Mes: " + compra.getMes() + " Año: " + compra.getAnno() + " Comentario: " + compra.getDescripcioncompra());
                            compra.revisarfechacompra();
                            Thread.sleep(4000);
                            break;
                        default:
                            compra.setProductoscomprados(inputuserinmenu);
                            compra.setDia(inputuserdia);
                            compra.setMes(inputusermes);
                            compra.setAnno(inputuseranno);
                            compra.setDescripcioncompra(temporarydatastorage);
                            System.out.println("Descripcion :" + compra.getProductoscomprados() + " Dia: " + compra.getDia() + " Mes: " + compra.getMes() + " Año: " + compra.getAnno() + " Comentario: " + compra.getDescripcioncompra());
                            compra.revisarfechacompra();
                            Thread.sleep(4000);
                            break;
                    }
                    break;
                case "Revisar oferta":
                    int pepitotierras;
                    int pepitotierras2;
                    for (int i = 0; i < objetosenventa.size(); i++) {
                        pepitotierras = objetosenventa.get(i).getCodigo();
                        for (int j = 0; j < objetosenventa.size(); j++) {
                            pepitotierras2 = objetosenventa.get(j).getCodigo();
                            if (objetosenventa.get(j).getDescripcion().equals("ofertas") && pepitotierras == pepitotierras2 && !objetosenventa.get(i).getDescripcion().equals("ofertas") && objetosenventa.get(j).getCodigo() >= 1 && objetosenventa.get(i).getCodigo() >= 1){
                                objetosenventa.get(i).setCantidadencarrito(0);
                                System.out.println("Oferta encontrada, no ofertas sacadas");

                            }
                        }
                        System.out.println(objetosenventa.get(i).getCantidadencarrito());
                    }
                    break;
                case "Modificar cantidades":
                    for (int i = 0; i < objetosenventa.size(); i++) {
                        System.out.println(i);
                        System.out.println("|Precio: " + objetosenventa.get(i).getPrecio() + " |Cantidad en carrito: " + objetosenventa.get(i).getCantidadencarrito());
                    }
                    System.out.println("Indique el numero del objeto que desea editar");
                    inputuserint = scanObject.nextInt();
                    System.out.println("Usted coloco" + inputuserint);
                    System.out.println("Ingrese nueva cantidad en carrito");
                    inputuseranno = scanObject.nextInt();
                    objetosenventa.get(inputuserint).setCantidadencarrito(inputuseranno);
                    break;
                case "Imprimir compra":
                    preciodelacompra = 0;
                    System.out.println("###################################################################################");
                    for (int i = 0; i < objetosenventa.size(); i++) {
                        preciodelacompra = objetosenventa.get(i).getPrecio() * objetosenventa.get(i).getCantidadencarrito() + preciodelacompra;
                        if (objetosenventa.get(i).getCantidadencarrito() >= 1) {
                            System.out.println(" Precio: " + objetosenventa.get(i).getPrecio() + " Cantidad: " + objetosenventa.get(i).getCantidadencarrito() + " Total: " + preciodelacompra);
                        }
                    }
                    System.out.println("Descripcion : " + compra.getProductoscomprados() + " Dia: " + compra.getDia() + " Mes: " + compra.getMes() + " Año: " + compra.getAnno() + " Comentario: " + compra.getDescripcioncompra() + " Precio: " + preciodelacompra);
                    System.out.println("###################################################################################");
                    for (int i = 0; i < objetosenventa.size(); i++) {
                        if (objetosenventa.get(i).getCantidadencarrito() >= 1) {
                            objetosenventa.get(i).instrucionescompra();
                        }
                    }
                    System.out.println("###################################################################################");
                    Thread.sleep(5000);
                    Calendar calndr = Calendar.getInstance();
                    String juanito1=String.valueOf(calndr.get(Calendar.YEAR));
                    String juanito2=String.valueOf(calndr.get(Calendar.MONTH));
                    String juanito3=String.valueOf(calndr.get(Calendar.DAY_OF_MONTH));
                    String elepepe;
                    try {
                        FileWriter myWriter = new FileWriter(compra.getProductoscomprados() + juanito1 + juanito2 + juanito3 + ".txt");
                        myWriter.write("Datos de compra");
                        myWriter.write("\n");
                        for (int i = 0; i < objetosenventa.size(); i++) {
                            preciodelacompra = objetosenventa.get(i).getPrecio() * objetosenventa.get(i).getCantidadencarrito() + preciodelacompra;
                            if (objetosenventa.get(i).getCantidadencarrito() >= 1) {
                                myWriter.write(" Precio: " + objetosenventa.get(i).getPrecio() + " Cantidad: " + objetosenventa.get(i).getCantidadencarrito() + " Total: " + preciodelacompra);
                                myWriter.write("\n");
                            }
                        }
                        myWriter.write("\n");
                        myWriter.write("Descripcion : " + compra.getProductoscomprados() + " Dia: " + compra.getDia() + " Mes: " + compra.getMes() + " Año: " + compra.getAnno() + " Comentario: " + compra.getDescripcioncompra() + " TOTAL: " + preciodelacompra);
                        myWriter.write("\n");
                        for (int i = 0; i < objetosenventa.size(); i++) {
                            if (objetosenventa.get(i).getCantidadencarrito() >= 1) {
                                myWriter.write(objetosenventa.get(i).instrucionescompra2());
                                myWriter.write("\n");
                            }
                        }
                        myWriter.write("\n");
                        myWriter.write("###################################################################################");
                        myWriter.close();
                        System.out.println("###################################################################################");
                        System.out.println("Escritura exitosa.");
                    } catch (IOException e) {
                        System.out.println("Error en escritura!.");
                        e.printStackTrace();
                    }
                    break;
                case "Salir":
                    menu = 0;
                    break;
                default:
                    System.out.println("Error de ingresado");
                    break;
            }


        }
    }
}
