package pooEjercEscen2;

import pooEjercEscen2.dominio.PrecioActual;
import pooEjercEscen2.dominio.PrecioTachado;
import pooEjercEscen2.dominio.Producto;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class App {
    //Atributo Global de la clase
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    private static Producto crearProducto(){
        Producto productoNuevo = new Producto();


        productoNuevo.setId(UUID.randomUUID());

        System.out.println("Ingrese el Nombre del Producto");
        //String nombreProducto = entrada.nextLine();
        productoNuevo.setNombre(getScanner().nextLine());
        System.out.println("Ingrese la descripción del Producto");
        productoNuevo.setDescripcion(getScanner().nextLine());
        System.out.println("Ingrese el Precio Actual del Producto");
        productoNuevo.setPrecioActual(crearPrecioActual());

        System.out.println("Tiene Descuento?: Si ingrese 1 - No ingrese 0");
        int quieroDescuento = getScanner().nextInt();

        if (quieroDescuento == 1){
            //Precio con descuento

            productoNuevo.setPrecioActual(crearPrecioActual());

            //Precio tachado

            productoNuevo.setPrecioTachado(crearPrecioTachado(productoNuevo.getPrecioActual()));

            productoNuevo.setDescuento();

        }

        productoNuevo.setDescuento();

        return productoNuevo;


    }
    private static PrecioActual crearPrecioActual(){
        PrecioActual precioActual = new PrecioActual();
        System.out.println("Ingrese Precio del Producto: ");
        precioActual.setValor(getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());
        return precioActual;
    }

    private static PrecioTachado crearPrecioTachado(){
        PrecioTachado precioTachado = new PrecioTachado();
        System.out.println("Ingrerse Precio Lista: ");
        precioTachado.setValor(getScanner().nextDouble());
        precioTachado.setFechaDeCarga(LocalDateTime.now());
        precioTachado.setFechaDeFinalizacion(LocalDateTime.of(2024,5,10,0,0));

        return precioTachado;
    }

    private static PrecioTachado crearPrecioTachado(PrecioActual precioActual){
        PrecioTachado precioTachado = new PrecioTachado();

        precioTachado.setValor(precioActual.getValor());
        precioTachado.setFechaDeCarga(precioActual.getFechaDeCarga());
        precioTachado.setFechaDeFinalizacion(precioActual.getFechaDeCarga());

        return precioTachado;
    }


    public static Scanner getScanner() {
        return scanner;
    }
}
