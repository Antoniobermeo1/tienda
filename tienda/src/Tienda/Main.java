package Tienda;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;


public class Main {

    public static Fecha fecha = new Fecha();
    public static Scanner in = new Scanner(System.in);
    
    public static void definirFecha(){
        fecha.setDia(15);
        fecha.setMes(7);
        fecha.setAnio(2020);
    }
    
    public static void Adelantar(){
        int diaActual = fecha.getDia();
        int mesActual = fecha.getMes();
        int anioActual = fecha.getAnio();
        
        Calendar oFecha = Calendar.getInstance();
        oFecha.set(anioActual, mesActual, diaActual);
        
       
        oFecha.add(Calendar.DAY_OF_MONTH, fecha.getDia());
        oFecha.add(Calendar.MONTH, fecha.getMes());
        oFecha.add(Calendar.YEAR, fecha.getAnio());
        
        fecha.setAnio(oFecha.get(Calendar.YEAR));
        fecha.setMes(oFecha.get(Calendar.MONTH));
        fecha.setDia(oFecha.get(Calendar.DAY_OF_MONTH)+5);
        
        
    }
    
    public static String imprimirFecha(){
        return "\nDia: "+fecha.getDia()+
                "\nMes: "+fecha.getMes()+
                "\nAnio: "+fecha.getAnio();
    }
    
    public static void main(String[] args) {
        
        Producto p1 = new Producto();
        
        LocalDate date = LocalDate.of(2020, 8, 7);
        LocalDate newDate = date.plusDays(10);
        
        
        char opc = 0;
        String respuesta;
        p1.setIVA(0.09f);
        p1.setPrecio(5.0f);
        do{
            System.out.print("\nIngresar nombre del producto: "); p1.setNombreProducto(in.next());
            
            System.out.println("\nGenerando codigo para dicho producto...");
            System.out.println("\nCodigo de "+p1.getNombreProducto()+" es: "+p1.codigoProducto());
            
            System.out.println("Su fecha de elaboracion "+p1.getNombreProducto()+" es: ");
             
            if(opc == 's' || opc == 'S'){
                System.out.println(newDate);
            }
            else{
                System.out.println(date);
            }
            
            System.out.println("El IVA es: "+p1.getIVA());
            System.out.println("Mostrando el precio: ");
            System.out.println("Precio sin IVA de "+p1.getNombreProducto() +" es: "+p1.getPrecio());
            System.out.println("El precio total de "+p1.getNombreProducto()+" es: "+p1.precioTotal());
            
            System.out.print("Desea adquirir este producto: "+p1.getNombreProducto()+" ?(si/no)"); respuesta = in.next();
            
            if("si".equals(respuesta)){
                System.out.println("\nUsted ha adquirido el producto "+p1.getNombreProducto());
            }
            else{
                System.out.println("\nUsted ha decisido no adquirir el producto "+p1.getNombreProducto());
            }
            
            System.out.print("Desea ingresar otro producto? (s/n): "); opc = in.next().charAt(0);
        }while(opc == 's' || opc == 'S');
        
        
    }
    
}
