package br.ufpb.dcx.romildo.agenda.gui;

import br.ufpb.dcx.romildo.agenda.controller.*;
import br.ufpb.dcx.romildo.agenda.*;

import javax.swing.*;
import java.awt.*;

public class AgendaGUI3 extends JFrame {

    JLabel linha1, linha2;
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    ImageIcon bdayImg = new ImageIcon("./imgs/ballons.jpg");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add_person.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/search_person.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_person.png");
    Agenda agenda = new AgendaAyla();

    public AgendaGUI3() {
        setTitle("Agenda de Aniversários");
        setSize(1080,720);

        Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int larguraTela = dimensaoTela.width;
        int alturaTela = dimensaoTela.height;

        int x = (larguraTela - getWidth()) / 2;
        int y = (alturaTela - getHeight()) / 2;

        setLocation(x, y);
        setResizable(false);
        getContentPane().setBackground(Color.white);

        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        linha2 = new JLabel(bdayImg, JLabel.CENTER);

        botaoAdicionar = new JButton("Adicionar", addImg);
        botaoAdicionar.addActionListener(new AgendaAddController(agenda, this));
        botaoPesquisar = new JButton("Pesquisar", pesqImg);
        botaoPesquisar.addActionListener(new AgendaSearchController(agenda, this));
        botaoRemover = new JButton("Remover", removeImg);
        botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));
        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoRemover);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
