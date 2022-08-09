package chainPattern;

public class Diputado implements Jerarca{
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
		if(pClasificacionDocumento==1){
			System.out.println("Leido por el diputado");
		}else{
			this.next.verDocumento(pClasificacionDocumento);
		}
	}
	
