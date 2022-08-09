package modelo;
/**
     * lee los datos de Contactos Personales y los agrega a la lista de
     * Contactos
     *
     * @throws IOException
     */
    public void cargarContactoPersonal() throws IOException {
        FileReader entrada = new FileReader("src/archivos/contactosPersonales.txt");
        BufferedReader archivo = new BufferedReader(entrada);
        String linea = archivo.readLine();

        //cargar info de apartamentso persistda  

        while (linea != null) {
            String datos[] = linea.split("/");
            String id = datos[0];
            String nombre = datos[1];
            String genero = datos[2];
            String telefono = datos[3];
            String fecha = datos[4];

            String datos2[] = fecha.split("-");
            int dia = Integer.parseInt(datos2[0]);
            int mes = Integer.parseInt(datos2[1]);
            int anio = Integer.parseInt(datos2[2]);
            Fecha fecha1 = new Fecha(dia, mes, anio);
            contPersonal = new ContactoPersonal(id, nombre, genero, telefono, fecha1);
            contactos.add(contPersonal);



            linea = archivo.readLine();
        }
    }

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

