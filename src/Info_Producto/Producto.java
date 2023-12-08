package Info_Producto;

public class Producto {

    private String codigo;
    private String nombre;
    private float precio;

    public Producto() {
        codigo = "00";
        nombre = "producto 0";
        precio = 0;
    }

    public Producto(String codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 10;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public Producto(Info_Producto.Producto other) {
        this.codigo = other.codigo;
        this.nombre = other.nombre;
        this.precio = other.precio;
    }
}

