public class Biblioteca {
    
    private String nombre;
    private Libro[] catalogo;
    private int cantidad;


    //CONSTRUCTOR

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.catalogo = new Libro[10];
        this.cantidad = 0;
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public Libro[] getCatalogo() {
        return catalogo;
    }

    public int getCantidad() {
        return cantidad;
    }




    //METODOS

    // Agrega un libro al catálogo de la biblioteca, el libro ya existe por fuera de la clase Biblioteca, agregación aqui.
    public void agregarLibro(Libro libro) {
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = libro;
            cantidad++;
            System.out.println("Libro agregado al catálogo: " + libro.getTitulo());
        } else {
            System.out.println("No se puede agregar más libros. El catálogo está lleno.");
        }
    }


    //IMPRIME EL CATALOGO DE LA BIBLIOTECA

    public void mostrarCatalogo() {
        System.out.println("Catálogo de la biblioteca " + nombre + ":");
        if (cantidad == 0) {
            System.out.println("El catálogo está vacío.");
        } else{
            for (int i = 0; i < cantidad; i++) {
                catalogo[i].mostrarInfo();
                System.out.println();
            }
        }
    }


    //BUSCA UN LIBRO POR AUTOR E IMPRIME LOS QUE COINCIDEN

    public void buscarPorAutor(String autor) {
        boolean encontrado = false;
        System.out.println("Libros del autor " + autor + ":");
        for (int i = 0; i < cantidad; i++) {
            if (catalogo[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println("Título: " + catalogo[i].getTitulo());
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros de este autor.");
        }
    }

}
