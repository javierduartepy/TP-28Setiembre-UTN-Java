package gestioninventario;

public class MainDesafio {
    public static void main(String[] args) {
        Producto productoUno = new Producto();
        productoUno.setCodigo("P-001");
        productoUno.setNombre("Teclado mecánico");
        productoUno.setPrecio(45000.0);
        productoUno.setStock(12);

        Producto productoDos = new Producto();
        productoDos.setCodigo("P-002");
        productoDos.setNombre("Mouse óptico");
        productoDos.setPrecio(15000.0);
        productoDos.setStock(25);

        Producto productoTres = new Producto();
        productoTres.setCodigo("P-003");
        productoTres.setNombre("Monitor 24 pulgadas");
        productoTres.setPrecio(180000.0);
        productoTres.setStock(5);

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