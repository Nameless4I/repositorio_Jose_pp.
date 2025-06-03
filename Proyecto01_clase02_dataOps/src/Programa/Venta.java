package Programa;

import java.util.Scanner;

public class Venta {
    public static void main(String[] args){
        //declarar variables    
        String vendedor;
        double venta1, venta2, venta3, comision, sm, sn;
        Scanner lectura = new Scanner(System.in);  
        
        //entrada
        System.out.print("Ingresar Vendedor:");
        vendedor = lectura.next();
        System.out.print("Ingresar Sueldo mensual:");
        sm = lectura.nextDouble();
        System.out.print("Ingresar Venta 1:");
        venta1 = lectura.nextDouble();
        System.out.print("Ingresar Venta 2:");
        venta2 = lectura.nextDouble();
        System.out.print("Ingresar Venta 3:");
        venta3 = lectura.nextDouble();
        //proceso
        comision=(venta1+venta2+venta3)*0.10;
        sn=sm+comision;
        //salida
        System.out.println("El nombre del vendedor es:"+vendedor);
        System.out.println("La comision de la venta es:"+comision);
        System.out.println("El sueldo neto es:"+sn);
    }
}