package br.ufpb.dcx.romildo.agenda;


public class ContatoInexistenteException extends Exception {

    public ContatoInexistenteException(String msg) {
        super(msg);
    }

    public ContatoInexistenteException() {
        super("Contato Inexistente");
    }
}
