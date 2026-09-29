package gestioninventario;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    // Setters
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }

    public void venderUnidades(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a vender debe ser mayor a cero.");
        } else if (cantidad > stock) {
            System.out.println("Error: stock insuficiente para vender "
                    + cantidad + " unidades de " + nombre + ".");
        } else {
            stock -= cantidad;
            System.out.println("Venta realizada: "
                    + cantidad + " unidades de " + nombre + ". Stock restante: " + stock);
        }
    }

    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Reposición registrada: +"
                    + cantidad + " unidades. Stock actual: " + stock);
        } else {
            System.out.println("Error: la cantidad a reponer debe ser mayor a cero.");
        }
    }

    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio < 0) {
            System.out.println("Error: el precio no puede ser negativo.");
            return;
        }
        double precioAnterior = this.precio;
        this.precio = nuevoPrecio;
        System.out.println("Precio actualizado de "
                + nombre + ": $" + precioAnterior + " -> $" + this.precio);
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Error: el porcentaje de descuento ("
                    + porcentaje + "%) debe estar entre 0 y 100.");
        } else {
            double descuento = this.precio * (porcentaje / 100.0);
            double precioAnterior = this.precio;
            this.precio -= descuento;
            System.out.println("Descuento del "
                    + porcentaje + "% aplicado a " + nombre + ": $" + precioAnterior +
                    " -> $" + this.precio);
        }
    }

    public void mostrarFicha() {
        System.out.println("=== Ficha de producto ===");
        System.out.println("Código:  " + codigo);
        System.out.println("Nombre:  " + nombre);
        System.out.println("Precio:  $" + precio);
        System.out.println("Stock:   " + stock);
        System.out.println("==========================");
    }
}