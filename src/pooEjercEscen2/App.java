package pooEjercEscen2;

import pooEjercEscen2.dominio.Categoria;
import pooEjercEscen2.dominio.PrecioActual;
import pooEjercEscen2.dominio.PrecioTachado;
import pooEjercEscen2.dominio.Producto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class App {
    //Atributo Global de la clase
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(crearProducto().toString());

        List<Categoria> categoriaList = new ArrayList<>();


    }
    private static Producto crearProducto(){
        Producto productoNuevo = new Producto();


        productoNuevo.setId(UUID.randomUUID());

        System.out.println("Ingrese el Nombre del Producto: ");
        //String nombreProducto = entrada.nextLine();
        productoNuevo.setNombre(getScanner().nextLine());
        System.out.println("Ingrese la descripción del Producto: ");
        productoNuevo.setDescripcion(getScanner().nextLine());

        productoNuevo.setPrecioActual(crearPrecioActual());


        System.out.println("Tiene Descuento?: Si ingrese 1 - No ingrese 0");
        int quieroDescuento = getScanner().nextInt();

        if (quieroDescuento == 1){


            //Precio tachado

            productoNuevo.setPrecioTachado(crearPrecioTachado(productoNuevo.getPrecioActual()));
            //Precio con descuento

            productoNuevo.setPrecioActual(crearPrecioActual());

            double precioTachado = productoNuevo.getPrecioTachado().getValor();
            double precioActual = productoNuevo.getPrecioActual().getValor();

            int descuento = (int) (100 - ((precioActual/precioTachado) * 100));

            productoNuevo.setDescuento(descuento);

        }


        return productoNuevo;


    }
    private static PrecioActual crearPrecioActual(){
        PrecioActual precioActual = new PrecioActual();
        System.out.println("Ingrese el Precio del Producto : ");
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

    //Crear Categoria
    //Construir la catregoria
    //Instanciar categorias
    private static Categoria crearCategoria(){
        Categoria categoria = new Categoria();

        categoria.setNombre("Categoria Randon");
        categoria.setDescripcion("Descripcion Cualquiera");
        categoria.setListaProductos(new ArrayList<>());

    }


    public static Scanner getScanner() {
        return scanner;
    }
}
