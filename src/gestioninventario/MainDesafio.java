package gestioninventario;

public class MainDesafio {
    public static void main(String[] args) {
        Producto productoUno = new Producto();
        productoUno.codigo = "P-001";
        productoUno.nombre = "Teclado mecánico";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        Producto productoDos = new Producto();
        productoDos.codigo = "P-002";
        productoDos.nombre = "Mouse óptico";
        productoDos.precio = 15000.0;
        productoDos.stock = 25;

        Producto productoTres = new Producto();
        productoTres.codigo = "P-003";
        productoTres.nombre = "Monitor 24 pulgadas";
        productoTres.precio = 180000.0;
        productoTres.stock = 5;

        System.out.println("--- PRUEBA DE DESCUENTOS ---");
        productoUno.aplicarDescuento(10.0);
        productoUno.aplicarDescuento(-15.0);
        productoUno.aplicarDescuento(120.0);

        System.out.println("\n--- RECORRIDO DE ARREGLO DE OBJETOS (FOR) ---");
        Producto[] inventario = new Producto[]{productoUno, productoDos, productoTres};

        for (int i = 0; i < inventario.length; i++) {
            inventario[i].mostrarFicha();
            System.out.println();
        }
    }
}
