package poo.dominio;

public class Persona {
    private String nombre;
    private Vehiculo vehiculo;

    public Persona(String nombre, Vehiculo vehiculo) {
        this.nombre = nombre;
        // Puedo usar setNombre(nombre);(llamamos un metodo para inicializarlo)
        this.vehiculo = vehiculo;
        // Puedo usar setVehiculo(vehiculo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
