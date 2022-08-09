package Agenda;

import java.util.Arrays;
import java.util.List;

public class Principal  {

public static void main(String[] args) {
		
PersonaMetodos m = new PersonaMetodos();
		
		
List<Persona> list = Arrays.asList(new Persona("Jose", 557767788, "HEH56UC", 23, true), new Persona("Daniela", 557767743, "RTEO34564", 24, true),
new Persona("Danae", 558989788, "HGD453S", 25, false), new Persona("Ariadna", 557766333, "TXXZC32", 23, false));
		
Persona p = m.getMPersona(list);
List<Persona> l = m.getH(list);
l.stream().forEach(x -> System.out.println(x));
System.out.println("Mayor edad: " + p.toString());
	}
}
