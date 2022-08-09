package chainPattern;

public interface Jerarca {
	/* Asigna el siguiente jerarca en la cadena de responsabilidad*/
	public void setNext (Jerarca pJerarca);
	
	/*Retorna el siguiente Jerarca en la cadena de responsabilidad*/
	public Jerarca getNext();
	
	/*permite ver el documento dependiendo del acceso que tenga el Jerarca*/
	public void verDocumento(int pClasificacionDocumento);

}
