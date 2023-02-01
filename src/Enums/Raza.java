package Enums;

public enum Raza {

    AKITA("src/img/perritos/akita.png"), BULLDOG("src/img/perritos/bulldog.png"), FERNANDO_CHIQUITO("src/img/perritos/fernando_chiquito.png"), GOLDEN_RETRIEVER("src/img/perritos/golden_retriever.png"), GRAN_DANES("src/img/perritos/gran_danes.png"), LABRADOR("src/img/perritos/labrador.png"), PITBULL("src/img/perritos/pitbull.png"), SAN_BERNARDO("src/img/perritos/san_bernardo.png");
    
    private String imagen;

    private Raza(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

}
