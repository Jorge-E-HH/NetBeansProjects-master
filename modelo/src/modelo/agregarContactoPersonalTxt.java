
package modelo;
import java.io.FileWriter;
import java.io.IOException;
/**
     * Agregar las datos contactoPesonal al archovo de texto
     *
     * @throws IOException
     */
    public void agregarContactoPersonalTxt() throws IOException {
        FileWriter archivo = new FileWriter("src/archivos/contactosPersonales.txt");
        for (Contacto contact : contactos) {
            if (contact instanceof ContactoPersonal) {
                contPersonal = (ContactoPersonal) contact;

                archivo.write(
                        contPersonal.getId() + "/"
                        + contPersonal.getNombre() + "/"
                        + contPersonal.getGenero() + "/"
                        + contPersonal.getTelefono() + "/"
                        + contPersonal.getFechaCumpleaÃ±os().getDia() + "-"
                        + contPersonal.getFechaCumpleaÃ±os().getMes() + "-"
                        + contPersonal.getFechaCumpleaÃ±os().getAnio() + "\n");
            }
        }
        archivo.close();
    }



