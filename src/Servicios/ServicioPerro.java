package Servicios;

import Entidades.Perro;
import Enums.Raza;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ServicioPerro {

    LinkedList<Perro> listadoPerros = new LinkedList();

    public LinkedList crearPerros() {

        for (int i = 0; i < 8; i++) {
            Perro nuevoPerro = new Perro();
            nuevoPerro.setNombre(Raza.values()[i].getNombre());
            nuevoPerro.setRaza(Raza.values()[i]);
            nuevoPerro.setImagen(Raza.values()[i].getImagen());
            nuevoPerro.setAdoptado(false);
            listadoPerros.add(nuevoPerro);
        }

        return listadoPerros;
    }

    public void agregarImagen(JLabel component, String root) {

        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(component.getWidth(), component.getHeight(), Image.SCALE_DEFAULT));
        component.setIcon(icon);
        component.repaint();
    }
}
