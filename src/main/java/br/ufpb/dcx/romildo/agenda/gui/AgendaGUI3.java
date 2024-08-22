package br.ufpb.dcx.romildo.agenda.gui;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class AgendaGUI3 extends JFrame {

    JLabel linha1, linha2;

    ImageIcon bdayImg = new ImageIcon("./imgs/ballons.jpg");

    public AgendaGUI3() {
        setTitle("Agenda de Aniversários");
        setSize(626,376);

        Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int larguraTela = dimensaoTela.width;
        int alturaTela = dimensaoTela.height;

        int x = (larguraTela - getWidth()) / 2;
        int y = (alturaTela - getHeight()) / 2;

        setLocation(x, y);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        getContentPane().setLayout(new BorderLayout());
        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha2 = new JLabel(bdayImg);
        linha2.setVerticalAlignment(JLabel.TOP);
        linha2.setHorizontalAlignment(JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Raleway", Font.BOLD, 24));
        linha2 = new JLabel(bdayImg, JLabel.CENTER);
        //getContentPane().setLayout(new GridLayout(3, 1));
        getContentPane().add(linha1, BorderLayout.NORTH);
        getContentPane().add(linha2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
