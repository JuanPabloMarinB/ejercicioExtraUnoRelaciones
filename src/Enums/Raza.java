package Enums;

public enum Raza {

    AKITA("src/img/perritos/akita.png","Akita"), BULLDOG("src/img/perritos/bulldog.png","Bulldog"), FERNANDO_CHIQUITO("src/img/perritos/fernando_chiquito.png","Fernando Chiquito"), GOLDEN_RETRIEVER("src/img/perritos/golden_retriever.png","Golden retriver"), GRAN_DANES("src/img/perritos/gran_danes.png","Gran danés"), LABRADOR("src/img/perritos/labrador.png","Labrador"), PITBULL("src/img/perritos/pitbull.png","Pitbull"), SAN_BERNARDO("src/img/perritos/san_bernardo.png","San Bernardo");

    private Raza(String imagen, String nombre) {
        this.nombre = nombre;
        this.imagen = imagen;
    }
    
    
    private String nombre;
    private String imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    private Raza(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

}
