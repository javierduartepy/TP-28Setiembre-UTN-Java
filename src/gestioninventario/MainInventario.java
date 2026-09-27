package gestioninventario;

public class MainInventario {
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

        productoUno.mostrarFicha();
        productoUno.venderUnidades(3);
        productoUno.venderUnidades(50);
        productoUno.reponerStock(20);
        productoUno.actualizarPrecio(39900.0);

        Producto copia = productoUno;
        copia.stock = 29;
        System.out.println("Stock de productoUno tras modificar copia: " + productoUno.stock + " (mismo objeto en el Heap)");

        System.out.println("\n--- DESAFÍO: APLICACIÓN DE DESCUENTOS ---");
        productoUno.aplicarDescuento(10.0);  // Caso válido
        productoUno.aplicarDescuento(-15.0); // Caso error: porcentaje negativo
        productoUno.aplicarDescuento(120.0); // Caso error: porcentaje > 100

        System.out.println("\n--- DESAFÍO: RECORRIDO DE ARREGLO CON FOR ---");
        Producto[] inventario = new Producto[]{productoUno, productoDos, productoTres};

        for (int i = 0; i < inventario.length; i++) {
            inventario[i].mostrarFicha();
            System.out.println();
        }
    }
}
