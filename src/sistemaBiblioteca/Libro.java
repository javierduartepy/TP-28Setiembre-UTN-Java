package sistemaBiblioteca;

public final class Libro {

    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;
    private int prestamosHistoricos; // Desafío de extensión

    /**
     * Constructor canónico: único lugar donde reside la validación completa.
     */
    public Libro(String titulo, String autor, String isbn,
                 int copiasDisponibles, double precioReposicion) {
       
        if (titulo == null || titulo.isBlank()) {
            System.out.println("Título inválido, se usó \"Sin título\" por defecto.");
            this.titulo = "Sin título";
        } else {
            this.titulo = titulo;
        }

         if (autor == null || autor.isBlank()) {
            System.out.println("Autor inválido, se usó \"Autor desconocido\" por defecto.");
            this.autor = "Autor desconocido";
        } else {
            this.autor = autor;
        }

        if (isbn == null || isbn.isBlank()) {
            System.out.println("ISBN inválido, se usó \"ISBN pendiente\" por defecto.");
            this.isbn = "ISBN pendiente";
        } else {
            this.isbn = isbn;
        }

        if (copiasDisponibles < 0) {
            System.out.println("Copias disponibles no puede ser negativo, se usó 0 por defecto.");
            this.copiasDisponibles = 0;
        } else {
            this.copiasDisponibles = copiasDisponibles;
        }

        if (!validarPrecio(precioReposicion)) {
            System.out.println("Precio de reposición debe ser mayor a 0, se usó $15000.0 por defecto.");
            this.precioReposicion = 15000.0;
        } else {
            this.precioReposicion = precioReposicion;
        }

        this.prestamosHistoricos = 0;
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000.0);
    }


    private boolean validarPrecio(double precio) {
        return precio > 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public int getPrestamosHistoricos() {
        return prestamosHistoricos;
    }

    public boolean setPrecioReposicion(double precio) {
        if (validarPrecio(precio)) {
            this.precioReposicion = precio;
            return true;
        }
        return false;
    }

    public boolean prestar() {
        this.prestamosHistoricos++;
        if (this.copiasDisponibles > 0) {
            this.copiasDisponibles--;
            System.out.println("Préstamo registrado: " +
                    "\"" + this.titulo + "\". Copias disponibles: " + this.copiasDisponibles);
            return true;
        } else {
            System.out.println("Error: no hay copias disponibles de " +
                    "\"" + this.titulo + "\" para prestar.");
            return false;
        }
    }

    public void devolver() {
        this.copiasDisponibles++;
        System.out.println("Devolución registrada: " +
                "\"" + this.titulo + "\". Copias disponibles: " + this.copiasDisponibles);
    }

    public void mostrarFicha() {
        System.out.println("=== Ficha de libro ===");
        System.out.println("Título:  " + this.titulo);
        System.out.println("Autor:   " + this.autor);
        System.out.println("ISBN:    " + this.isbn);
        System.out.println("Copias disponibles: " + this.copiasDisponibles);
        System.out.println("Precio de reposición: $" + this.precioReposicion);
        System.out.println("=======================");
    }
}

record LibroRecord(String titulo, String autor, String isbn) {}
