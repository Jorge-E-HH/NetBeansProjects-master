package Agenda;

import java.util.List;
import java.util.stream.Collectors;

public class PersonaMetodos implements GetH, GetMPersona {
	public List<Persona> getH(List<Persona> list) {
		return list.stream().filter(x -> x.isSexo()).collect(Collectors.toList());	
	}
	
	public Persona getMPersona(List<Persona> lista) {
		return lista.stream().filter(x -> !x.isSexo()).max((a,b) -> a.getEdad() - b.getEdad()).get();
	}
}
