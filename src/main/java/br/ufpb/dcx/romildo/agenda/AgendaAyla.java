package br.ufpb.dcx.romildo.agenda;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class AgendaAyla implements Agenda{

    private Map<String, Contato> contatos;

    public AgendaAyla() {
        contatos = new HashMap<>();
    }

    public boolean cadastraContato(String nome, int dia, int mes){
        if (!contatos.containsKey(nome)) {
            Contato c = new Contato(nome, dia, mes);
            contatos.put(nome, c);
            return true;
        }
        return false;

    }
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes){

    }
    public boolean removeContato(String nome) throws ContatoInexistenteException{

    }
    public void salvarDados() throws IOException{

    }
    public void recuperarDados() throws IOException{

    }
}
