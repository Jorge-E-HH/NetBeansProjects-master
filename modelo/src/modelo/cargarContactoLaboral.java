
package modelo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
     * lee los datos de Contactos Laborales y los agrega a la lista de Contactos
     *
     * @throws IOException
     */

    public void cargarContactoLaboral() throws IOException {
        FileReader entrada = new FileReader("src/archivos/contactosLaborales.txt");
        BufferedReader archivo = new BufferedReader(entrada);
        String linea = archivo.readLine();

        //cargar info de apartamentso persistda  

        while (linea != null) {
            String datos[] = linea.split("/");
            String id = datos[0];
            String nombre = datos[1];
            String genero = datos[2];
            String telefono = datos[3];
            String email = datos[4];


            contLaboral = new ContactoLaboral(id, nombre, genero, telefono, email);
            contactos.add(contLaboral);


            linea = archivo.readLine();
        }
    }


