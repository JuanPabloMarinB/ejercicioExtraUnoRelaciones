package Entidades;


public class Usuario {
    
    private String nombre;
    private String DNI;
    private Perro nombrePerro;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Perro getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(Perro nombrePerro) {
        this.nombrePerro = nombrePerro;
    }
    
    

}
