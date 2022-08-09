package Agenda;

public class Persona {
private String nombre;
private int telefono;
private String rfc;
private int edad;
private boolean sexo;

public Persona(String nombre, int telefono, String rfc, int edad, boolean sexo) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.rfc = rfc;
		this.edad = edad;
		this.sexo = sexo;
	}

public String getNombre() {
		return nombre;
	}

public void setNombre(String nombre) {
		this.nombre = nombre;
	}

public int getTelefono() {
		return telefono;
	}

public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

public String getRfc() {
		return rfc;
	}

public void setRfc(String rfc) {
		this.rfc = rfc;
	}

public int getEdad() {
		return edad;
	}

public void setEdad(int edad) {
		this.edad = edad;
	}

public boolean isSexo() {
		return sexo;
	}

public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona('nombre=" + nombre + ", telefono=" + telefono + ", rfc=" + rfc + ", edad=" + edad + ", sexo=" + sexo + "')";
	}
}