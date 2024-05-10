package funcionesEjer;

import java.util.ArrayList;
import java.util.List;

public class Funciones {
    static class Producto{
        String nombre;
        double  precio;

        Producto(String nombre, double precio){
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    static class CarritoCompra{
        List<Producto> productos = new ArrayList<>();
        //Función para agregar productos al carrito
        void agregarProducto(Producto barbie){
            productos.add(barbie);
        }

        double calcularTotal(){
            double total = 0;
            for(Producto barbie : productos){
                total += barbie.precio;
            }
            return total;
        }

        double calcularDescuento(){
            double total = calcularTotal();
            double descuento = total * 0.10;
            return descuento;
        }

        double calcularTotalConDescuento(){
            double total = calcularTotal();
            double descuento = calcularDescuento();

            return  total -descuento;
        }
    }

    public static void main(String[] args) {
        Producto munieca1 = new Producto("Chelsea", 98.50);
        Producto munieca2 = new Producto("Skipper", 99.50);
        Producto munieca3 = new Producto("Kelly", 75.20);
        Producto munieca4 = new Producto("Teresa", 120.20);
        Producto munieca5 = new Producto("Summer", 50.36);
        Producto munieca6 = new Producto("Barbara", 200.50);

        CarritoCompra carrito = new CarritoCompra();

        carrito.agregarProducto(munieca5);
        carrito.agregarProducto(munieca6);

        double totalCarrito = carrito.calcularTotal();
        double totalDescuento = carrito.calcularTotalConDescuento();
        System.out.println("Total de tu carrito $" + totalCarrito);
        System.out.println("Tu pago final con 10% de descuento es de $" + totalDescuento);
    }
}
