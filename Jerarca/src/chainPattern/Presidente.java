package chainPattern;

public class Presidente implements Jerarca{
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
		if(pClasificacionDocumento>=3){
			System.out.println("Leido por el presidente");
		}
	}
	
}
