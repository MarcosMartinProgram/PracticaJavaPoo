package pooPrimerParte.dominio;

public class Vehiculo {
    private String marca;
    private int cantDeRuedas;
    private boolean esDeCompetencia;
    private boolean alarmaEncendida;
    private String kmMaximo;
    private String kmMinimo;

    public void arrancarVehiculo(){
        if (this.alarmaEncendida){
            System.out.println("**SUENA ALARMA**");

        }else {
            System.out.println("**VEHICULO ENCENDIDO**");
        }
    }

    public void acelerarVehiculo(){
        if(this.alarmaEncendida) {
            System.out.println("**ALARMA ENCENDIDA**");

        }else {
            System.out.println("**VEHICULO ENCENDIDO**");
        }
    }

    //Constructor

    public Vehiculo(String marca, int cantDeRuedas, boolean esDeCompetencia, boolean alarmaEncendida, String kmMaximo, String kmMinimo){
        //Operaciones de inicialización
        this.marca = marca;
        this.cantDeRuedas = cantDeRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.alarmaEncendida = alarmaEncendida;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }
        public Vehiculo(String marca, int cantDeRuedas){
            this.marca = marca;
            this.cantDeRuedas = cantDeRuedas;
        }


        //Mostrar información
        public String getMarca(){

            return this.marca;
        }
        public void setMarca(String marca){
            this.marca = marca;
        }

        public int getCantDeRuedas(){
            return this.cantDeRuedas;
        }

        public void setCantDeRuedas(int cantDeRuedas){
            this.cantDeRuedas = cantDeRuedas;
        }

        public boolean getEsDeCompetencia(){
            return this.esDeCompetencia;
        }

        public void setEsDeComptencia(boolean esDeCompetencia){
            this.esDeCompetencia = esDeCompetencia;
        }

        public boolean getAlarmaEncendida() {
            return this.alarmaEncendida;
        }

        public void setAlarmaEncendida(boolean alarmaEncendida) {
            this.alarmaEncendida = alarmaEncendida;
        }

        public String getKmMaximo() {
            return this.kmMaximo;

        }

        public void setKmMaximo(String kmMaximo) {
            this.kmMaximo = kmMaximo;
        }

        public String getKmMinimo() {
            return this.kmMinimo;
        }

        public void setKmMinimo(String kmMinimo) {
            this.kmMinimo = kmMinimo;
        }
}
