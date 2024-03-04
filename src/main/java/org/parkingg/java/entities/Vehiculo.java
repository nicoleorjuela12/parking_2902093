package org.parkingg.java.entities;

public class Vehiculo {

    //atributos de clase
    //1.modificador de acceso 
    //2.Tipo de del atributo
    //3. Nombre del atributo


    //los atributos de una clase 
    //para cumplir con el encapsulamiento 
    //deben ser privados
    private String placa;
    private TipoVehiculo tipoVehiculo;
    //constructor
    //sin parametros: constructor por defecto 
    public Vehiculo() {
    }

    //constructor parametrizado
    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    //getters and setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    

}
