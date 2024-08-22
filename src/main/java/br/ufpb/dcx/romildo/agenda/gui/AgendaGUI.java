package br.ufpb.dcx.romildo.agenda.gui;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGUI extends JFrame {
    public AgendaGUI() {

        setTitle("Agenda de Aniversários");
        setSize(800,400); // Dobro do atual
        setLocation(800, 500); //Talvez precise ser o dobro
        setResizable(false);
        getContentPane().setBackground(Color.lightGray);

    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
