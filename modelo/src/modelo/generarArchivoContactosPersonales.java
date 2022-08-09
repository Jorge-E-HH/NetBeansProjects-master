
package modelo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
     * guarda un archivo con el informe de contacots personales
     *
     * @param selectedFile
     * @throws IOException
     */
    public void generarArchivoContactosPersonales(File selectedFile) throws IOException {
        FileWriter w = new FileWriter(selectedFile);
        BufferedWriter bw = new BufferedWriter(w);

        PrintWriter wr = new PrintWriter(bw);
        for (Contacto contacto : contactos) {
            if (contacto instanceof ContactoPersonal) {

                contPersonal = (ContactoPersonal) contacto;
                wr.write(
                        "Numbre:" + contPersonal.nombre + " Telefono:" + contPersonal.getTelefono() + "\n"
                        + "******************************************************************* \n");//escribimos en el archivo

            }
        }
        wr.close();
        bw.close();
    }



