package br.ufpb.dcx.romildo.agenda;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class AgendaAyla implements Agenda{

    private Map<String, Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla() {
        contatos = new HashMap<>();
        gravador = new GravadorDeDados();
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
        Collection<Contato> aniversariantes = new ArrayList<>();
        for (Contato c : contatos.values()) {
            if (c.getDiaAniversario() == dia && c.getMesAniversario() == mes) {
                aniversariantes.add(c);
            }
        }
        return aniversariantes;

    }
    public boolean removeContato(String nome) throws ContatoInexistenteException{
        if (!contatos.containsKey(nome)) {
            throw new ContatoInexistenteException();
        }
        contatos.remove(nome);
        return true;
    }
    public void salvarDados() throws IOException{
        try {
            gravador.salvarContatos(contatos);
        } catch (IOException e) {
            System.err.println("Não foi possivel salvar");
            e.printStackTrace();
        }


    }
    public void recuperarDados() throws IOException{
        try{
            this.contatos = gravador.recuperarContatos();
        } catch (IOException e) {
            System.err.println("Não foi possível recuperar");
            e.printStackTrace();
        }

    }
}
