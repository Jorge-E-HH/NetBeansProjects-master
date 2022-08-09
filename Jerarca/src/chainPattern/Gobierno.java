package chainPattern;

public class Gobierno implements Jerarca{

	private Jerarca next;
	
	@Override
	public void setNext(Jerarca pJerarca) {
		this.next = pJerarca;
	}

	@Override
	public Jerarca getNext() {
		return this.next;
	}

	@Override
	public void verDocumento(int pClasificacionDocumento) {
		/* Se crean los integrantes de la cadena */
		Diputado diputado = new Diputado();
		Ministro ministro = new Ministro();
		Presidente presidente = new Presidente();
		
		/* Se asigna el primer encargado en la cadena */
		this.next = diputado;
		
		/* Se asignan la jerarquia en la cadena de responsabilidades */
		diputado.setNext(ministro);
		ministro.setNext(presidente);
		
		/* Se inicia la cadena */
		this.next.verDocumento(pClasificacionDocumento);
	}
}

