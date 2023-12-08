import Info_Producto.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("01","producto1",20);
        System.out.println("El producto de código " + producto1.getCodigo() + " y nombre " +
                producto1.getNombre() +" tiene un precio de " + producto1.getPrecio() + " euros.");
        Producto producto2 = new Producto("01","producto1",20);
        System.out.println("El producto de código " + producto2.getCodigo() + " y nombre " +
                producto2.getNombre() +" tiene un precio de " + producto2.getPrecio() + " euros.");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el código del producto:");
        String codigo = entrada.next();

        System.out.println("Ingresa el nombre del producto:");
        String nombre = entrada.next();

        System.out.println("Ingresa el precio del producto:");
        float precio = entrada.nextFloat();
        Producto producto3 = new Producto(codigo,nombre,precio);
        System.out.println("El producto de código " + producto3.getCodigo() + " y nombre " +
                producto3.getNombre() +" tiene un precio de " + producto3.getPrecio() + " euros.");
    }
}