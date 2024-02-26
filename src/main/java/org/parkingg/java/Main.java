package org.parkingg.java;
import org.parkingg.java.entities.Cliente;
import org.parkingg.java.entities.Cupo;
import org.parkingg.java.entities.Pago;
import org.parkingg.java.entities.TipoVehiculo;
import org.parkingg.java.entities.Vehiculo;
import org.parkingg.java.entities.Empleado;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args
     */
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

        // instanciar cupos 

        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        Empleado empleado1 = new Empleado("David","Londres","105");

        
        //crear fechas:

        LocalDateTime fechaHoraInicio =LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 0);

        LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.FEBRUARY, 10, 6, 15, 0);

        
        //hacer registros E/S de vehiculos

        Pago pago1 = new Pago(fechaHoraInicio,fechaHoraFin, 5000.0,cliente1.misVehiculos.get(0) ,cupito1,empleado1);

        Pago pago2 = new Pago(fechaHoraInicio,fechaHoraFin, 10000.0,cliente1.misVehiculos.get(1) ,cupito2,empleado1);

        //añadir pagos a una lista de pagos

        List<Pago>misPagos =new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);


        

        //recorrer los pagos para mostrar informacion 

        for(Pago p: misPagos){
            //evidencia a mostrar
            //placa del vehiculo - fecha o valor pagado - fecha y hora de inicio y fin - cupo del nombre
            System.out.print("Pago:|Placa" + p.vehiculo.placa + "|" );
            System.out.println("|valor: " + p.valor +"|");
            System.out.println("| fecha y hora entrada:" + p.fechaHoraInicio.toString()+ "|");
            System.out.println("|fecha y hora salida:"+p.fechaHoraFin.toString() + "|");
            System.out.println("|Cupo:"+p.cupo.nombre +"|");
            System.out.println("|Empleado:" +p.empleado.codigo +"|");
        }

    }

   
}