package gestioninventario;

public class MainInventario {
    public static void main(String[] args) {

        Producto productoUno = new Producto("P-001", "Teclado mecánico", 45000.0, 12);
        Producto productoDos = new Producto("P-002", "Mouse óptico", 15000.0, 25);
        Producto productoTres = new Producto("P-003", "Monitor 24 pulgadas", 180000.0, 5);

        productoUno.mostrarFicha();
        productoUno.venderUnidades(3);
        productoUno.venderUnidades(50);
        productoUno.reponerStock(20);
        productoUno.actualizarPrecio(39900.0);

        Producto copia = productoUno;
        copia.setStock(29); // Modificación controlada mediante setter
        System.out.println("Stock de productoUno tras modificar copia: " + productoUno.getStock() + " (mismo objeto en el Heap)");

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