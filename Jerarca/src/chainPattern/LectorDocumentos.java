package chainPattern;

public class LectorDocumentos {

	public static void main(String[] args) {
		Gobierno gobierno = new Gobierno();
		
		/*
		 * Suponiendo que los archivos se clasifican de la siguiente forma
		 * 1. Clasificado
		 * 2. Secreto
		 * 3. Muy Secreto
		 */
		
		gobierno.verDocumento(2);
		gobierno.verDocumento(1);
		gobierno.verDocumento(3);

	}

}
