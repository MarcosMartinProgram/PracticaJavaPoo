package poo;

import poo.dominio.Persona;
import poo.dominio.Vehiculo;

public class AppVehiculos {
    public static void main(String[] args) {
        //Instanciamos  vehiculo
        Vehiculo autito = new Vehiculo("Mercedes",4,true, false, "300", "25");
        Vehiculo autito2 = new Vehiculo("Audi", 5, false, true, "400", "0" );
        Vehiculo autito3 = new Vehiculo("Renault", 5, true, false, "250", "5");

/*
        autito.setMarca("Toyota");
        autito.setCantDeRuedas(5);
        autito.setEsDeComptencia(false);
        autito.setAlarmaEncendida(false);
        autito.setKmMaximo("350");
        autito.setKmMinimo("20");

        System.out.println(autito.getMarca());
        System.out.println(autito.getCantDeRuedas());
        System.out.println(autito.getEsDeCompetencia());
        System.out.println(autito.getAlarmaEncendida());
        System.out.println(autito.getKmMaximo());
        System.out.println(autito.getKmMinimo());

        System.out.println("\n");

        System.out.println(autito2.getMarca());
        System.out.println(autito2.getCantDeRuedas());
        System.out.println(autito2.getEsDeCompetencia());
        System.out.println(autito2.getAlarmaEncendida());
        System.out.println(autito2.getKmMaximo());
        System.out.println(autito2.getKmMinimo());

        System.out.println("\n");

        System.out.println(autito3.getMarca());
        System.out.println(autito3.getCantDeRuedas());
        System.out.println(autito3.getEsDeCompetencia());
        System.out.println(autito3.getAlarmaEncendida());
        System.out.println(autito3.getKmMaximo());
        System.out.println(autito3.getKmMinimo());
*/
        Vehiculo[] vehiculos = {autito, autito2, autito3};
        for (int i = 0; i < vehiculos.length; i++){
            vehiculos[i].arrancarVehiculo();        }

        Persona persona1 = new Persona( "Marcos", autito);
        Persona persona2 = new Persona( "Matias", autito3);

        Persona[] personas = {persona1, persona2};
        for (int i = 0; i < personas.length; i++){
            personas[i].getVehiculo().acelerarVehiculo();        }


    }
}
