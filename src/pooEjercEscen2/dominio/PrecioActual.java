package pooEjercEscen2.dominio;

import java.time.LocalDateTime;

public class PrecioActual {
    private double valor;
    private LocalDateTime fechaDeCarga;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(LocalDateTime fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }
}