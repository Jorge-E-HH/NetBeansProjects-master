package chainPattern;

public class Ministro implements Jerarca{
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
		if(pClasificacionDocumento==2){
			System.out.println("Leido por el ministro");
		}else{
			this.next.verDocumento(pClasificacionDocumento);
		}
	}