package br.ufpb.dcx.romildo.agenda.controller;

import br.ufpb.dcx.romildo.agenda.Agenda;
import br.ufpb.dcx.romildo.agenda.ContatoInexistenteException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AgendaRemoveController implements ActionListener{

    private Agenda agenda;
    private JFrame janelaPrincipal;
    public AgendaRemoveController(Agenda agenda, JFrame janela) {
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome do aniversariante a remover?", "Remover", JOptionPane.INFORMATION_MESSAGE);
        boolean removeu = false;
        try {
            agenda.removeContato(nome);
            JOptionPane.showInputDialog(janelaPrincipal, "Aniversariante removido com sucesso", "Remover", JOptionPane.INFORMATION_MESSAGE);
        } catch (ContatoInexistenteException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Amiversariante não foi encontrado \n Operação não realizada" );
        }
    }

}
