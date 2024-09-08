package br.ufpb.dcx.romildo.agenda.gui;

import br.ufpb.dcx.romildo.agenda.Agenda;
import br.ufpb.dcx.romildo.agenda.AgendaAyla;
import br.ufpb.dcx.romildo.agenda.controller.AgendaAddController;
import br.ufpb.dcx.romildo.agenda.controller.AgendaRemoveController;
import br.ufpb.dcx.romildo.agenda.controller.AgendaSearchController;

import javax.swing.*;
import java.awt.*;
public class AgendaGUI3_Menu extends JFrame {

    JLabel linha1, linha2;
    ImageIcon ballonsImg = new ImageIcon("./imgs/ballons.jpg");
    Agenda agenda = new AgendaAyla();
    JMenuBar barraDeMenu = new JMenuBar();

    public AgendaGUI3_Menu() {

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
        linha2 = new JLabel(ballonsImg, JLabel.CENTER);
        setLayout(new GridLayout(3,1));

        add(linha1);
        add(linha2);
        add(new JLabel());

        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem menuCadastrarAniversariante = new JMenuItem("Cadastrar Aniversariante");
        menuCadastrar.add(menuCadastrarAniversariante);

        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem menuPesquisarAniversariante = new JMenuItem("Pesquisar Aniversariante");
        menuPesquisar.add(menuPesquisarAniversariante);

        JMenu menuRemover = new JMenu("Remover");
        JMenuItem menuRemoverAniversariante = new JMenuItem("Remover Aniversariante");
        menuRemover.add(menuRemoverAniversariante);

        menuRemover.add(menuRemoverAniversariante);
        menuPesquisarAniversariante.addActionListener(new AgendaSearchController(agenda,this));
        menuRemoverAniversariante.addActionListener(new AgendaRemoveController(agenda, this));
        menuCadastrarAniversariante.addActionListener(
                (ae) -> {
                    String nome = JOptionPane.showInputDialog(this,
                            "Qual o nome do aniversariante?");
                    int dia = Integer.parseInt(JOptionPane.showInputDialog(this,
                            "Qual o dia do mês em que nasceu? [1-31]"));
                    int mes = Integer.parseInt(JOptionPane.showInputDialog(this,
                            "Qual o mês em que nasceu?[1-12]"));
                    boolean cadastrou = agenda.cadastraContato(nome, dia, mes);
                    if (cadastrou) {
                        JOptionPane.showMessageDialog(this,
                                "Aniversariante cadastrado");
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Aniversariante não foi cadastrado. " +
                                        "Verifique se já não existia");
                    }
                });
        barraDeMenu.add(menuCadastrar);
        barraDeMenu.add(menuPesquisar);
        barraDeMenu.add(menuRemover);
        setJMenuBar(barraDeMenu);

    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI3_Menu();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
