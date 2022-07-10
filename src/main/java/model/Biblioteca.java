package model;

public class Biblioteca {
    private int idlibro;
    private String nombre;
    private String autor;
    private int cantPaginas;
    private double precio;
    private int copias;

    public Biblioteca(int idlibro, String nombre, String autor, int cantPaginas, double precio, int copias) {
        this.idlibro = idlibro;
        this.nombre = nombre;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.precio = precio;
        this.copias = copias;
    }

    public Biblioteca(String nombre, String autor, int cantPaginas, double precio, int copias) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.precio = precio;
        this.copias = copias;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", cantPaginas=" + cantPaginas + ", precio=" + precio + ", copias=" + copias + '}';
    }
}
