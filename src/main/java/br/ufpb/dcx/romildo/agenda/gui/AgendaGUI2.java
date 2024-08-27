package br.ufpb.dcx.romildo.agenda.gui;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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

    public static void main(String[] args) {
        JFrame janela2 = new AgendaGUI2();
        janela2.setVisible(true);

        WindowListener fechadorDeJanelaSecundaria = new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }
        };
        janela2.addWindowListener(fechadorDeJanelaSecundaria);

    }
}
