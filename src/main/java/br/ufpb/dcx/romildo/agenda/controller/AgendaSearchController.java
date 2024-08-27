package br.ufpb.dcx.romildo.agenda.controller;

import br.ufpb.dcx.romildo.agenda.Agenda;
import javax.swing.*;
import br.ufpb.dcx.romildo.agenda.Contato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Collection;

public class AgendaSearchController implements ActionListener {

    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaSearchController(Agenda agenda, JFrame janela) {
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o dia do mês a pesquisar? [1-31]", "Procurar", JOptionPane.INFORMATION_MESSAGE));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o mês a pesquisar? [1-12]", "Procurar", JOptionPane.INFORMATION_MESSAGE));
        Collection<Contato> aniversariantes = agenda.pesquisaAniversariantes(dia, mes);
        if (aniversariantes.isEmpty()) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariantes encontrados:", "Procurar", JOptionPane.INFORMATION_MESSAGE);
            for (Contato c : aniversariantes) {
                JOptionPane.showMessageDialog(janelaPrincipal, c.toString(), "Procurar", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal, "Não foi encontrado nenhum aniversariante nesta data", "Procurar", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
