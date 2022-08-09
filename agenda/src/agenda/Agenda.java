
package agenda;

import java.util.Vector;

public class Agenda {
    
    private Vector listaContatos;
    
    public Agenda(){
        listaContatos = new Vector();
    }

    public String adicionarContato(Contato novoContato){
            listaContatos.add(novoContato);
            return "Contato cadastrado com sucesso!";
    }
}