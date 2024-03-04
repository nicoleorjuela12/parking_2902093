package org.parkingg.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

    private String nombres;
    private String apellidos;
    private Long numeroIdentificacion;
    private List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();
    
    //definir metodo de clase
    //addCar: vincular un carrito al cliente 

    public void addVehiculo(Vehiculo vehiculo){
        //añadir el carro a la lista
        //this sirve para accder a atributos y metodos al interior del objeto
        //NOTA: usenla al interior de metodos
        this.misVehiculos.add(vehiculo);
        

    }
    // otra sobrecarga del metodo
    //addvehicle:
    public void addVehiculo(String placa, TipoVehiculo tv){

        Vehiculo v = new Vehiculo();

        //estamos utilizando el set de placa para asiganr
        // el valor de la placa al nuevo vehiculo
        v.setPlaca(placa);
        v.setTipoVehiculo(tv);
        this.misVehiculos.add(v);

    }

    //CONSTRUCTOR SIN PARAMETROS
    public Cliente() {
    }

    //CONSTRUCTOR con PARAMETROS
    public Cliente(String nombres, String apellidos, Long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }


    //getters and setters
     public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }
    public void setMisVehiculos(List<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    }



    
    


    
    
}
