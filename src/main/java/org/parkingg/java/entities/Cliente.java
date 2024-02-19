package org.parkingg.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

    public String nombres;
    public String apellidos;
    public Long numeroIdentificacion;
    public List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();
    
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
        v.placa = placa;
        v.tipoVehiculo= tv;
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

    


    
    
}
