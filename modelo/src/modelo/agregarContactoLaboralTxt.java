
package modelo;
import java.io.FileWriter;
import java.io.IOException;
 /**
     * Agregar las datos contactoLaboral al archovo de texto
     *
     * @throws IOException
     */
    public void agregarContactoLaboralTxt() throws IOException {
        FileWriter archivo = new FileWriter("src/archivos/contactosLaborales.txt");
        for (Contacto contact : contactos) {
            if (contact instanceof ContactoLaboral) {
                ContactoLaboral contacto = (ContactoLaboral) contact;

                archivo.write(
                        contacto.getId() + "/"
                        + contacto.getNombre() + "/"
                        + contacto.getGenero() + "/"
                        + contacto.getTelefono() + "/"
                        + contacto.getEmail() + "\n");
            }



        }
        archivo.close();
    }



