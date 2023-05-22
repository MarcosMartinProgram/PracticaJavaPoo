package pooEjercEscen2.dominio;

import java.time.LocalDateTime;

public class PrecioTachado {
    private double valor;
    private LocalDateTime fechaDeFinalizacion;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public void setFechaDeFinalizacion(LocalDateTime fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }
}
