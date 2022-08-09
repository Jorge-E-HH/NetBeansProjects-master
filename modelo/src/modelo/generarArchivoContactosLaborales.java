
package modelo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
     * guarda un archivo con el informe de contacots laborales
     *
     * @param selectedFile
     * @throws IOException
     */
    public void generarArchivoContactosLaborales(File selectedFile) throws IOException {
        FileWriter w = new FileWriter(selectedFile);
        BufferedWriter bw = new BufferedWriter(w);

        PrintWriter wr = new PrintWriter(bw);
        for (Contacto contacto : contactos) {
            contLaboral = (ContactoLaboral) contacto;
            wr.write(
                    "Numbre:" + contLaboral.nombre + " Telefono:" + contLaboral.getTelefono() + "\n"
                    + "******************************************************************* \n");//escribimos en el archivo

        }
        wr.close();
        bw.close();
    }
}


