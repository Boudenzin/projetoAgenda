package br.ufpb.dcx.romildo.agenda.gui;
import javax.swing.JFrame;
import java.awt.*;

public class AgendaGUI2 extends JFrame {
    public AgendaGUI2() {

        setTitle("Agenda de Aniversários");
        setSize(626,376);
        // Obtém as dimensões da tela
        Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int larguraTela = dimensaoTela.width;
        int alturaTela = dimensaoTela.height;

        // Calcula a posição x e y para centralizar a janela
        int x = (larguraTela - getWidth()) / 2;
        int y = (alturaTela - getHeight()) / 2;

        setLocation(x, y);
        setResizable(false);
        getContentPane().setBackground(Color.lightGray);

    }
}
