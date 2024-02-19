package org.parkingg.java;

import org.parkingg.java.entities.Cliente;
import org.parkingg.java.entities.TipoVehiculo;
import org.parkingg.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
        //sistema de gestion de E/S
        // de vehiculos de un parking 
        
        //Objetos(instancias)
        //1.Tipo de clase
        //2. Nombre del objeto
        //3. asignacion y new
        
        Vehiculo carrito1 = new Vehiculo("ASD 789",TipoVehiculo.PARTICULAR);


        Vehiculo carrito2 = new Vehiculo("GRY 754", TipoVehiculo.MOTO);
        
        //crear(instanciar) un cliente
        Cliente cliente1 = new Cliente("Nicolas","Fandiño Quecan",1031650415L);
        
        //invocar el metodo 

        cliente1.addVehiculo(carrito1);
        cliente1.addVehiculo(carrito2);
        cliente1.addVehiculo("www ert",TipoVehiculo.MOTO);

        //recorrrer la lista de vehiculos del cliente
        
        for(Vehiculo v :cliente1.misVehiculos){
            System.out.println(v.placa);
            System.out.println(v.tipoVehiculo);
            System.out.println("----------");
           
        }


    }

   
}